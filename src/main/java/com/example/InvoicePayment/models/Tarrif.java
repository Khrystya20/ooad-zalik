package com.example.InvoicePayment.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Tarrif {
    private Long number; // номер тарифу
    private String name; // назва
    private double price; // ціна
}
