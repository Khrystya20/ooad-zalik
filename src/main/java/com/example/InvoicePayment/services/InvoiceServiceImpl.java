package com.example.InvoicePayment.services;

import com.example.InvoicePayment.models.Invoice;
import com.example.InvoicePayment.repositories.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    private InvoiceRepository invoiceRepository;

    // з бази даних отримати рахунок за id
    @Override
    public Invoice getInvoiceById(Long invoiceId) {
        return null;
    }

    // створити й зберегти новий рахунок в базі даних
    @Override
    public Invoice createInvoice(Invoice invoice) {
        return null;
    }

    // оновити дані про рахунок в базі даних
    @Override
    public Invoice updateInvoice(Invoice invoice) {
        return null;
    }

    // отримати усі рахунки користувача з userId
    @Override
    public List<Invoice> getUserInvoices(Long userId) {
        return new ArrayList<>();
    }
    // отримати кількість несплачених рахунків користувача з userId
    @Override
    public int getQuantityOfUnpaidInvoices(Long userId) {
        return 0;
    }
}
