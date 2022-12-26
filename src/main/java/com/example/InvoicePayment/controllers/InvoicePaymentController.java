package com.example.InvoicePayment.controllers;

import com.example.InvoicePayment.handlers.InvoicePaymentHandler;
import com.example.InvoicePayment.models.Invoice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/payment")
public class InvoicePaymentController {
    private final InvoicePaymentHandler invoicePaymentHandler;

    public InvoicePaymentController(InvoicePaymentHandler invoicePaymentHandler) {
        this.invoicePaymentHandler = invoicePaymentHandler;
    }

    @PutMapping("/{invoiceId}")
    public Invoice payInvoice(@PathVariable Long invoiceId) throws Exception {
        // якщо у користувача спосіб оплати автоматичний, то списати кошти з картки через платіжний сервіс
        // при невдачі автоматичної оплати відбувається декілька повторних спроб з інтервалом в день
        // if(user.getPaymentMode() == PaymentMode.AUTOMATIC)
        Invoice paidInvoice = invoicePaymentHandler.pay(invoiceId);
        return paidInvoice;
    }

}