package com.example.InvoicePayment.services;

import com.example.InvoicePayment.models.User;
import com.example.InvoicePayment.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    // з бази даних отримати користувача за userId
    @Override
    public User getUserById(Long userId) {
        return null;
    }

    // створити й зберегти нового користувача в базі даних
    @Override
    public User createUser(User user) {
        return null;
    }

    // оновити дані про користувача в базі даних
    @Override
    public User updateUser(User user) {
        return null;
    }
}
