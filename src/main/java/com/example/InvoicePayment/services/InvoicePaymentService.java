package com.example.InvoicePayment.services;

public interface InvoicePaymentService {

    // спробувати здійснити оплату рахунку кількістю грошей cost користувачем з userId
    // якщо оплата пройшла успішно, повернути true
    boolean isPaymentSuccessful(Long userId, double cost);

}