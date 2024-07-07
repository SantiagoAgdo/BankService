package com.payu.bank.controller;

import com.payu.bank.dto.CreditCardTransaction;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankService {
    @PostMapping("/process")
    public String process(@RequestBody CreditCardTransaction transaction) {
        if (transaction.getTransactionType() == null){
            return "FAILED";
        }
        return "SUCCESS";
    }
}
