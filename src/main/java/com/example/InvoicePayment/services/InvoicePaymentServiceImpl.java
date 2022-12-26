package com.example.InvoicePayment.services;

import org.springframework.stereotype.Service;

@Service
public class InvoicePaymentServiceImpl implements InvoicePaymentService {

    // спробувати здійснити оплату рахунку кількістю грошей cost користувачем з userId
    // якщо оплата пройшла успішно, повернути true
    @Override
    public boolean isPaymentSuccessful(Long userId, double cost) {
        return true;
    }

}
