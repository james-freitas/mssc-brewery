package com.codeonblue.msscbrewery.web.services;

import com.codeonblue.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
