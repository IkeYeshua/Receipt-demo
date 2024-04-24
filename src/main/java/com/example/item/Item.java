package com.example.item;

import com.example.itemformat.ItemFormat;
import com.example.money.Money;
import com.example.printer.Printer;


public class Item {
    private final String description;
    private final Money price;

    public Item(String description, Money price) {
        this.description = description;
        this.price = price;
    }

    public void print(Printer p){
        new ItemFormat(description, price).print(p);
    }


}
