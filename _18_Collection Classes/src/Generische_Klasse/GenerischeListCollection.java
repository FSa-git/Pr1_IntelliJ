package Generische_Klasse;

import java.util.ArrayList;

public class GenerischeListCollection {
    public static void main(String[] args) {

        // Erzeugen einer StringList (ArrayList) mit dem Namen liste
        ArrayList<String> liste = new ArrayList<>();

        // Hinzufügen von String-Elementen der Liste
        liste.add("Peter");
        liste.add("Paul");

        System.out.println("Ausgabe der Liste");

        for (String element : liste){
            System.out.println(element);
        }
        // Ausgabe des Index von Paul
        System.out.println("Index von Peter: " + liste.indexOf("Peter"));

        // Einfügen von Hannah vor Peter
        liste.add(1,"Hannah");

        // Ausgabe der Liste
        for(String element : liste){
            System.out.println(element);
        }

    }

}
