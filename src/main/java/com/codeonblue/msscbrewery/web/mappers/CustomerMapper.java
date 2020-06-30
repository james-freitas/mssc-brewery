package com.codeonblue.msscbrewery.web.mappers;

import com.codeonblue.msscbrewery.domain.Customer;
import com.codeonblue.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto dto);
}
