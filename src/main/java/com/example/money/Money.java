package com.example.money;

import com.example.printer.Printer;

public class Money {

    private String currency;
    private String amount;

    public Money(String currency, String amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void print(Printer p) {
        p.print(currency);
        p.print(amount);
    }

}
