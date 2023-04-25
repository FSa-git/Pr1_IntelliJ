package AB_30.Schulverwaltung;

import java.util.Scanner;

public class SchulTester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Willkommen! \n Erstelle einen Charakter");

        String i = sc.next();

        if (i.equals("Tobi")){
            Schueler Tobi = new Schueler("Tobias",18,13,560);

            System.out.println(Tobi.alter + ", Klassenstufe: "+ Tobi.getKlassenstufe());
        }

        sc.close();

    }
}
