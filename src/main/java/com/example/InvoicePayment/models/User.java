package com.example.InvoicePayment.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private Long id; // id користувача
    private Tarrif tarrif; // обраний тариф
    private PaymentMode paymentMode; // спосіб оплати
    private PaymentPeriod paymentPeriod; // період оплати
    private BankCard bankCard; // дані банківської карти
    private Boolean isBlocked; // чи заблокований користувач через несплату рахунків
}
