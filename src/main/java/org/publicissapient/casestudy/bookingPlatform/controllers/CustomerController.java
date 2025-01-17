package org.publicissapient.casestudy.bookingPlatform.controllers;

import org.publicissapient.casestudy.bookingPlatform.entities.Customer;
import org.publicissapient.casestudy.bookingPlatform.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save_new_customer")
    public ResponseEntity<?> saveCustomerDetails(@RequestBody Customer customer){
        try{
            customerService.saveCustomer(customer);
            return new ResponseEntity<>(customer,HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>("Kindly give sufficient details of custoemr", HttpStatus.BAD_REQUEST);
        }

    }


}
