package com.example.InvoicePayment.handlers;

import com.example.InvoicePayment.models.Invoice;
import com.example.InvoicePayment.models.User;
import com.example.InvoicePayment.services.InvoicePaymentService;
import com.example.InvoicePayment.services.InvoiceService;

import java.util.Date;

public class InvoicePaymentHandler {

    private final InvoicePaymentService invoicePaymentService;
    private final InvoiceService invoiceService;
    private final UserHandler userHandler;

    public InvoicePaymentHandler(InvoicePaymentService invoicePaymentService, InvoiceService invoiceService, UserHandler userHandler) {
        this.invoicePaymentService = invoicePaymentService;
        this.invoiceService = invoiceService;
        this.userHandler = userHandler;
    }

    // при автоматичній оплаті відбувається спроба списання коштів із картки через платіжний сервіс
    public Invoice pay(Long invoiceId) {
        Invoice invoice = invoiceService.getInvoiceById(invoiceId);
        User user = invoice.getUser();
        // спробувати провести оплату рахунка
        boolean payment = invoicePaymentService.isPaymentSuccessful(user.getId(), invoice.getCost());
        if (payment) { // якщо оплата пройшла успішно
            Date currentDate = new Date();
            invoice.setDatePaid(currentDate); // встановити поточну дату оплати
            invoice.setPaid(true); // встановити рахунок як оплачений
            if(user.getIsBlocked()) userHandler.unblockServiceForUser(user.getId()); // розблокувати сервіс для заблокованого користувача, якщо він оплатив рахунок
            return invoiceService.updateInvoice(invoice);
        } else { // якщо оплата не пройшла
            // протягом заданого часу відбувається блокування сервісу для користувача
            userHandler.blockServiceForUser(user.getId());
            return invoice;
        }
    }


}
