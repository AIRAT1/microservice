package de.microservice.service;

import de.microservice.model.CustomerDto;

public interface CustomerService {
    void addCustomer(int id, String name);
    CustomerDto getCustomer(int id);
}
