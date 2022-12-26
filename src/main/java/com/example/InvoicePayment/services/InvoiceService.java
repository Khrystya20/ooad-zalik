package com.example.InvoicePayment.services;

import com.example.InvoicePayment.models.Invoice;

import java.util.List;

public interface InvoiceService {

    // отримати рахунок за id
    Invoice getInvoiceById(Long invoiceId);

    // створити рахунок
    Invoice createInvoice(Invoice invoice);

    // оновити рахунок
    Invoice updateInvoice(Invoice invoice);

    // отримати усі рахунки користувача з userId
    List<Invoice> getUserInvoices(Long userId);

    // отримати кількість несплачених рахунків користувача з userId
    int getQuantityOfUnpaidInvoices(Long userId);

}
