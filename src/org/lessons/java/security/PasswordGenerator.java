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
            input.nextLine();

            System.out.println("Inserisci il tuo mese di nascita");
            int month = input.nextInt();
            input.nextLine();

            System.out.println("Inserisci il tuo anno di nascita");
            int year = input.nextInt();
            input.nextLine();

            System.out.println("La tua password supersicura e':" + firstName.toLowerCase().replaceAll(" ", "-") + "-"
                    + lastName.toLowerCase().replaceAll(" ", "-")
                    + "-" + color.toLowerCase().replaceAll(" ", "-") + "-" + (day + month + year));
        }
    }

}
