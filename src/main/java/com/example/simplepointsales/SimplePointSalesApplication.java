package com.example.simplepointsales;


import com.example.money.Money;
import com.example.printer.Printer;
import com.example.receipt.Receipt;

public class SimplePointSalesApplication {

    public static void main(String[] args) {
       SimplePointSalesApplication simplePointSalesApplication = new SimplePointSalesApplication();
       simplePointSalesApplication.run();

    }


        private void run() {
            Receipt receipt = new Receipt(new Printer());
            receipt.add("Bread", new Money("Naira", "500.00"));
            receipt.add("Tiger Bread", new Money("naira", "1000.00"));
            receipt.add("Carriot", new Money("naira", "900.00"));
            receipt.print();
        }


    }
