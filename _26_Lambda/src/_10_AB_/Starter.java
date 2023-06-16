package _10_AB_;

import jdk.jshell.PersistentSnippet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Starter {

    public static void main(String[] args) {

        // Variable
        int vergleichs_Alter = 40;

        // roster bzw. Personen Liste
        List <Person> personenListe  = new ArrayList<>(); // Warum gehts? Oberklasse und dann Unterklasse

        Person p1 = new Person("Tip", Person.Sex.MALE);
        Person p2 = new Person("Trick", Person.Sex.DIVERS);
        Person p3 = new Person("Daysi", Person.Sex.FEMALE);

        personenListe.add(p1);
        personenListe.add(p2);
        personenListe.add(p3);

        p1.setAge(12);
        p2.setAge(11);
        p3.setAge(41);

        // Reihenfolge funktioniert, da wir eine Referenz haben. Wir übergeben nur die Adresse. Dadurch gibt es keine Probleme

        Person.printPersonOlderThan(personenListe, vergleichs_Alter);

        // Geburtstag setzen
        p1.setBirthday((LocalDate.of(2010,12,2)) );


    }

}
