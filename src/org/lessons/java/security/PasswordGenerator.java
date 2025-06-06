package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Inserisci il tuo nome:");
            String firstName = input.nextLine();

            System.out.println("Inserisci il tuo cognome:");
            String lastName = input.nextLine();

            System.out.println("Inserisci il tuo colore preferito:");
            String color = input.nextLine();

            System.out.println("Inserisci il tuo giorno di nascita:");
            int day = input.nextInt();
            input.nextLine(); // serve dopo i nextInt() nel caso un cui volessimo mettere un nextLine(), senza
                              // di questo verrebbe letta direttamente stringa vuota e non si avrebbe la
                              // possibilita di inserire il valore pe la nextLine()

            System.out.println("Inserisci il tuo mese di nascita");
            int month = input.nextInt();
            input.nextLine();

            System.out.println("Inserisci il tuo anno di nascita");
            int year = input.nextInt();
            input.nextLine();

            String generatedPsw = firstName.replaceAll(" ", "-") + "-"
                    + lastName.replaceAll(" ", "-")
                    + "-" + color.toLowerCase().replaceAll(" ", "-") + "-" + (day + month + year);

            System.out.println("La tua password supersicura e':" + generatedPsw);
        }
    }

}
