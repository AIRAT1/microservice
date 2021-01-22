package de.microservice.service.impl;

import de.microservice.model.CustomerDto;
import de.microservice.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerServiceInMemoryImpl implements CustomerService {
    private Map<Integer, CustomerDto> persist = new HashMap<>();

    @Override
    public void addCustomer(int id, String name) {
        persist.put(id, new CustomerDto(id, name));
    }

    @Override
    public CustomerDto getCustomer(int id) {
        return persist.get(id);
    }
}
