package com.initial.initial.dto;

import com.initial.initial.model.Account;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class AccountDtoConverter {
    private final CustomerDtoConverter customerConverter;
    private final TransactionDtoConverter transactionConverter;

    public AccountDtoConverter(CustomerDtoConverter customerConverter, TransactionDtoConverter transactionConverter) {
        this.customerConverter = customerConverter;
        this.transactionConverter = transactionConverter;
    }


    public AccountDto converter(Account from){
        return new AccountDto(
                from.getId(), from.getBalance(),from.getCreationDate(),
                customerConverter.convertToAccountCustomer(from.getCustomer()),
                Objects.requireNonNull(from.getTransaction()
                        .stream()
                        .map(transactionConverter::convert)
                        .collect(Collectors.toSet())));
    }
}
