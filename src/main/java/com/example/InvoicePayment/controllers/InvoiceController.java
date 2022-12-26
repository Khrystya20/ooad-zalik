package com.example.InvoicePayment.controllers;

import com.example.InvoicePayment.handlers.InvoiceHandler;
import com.example.InvoicePayment.models.Invoice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/api/invoices")
@RequiredArgsConstructor
public class InvoiceController {

    private final InvoiceHandler invoiceHandler;

    // для користувача в залежності від обраного періоду оплати у відповідний день місяця/року формується рахунок згідно з обраним тарифом
    @PostMapping
    public Invoice createInvoice(/*дані для створення нового рахунка*/) {
        // invoiceHandler.creationOfUserInvoice(/*дані для створення нового рахунка*/);
        return null;
    }

    // отримати усі рахунки користувача
    @GetMapping("/{user_id}")
    public List<Invoice> getUserInvoices(@RequestParam("user_id") Long userId){
        List<Invoice> invoices = invoiceHandler.getUserInvoices(userId);
        return invoices;
    }

}
