package com.example.InvoicePayment.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class BankCard {
    private Long number; // номер банківської картки
    private Integer cvc; // код перевірки картки
    private Date expDate; // дата кінця дії картки
}
