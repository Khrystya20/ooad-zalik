package com.example.InvoicePayment.services;

import com.example.InvoicePayment.models.User;

public interface UserService {

    // отримати користувача за userId
    User getUserById(Long userId);

    // створити користувача
    User createUser(User user);

    // оновити користувача
    User updateUser(User user);
}
