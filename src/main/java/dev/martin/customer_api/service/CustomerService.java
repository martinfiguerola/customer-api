package dev.martin.customer_api.service;

import dev.martin.customer_api.dto.CustomerDTO;
import dev.martin.customer_api.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll ();
}
