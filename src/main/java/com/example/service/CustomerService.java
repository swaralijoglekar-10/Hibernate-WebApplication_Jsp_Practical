package com.example.service;

import com.example.dao.CustomerDAO;
import com.example.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Transactional
    public void saveCustomer(Customer customer) {
        customerDAO.save(customer);
    }

    @Transactional
    public Customer getCustomer(int id) {
        return customerDAO.get(id);
    }
}