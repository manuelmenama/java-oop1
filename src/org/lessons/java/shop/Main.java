package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        //creazione di una maglietta
        Product product1 = new Product();

        product1.setName("Maglietta");
        product1.setDescription("Questa è una maglietta gialla, molto bella!");
        product1.setPrice(2.55);

        //stampa senza metodo
        System.out.println("*** Benvenuto nello shop ***");
        System.out.println("Codice identificativo: " + product1.getCodeName());
        System.out.println("Il prodotto è: " + product1.getName());
        System.out.println("Descrizione: " + product1.getDescription());
        System.out.println("Prezzo (IVA escl.): " + product1.getPriceFormatted());
        System.out.println("Prezzo finale: " + product1.getPriceWithVat());


    }
}
