package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 25/09/2014.
 */

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {


    private  CustomerRepository customerRepository;

    public CustomerServiceImpl() {
    }

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll()
    {
        return customerRepository.findAll();
    }
}
