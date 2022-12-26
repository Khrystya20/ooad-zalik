package com.example.InvoicePayment.repositories;

import com.example.InvoicePayment.models.Invoice;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface InvoiceRepository extends MongoRepository<Invoice, Long>{
}