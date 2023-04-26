package AB_10.Aufgabe_1;

public class Person implements NachrichtenEmpfaenger{

    private String Nachname;
    private String Vorname;

    public Person(String nachname, String vorname) {
        Nachname = nachname;
        Vorname = vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    @Override
    public void empfangeNachricht(String nachricht) {
        System.out.println(Vorname + " " + Nachname + " empfaengt Nachricht: " + nachricht);

    }
}