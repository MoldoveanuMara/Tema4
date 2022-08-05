package com.db.summerspring.service;

import com.db.summerspring.model.Customer;
import com.db.summerspring.repository.CustomerRepository;
import com.db.summerspring.repository.OrderRepository;
import com.db.summerspring.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidityChecker {
    CustomerRepository customerRepository;
    PaymentRepository paymentRepository;
    OrderRepository orderRepository;

    @Autowired
    public ValidityChecker(CustomerRepository customerRepository, PaymentRepository paymentRepository, OrderRepository orderRepository) {
        this.customerRepository = customerRepository;
        this.paymentRepository = paymentRepository;
        this.orderRepository = orderRepository;
    }

    public boolean isNewCustomerValid(Customer customer) {
         return customerRepository.countByUsernameOrPhone(customer.getUsername(), customer.getPhone()) == 0;
    }


}
