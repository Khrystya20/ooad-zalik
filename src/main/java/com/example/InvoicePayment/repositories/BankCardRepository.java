package com.example.InvoicePayment.repositories;

import com.example.InvoicePayment.models.BankCard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankCardRepository extends MongoRepository<BankCard, Long> {
}