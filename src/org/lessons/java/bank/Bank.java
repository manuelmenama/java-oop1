package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        int choise;
        double amount;

        DecimalFormat decimalFormat = new DecimalFormat("0.00 €");


        Scanner scan = new Scanner(System.in);
        System.out.println("*** Benvenuto nella tua banca vera ***");
        System.out.print("Inserisci il tuo nome: ");
        Account account1 = new Account(scan.nextLine());
        //account1.setName();


        System.out.println("*** Riepilogo dei tuoi dati ***");
        System.out.println("Numero conto: " + account1.getAccountNumber());
        System.out.println("Nome correntista: " + account1.getName());
        System.out.println("Saldo corrente: " + decimalFormat.format(account1.getBalance()));
        do {
            System.out.println("**********");
            System.out.println("Digita: 1 - per versare; 2 - per prelevare; qualsiasi tasto - per uscire");
            choise = Integer.parseInt(scan.nextLine());
            System.out.println("*** Hai digitato: " + choise + " ***");
            if (choise == 1) {
                System.out.print("Digita la quantità da versare: ");
                amount = Double.parseDouble(scan.nextLine());
                account1.addAmount(amount);
                System.out.println("Nuovo saldo: " + decimalFormat.format(account1.getBalance()));
            } else if (choise == 2) {
                System.out.print("Digita la quantità da prelevare: ");
                amount = Double.parseDouble(scan.nextLine());
                System.out.println(account1.takingAmount(amount));
                System.out.println("Nuovo saldo: " + decimalFormat.format(account1.getBalance()));
            }else {
                System.out.println("Arrivederci!");
            }

        } while (choise == 1 || choise == 2);

        scan.close();

    }
}
