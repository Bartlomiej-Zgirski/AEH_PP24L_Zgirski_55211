package pl.pp;

import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args)   {

        //to jest komentarz liniowy
        Scanner scanner = new Scanner(System.in) ; {
        }

        /*
        To jest komentarz blokowy
        może on mieć wiele linii
        tak, jak tutaj
         */

        System.out.println ("Proszę podaj swoje imię:" );
        String forename = scanner.nextLine ();

        System.out.println ("Proszę podaj swoje nazwisko:");
        String surname = scanner.nextLine ();

        scanner.close();

        System.out.println("Witaj " + forename + " " + surname);
    }
}
