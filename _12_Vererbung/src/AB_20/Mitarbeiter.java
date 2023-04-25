package AB_20;

public class Mitarbeiter {

    protected String name;
    protected String vorname;
    protected int gehalt;

    public Mitarbeiter(String name, String vorname, int gehalt) {
        this.name = name;
        this.vorname = vorname;
        this.gehalt = gehalt;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public int getGehalt() {
        return gehalt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setGehalt(int gehalt) {
        this.gehalt = gehalt;
    }
}
