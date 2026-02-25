package com.example.demo.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayementController {

    private final PayementService paymentService;

    @Autowired
    public PayementController(PayementService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/task4.3")
    public String doPayment() {
        return paymentService.pay();
    }
}