package org.lessons.java.bank;

import java.util.Random;

public class Account {
    //CAMPI
    private final int accountNumber;

    private String name;

    private double balance;

    //COSTRUTTORI
    Account() {
        Random random = new Random();
        accountNumber = random.nextInt(1, 1000000);
    }

    //GETTER E SETTER
    //getter


    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    //setter

    public void setName(String name) {
        this.name = name;
    }

    //METODI
    public void addAmount(double amount) {

        this.balance += amount;
    }

    public void takingAmount(double amount) {

        this.balance -= amount;
    }
}
