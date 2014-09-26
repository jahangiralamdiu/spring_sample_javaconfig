package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 25/09/2014.
 */

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll()
    {
        List<Customer> customers=new ArrayList<Customer>();

        Customer customer = new Customer();

        customer.setFirstName("Jahangir");

        customer.setLastName("Alam");

        customers.add(customer);

        return customers;
    }
}
