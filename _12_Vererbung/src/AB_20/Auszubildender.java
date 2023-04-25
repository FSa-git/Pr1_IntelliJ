package AB_20;

public class Auszubildender extends Mitarbeiter{

    protected String azubiBeruf;
    protected int azubiJahr;

    public Auszubildender(String name, String vorname, int gehalt, String azubiBeruf, int azubiJahr) {
        super(name, vorname, gehalt);
        this.azubiBeruf = azubiBeruf;
        this.azubiJahr = azubiJahr;
    }

    public String getAzubiBeruf() {
        return azubiBeruf;
    }

    public int getAzubiJahr() {
        return azubiJahr;
    }

    public void setAzubiBeruf(String azubiBeruf) {
        this.azubiBeruf = azubiBeruf;
    }

    public void setAzubiJahr(int azubiJahr) {
        this.azubiJahr = azubiJahr;
    }
}
