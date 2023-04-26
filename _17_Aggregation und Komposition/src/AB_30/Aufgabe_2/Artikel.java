package AB_30.Aufgabe_2;

public class Artikel {

    private String name;
    private String code;
    private int bestand;
    private double preis;

    public Artikel(String name, String code, int bestand, double preis) {
        this.name = name;
        this.code = code;
        this.bestand = bestand;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getBestand() {
        return bestand;
    }

    public void setBestand(int bestand) {
        this.bestand = bestand;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public void kaufen(int b){
    }
}
