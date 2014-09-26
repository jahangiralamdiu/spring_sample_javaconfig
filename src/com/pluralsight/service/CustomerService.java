package com.pluralsight.service;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by lenovo on 25/09/2014.
 */
public interface CustomerService {
    List<Customer> findAll();
}
