package com.example.InvoicePayment.handlers;

import com.example.InvoicePayment.models.User;
import com.example.InvoicePayment.services.InvoiceService;
import com.example.InvoicePayment.services.UserService;

public class UserHandler {
    private final UserService userService;
    private final InvoiceService invoiceService;

    // допустима кількість несплачених рахунків
    private final int ALLOWABLE_QTY_OF_UNPAID_INVOICES = 3;

    public UserHandler(UserService userService, InvoiceService invoiceService) {
        this.userService = userService;
        this.invoiceService = invoiceService;
    }

    // створення нового користувача
    public User createNewUser(/*дані для створення нового користувача*/) {
        // User user = new User(/*дані для створення нового користувача*/);
        // userService.createUser(user);
        return null;
    }

    // заблокувати сервіс для користувача з userId при перевищенні ним допустимої кількості несплачених рахунків протягом заданого часу
    public void blockServiceForUser(Long userId) {
        User user = userService.getUserById(userId);
        // врахувати, чи пройшов заданий період часу
        if ( invoiceService.getQuantityOfUnpaidInvoices(userId) > ALLOWABLE_QTY_OF_UNPAID_INVOICES) {
            user.setIsBlocked(true); // встановити блокування для користувача
            userService.updateUser(user);
        }
    }

    // розблокувати сервіс для користувача, якщо він не має несплачених рахунків або має менше/рівно допустимій кількості
    public void unblockServiceForUser(Long userId) {
        User user = userService.getUserById(userId);
        if (invoiceService.getQuantityOfUnpaidInvoices(userId) <= ALLOWABLE_QTY_OF_UNPAID_INVOICES) {
            user.setIsBlocked(false); // розблокувати користувача
            userService.updateUser(user);
        }
    }
}
