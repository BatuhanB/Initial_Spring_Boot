package com.initial.initial.dto;

import com.initial.initial.model.Customer;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class CustomerDtoConverter {
    public AccountCustomerDto convertToAccountCustomer(Customer from){
        if (from == null){
            return new AccountCustomerDto("","","");
        }
            return new AccountCustomerDto(from.getId(), from.getName(), from.getSurname());
    }
}
