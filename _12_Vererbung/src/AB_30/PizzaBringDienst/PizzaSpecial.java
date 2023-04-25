package AB_30.PizzaBringDienst;

public class PizzaSpecial extends Pizza{

    private String saucentyp;
    private int schaerfegrad;


    public PizzaSpecial(String name, float preis, String saucentyp, int schaerfegrad) {
        super(name, preis);
        this.saucentyp = saucentyp;
        this.schaerfegrad = schaerfegrad;
    }

    public String getSaucentyp() {
        return saucentyp;
    }

    public void setSaucentyp(String saucentyp) {
        this.saucentyp = saucentyp;
    }

    public int getSchaerfegrad() {
        return schaerfegrad;
    }

    public void setSchaerfegrad(int schaerfegrad) {
        this.schaerfegrad = schaerfegrad;
    }
}
