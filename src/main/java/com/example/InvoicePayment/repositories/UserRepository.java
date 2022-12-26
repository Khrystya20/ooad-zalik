package com.example.InvoicePayment.repositories;

import com.example.InvoicePayment.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends MongoRepository<User, Long> {
}