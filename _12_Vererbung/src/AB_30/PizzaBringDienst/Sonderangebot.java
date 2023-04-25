package AB_30.PizzaBringDienst;

public class Sonderangebot extends Pizza{

    private float rabatt = 25;

    public Sonderangebot(String name, float preis, float rabatt) {
        super(name, preis);
        this.rabatt = rabatt;
    }

    public void setRabatt(float rabatt) {
        this.rabatt = rabatt;
    }

    public float getRabatt() {
        return rabatt;
    }
}
