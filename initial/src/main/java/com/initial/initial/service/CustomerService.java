package com.initial.initial.service;

import com.initial.initial.exception.CustomerNotFoundException;
import com.initial.initial.model.Customer;
import com.initial.initial.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    protected Customer findCustomerById(String id){
        return repository.findById(id)
                .orElseThrow(()->
                        new CustomerNotFoundException("Customer could not find by id: " + id));
    }
}
