package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*** Benvenuto nella tua banca vera ***");
        System.out.print("Inserisci il tuo nome: ");
        Account account1 = new Account();
        account1.setName(scan.nextLine());

        account1.addAmount(1000.50);


        System.out.println("Numero conto: " + account1.getAccountNumber());
        System.out.println("Nome correntista: " + account1.getName());
        System.out.println("Saldo corrente: " + account1.getBalance());
        System.out.println(account1.takingAmount(1002.5));

    }
}
