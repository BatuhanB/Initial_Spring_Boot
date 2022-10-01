package com.initial.initial.repository;

import com.initial.initial.dto.AccountDto;
import com.initial.initial.model.Account;
import com.initial.initial.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepository extends JpaRepository<Account,String> {

}