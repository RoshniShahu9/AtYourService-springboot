package com.example.service;

import com.example.entity.Customer;

import java.util.List;

public interface CustomerService {
	
    public List<Customer> getAllCustomers();
    
    public Customer getCustomerById(int id);
    
    public Customer saveCustomer(Customer customer);
    
    public void deleteCustomer(int id);
}
