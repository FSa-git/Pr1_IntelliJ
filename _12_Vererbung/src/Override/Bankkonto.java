package Override;

public abstract class Bankkonto {

    protected double kontoStand;

    public Bankkonto(double anfangsBetrag){
        this.kontoStand = anfangsBetrag;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    /**
     * Methode um Geld einzuzahlen (abstrakt)
     *
     */
    public abstract void einzahlen(double x);

    /*
    * Methode um Geld abzuheben (abstrakt)
    *
    * */
    public abstract void abheben(double x);
}
