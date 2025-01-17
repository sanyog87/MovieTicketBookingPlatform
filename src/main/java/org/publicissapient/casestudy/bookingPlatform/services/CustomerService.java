package org.publicissapient.casestudy.bookingPlatform.services;

import org.bson.types.ObjectId;
import org.publicissapient.casestudy.bookingPlatform.entities.Customer;
import org.publicissapient.casestudy.bookingPlatform.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}
