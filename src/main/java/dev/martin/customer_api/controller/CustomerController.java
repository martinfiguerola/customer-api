package dev.martin.customer_api.controller;

import dev.martin.customer_api.entity.Customer;
import dev.martin.customer_api.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    // Build Get Customers REST API
    @GetMapping
    public ResponseEntity<List<Customer>> getAll () {
        return ResponseEntity.ok(service.findAll());
    }
}
