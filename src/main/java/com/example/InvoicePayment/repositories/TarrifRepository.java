package com.example.InvoicePayment.repositories;

import com.example.InvoicePayment.models.Tarrif;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarrifRepository extends MongoRepository<Tarrif, Long> {
}