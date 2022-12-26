package com.example.InvoicePayment.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Invoice {
    private Long id; // id рахунку
    private double cost; // вартість
    private Date dateCreated; // дата створення рахунку
    private Date datePaid; // дата оплати рахунку
    private User user; // користувач
    private boolean isPaid; // чи оплачено рахунок
}