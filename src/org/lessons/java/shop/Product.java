package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Product {
    //costanti
    /*
    * iva
    * */
    private static double vat = 0.2;

    //campi
    /*
    * codice
    * nome
    * descrizione
    * prezzo
    * */
    private final int code;
    private String name;
    private String description;
    private double price;

    //costruttori
    public Product() {
        Random rand = new Random();
        code = rand.nextInt(1,100000000);
    }

    //getter e setter
    //getter
    public int getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public static double getVat() {
        return vat;
    }


    //setter

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static void setVat(double vat) {
        Product.vat = vat;
    }

    //metodi

    public String getPriceWithVat () {
        DecimalFormat decimalFormat = new DecimalFormat("0.00 €");
        double totalPrice;
        totalPrice = price + price * vat;
        return decimalFormat.format(totalPrice);
    }

    public String getPriceFormatted () {
        DecimalFormat decimalFormat = new DecimalFormat("0.00 €");

        return decimalFormat.format(price);
    }

    public String getCodeName () {
        DecimalFormat decimalFormat = new DecimalFormat("000000000");

        return decimalFormat.format(code) + "-" + name.toLowerCase();
    }

}
