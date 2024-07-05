package com.payu.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCardTransaction {
    private Long id;
    private String cardNumber;
    private Double amount;
    private String status;
    private String transactionType;

}