package AB_30.PizzaBringDienst;

public class Pizza {

    private String name;
    private float preis;

    public Pizza(String name, float preis) {
        this.name = name;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public float getPreis() {
        return preis;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }
}
