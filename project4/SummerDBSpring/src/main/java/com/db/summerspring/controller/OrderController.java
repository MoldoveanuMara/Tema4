package com.db.summerspring.controller;

import com.db.summerspring.model.Order;
import com.db.summerspring.repository.OrderRepository;
import com.db.summerspring.service.ValidityChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
   OrderRepository orderRepository;
    ValidityChecker validityChecker;


   @Autowired
    public OrderController (OrderRepository orderRepository, ValidityChecker validityChecker) {
        this.orderRepository = orderRepository;
        this.validityChecker = validityChecker;
 }


}
