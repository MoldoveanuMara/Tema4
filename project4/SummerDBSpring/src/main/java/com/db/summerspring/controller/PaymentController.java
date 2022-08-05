package com.db.summerspring.controller;

import com.db.summerspring.model.Customer;
import com.db.summerspring.model.Payment;
import com.db.summerspring.repository.PaymentRepository;
import com.db.summerspring.service.ValidityChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    PaymentRepository paymentRepository;
    ValidityChecker validityChecker;

    @Autowired
    public PaymentController (PaymentRepository paymentRepository, ValidityChecker validityChecker) {
        this.paymentRepository = paymentRepository;
        this.validityChecker = validityChecker;
    }


    @ResponseBody
    @GetMapping("/get")
    public Payment getPaymentByDate (@RequestParam (name = "date")Date payment_date) {
        return paymentRepository.getByDate(payment_date);
    }

    @ResponseBody
    @PostMapping("/add")
    public void addPayment(@RequestBody Payment payment) {
        paymentRepository.insertPayment(payment);
    }



}
