package _10_AB_;

import java.time.LocalDate;
import java.util.List;

public class Person {

    public enum Sex {MALE, FEMALE, DIVERS}

    private String name;
    private LocalDate birthday;
    private Sex gender;
    private String emailAdress;
    private int age; // Warum nicht implementieren? Es verändert sich, es steht hier als eigenschaft, nicht als Attribut


    // Konstruktor
    public Person(String name, Sex gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public int getAge() {

        // Durch Toms Hilfe
        /*
        int berechnetesAge;
        LocalDate heute = java.time.LocalDate.now();
        berechnetesAge = heute.getYear() - birthday.getYear();
        return berechnetesAge;
         */

        // Wellstein Variante
        age = LocalDate.now().getYear() - birthday.getYear();
        if (birthday.getDayOfYear() >= LocalDate.now().getDayOfYear()){
            age += 1;
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Funktion
    public static void printPersonOlderThan(List<Person> roster, int myAge){ // Generische Liste, bei Array ist es eine feste Länge, deswegen ist diese flexibler.

        for (Person p:roster){

            if (p.getAge() >= myAge){
                p.printPerson();
            }

        }

    }

    private void printPerson() {

        System.out.println("Name " + this.getName()); // Man kann diese Funktion überall verwendet

    }

    public static void printPersons(List <Person> roster, CheckPerson tester){
        for (Person p : roster){
            if (tester.test(p)){
                p.printPerson();
            }
        }
    }

}
