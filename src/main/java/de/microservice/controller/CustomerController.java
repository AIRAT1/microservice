package de.microservice.controller;

import de.microservice.model.CustomerDto;
import de.microservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void addCustomer(@RequestParam int id, @RequestParam String name ) {
        customerService.addCustomer(id, name);
    }

    @GetMapping
    public CustomerDto getCustomer(@RequestParam int id) {
        return customerService.getCustomer(id);
    }
}
