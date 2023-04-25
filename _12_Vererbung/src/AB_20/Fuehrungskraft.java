package AB_20;

public class Fuehrungskraft extends Mitarbeiter{

    public String position;

    public Fuehrungskraft(String name, String vorname, int gehalt, String position) {
        super(name, vorname, gehalt);
        position = "a boss";
    }


}
