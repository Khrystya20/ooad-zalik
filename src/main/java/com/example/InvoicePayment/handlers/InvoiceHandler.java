package com.example.InvoicePayment.handlers;

import com.example.InvoicePayment.models.Invoice;
import com.example.InvoicePayment.models.User;
import com.example.InvoicePayment.services.InvoiceService;
import com.example.InvoicePayment.services.UserService;

import java.util.Date;
import java.util.List;

public class InvoiceHandler {

    private final UserService userService;
    private final InvoiceService invoiceService;

    public InvoiceHandler(UserService userService, InvoiceService invoiceService) {
        this.userService = userService;
        this.invoiceService = invoiceService;
    }

    // у відповідний день місяця/року формування рахунка користувача з userId
    // відповідно до обраних тарифу, періоду і способу оплати
    public Invoice creationOfUserInvoice(Long userId, Invoice invoiceData) {
        User user = userService.getUserById(userId);
        Date currentDate = new Date(); // поточна дата створення рахунка
        // invoiceService.createInvoice(); формування рахунка користувача user
        return null; // повернути створений рахунок
    }

    // отримати рахунок за id
    public Invoice getInvoiceById(Long invoiceId){
        return invoiceService.getInvoiceById(invoiceId);
    }

    // отримати усі рахунки користувача
    public List<Invoice> getUserInvoices(Long userId){
        return invoiceService.getUserInvoices(userId);
    }

}