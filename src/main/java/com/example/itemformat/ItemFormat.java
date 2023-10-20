package com.example.itemformat;

import com.example.item.Item;
import com.example.money.Money;
import com.example.printer.Printer;

public class ItemFormat {
    private Money price;
    private String description;

    public ItemFormat(String description, Money price) {
        this.price = price;
        this.description = description;
    }

    public void print(Printer p) {
        p.print(description);
        p.print(" ");
        price.print(p);
        p.newLine();
    }
}
