package com.example.InvoicePayment.controllers;

import com.example.InvoicePayment.handlers.UserHandler;
import com.example.InvoicePayment.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserHandler userHandler;

    // створити користувача відповідно до вказаних ним даних (тариф, спосіб, період оплати, дані банківської карти)
    @PostMapping
    public User createUser(/*дані для створення нового користувача*/) {
        // userHandler.createNewUser(/*дані для створення нового користувача*/);
        return null;
    }
}
