package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 25/09/2014.
 */

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${someProperty}")
    private String someValue;

    @Override
    public List<Customer> findAll()
    {
        List<Customer> customers=new ArrayList<Customer>();

        Customer customer = new Customer();

        customer.setFirstName(someValue);

        customer.setLastName("Alam");

        customers.add(customer);

        return customers;
    }
}
