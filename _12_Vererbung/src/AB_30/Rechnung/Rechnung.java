package AB_30.Rechnung;

public class Rechnung {

    protected double gesamtbetrag;
    protected double mehrwertsteuer;

    public Rechnung(double gesamtbetrag, double mehrwertsteuer){
        this.gesamtbetrag = gesamtbetrag;
        this.mehrwertsteuer = mehrwertsteuer;
    }

    protected double bruttobetragBerechnen(){
        double ergebnis = 0;

        ergebnis = this.gesamtbetrag + this.gesamtbetrag * this.mehrwertsteuer;

        return ergebnis;
    }

}
