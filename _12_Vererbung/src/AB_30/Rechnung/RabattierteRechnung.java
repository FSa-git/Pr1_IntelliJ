package AB_30.Rechnung;

public class RabattierteRechnung extends Rechnung{

    private double rabatt;

    public RabattierteRechnung(double rabatt, double gesamtbetrag, double mehrwertsteuer){
        super(gesamtbetrag, mehrwertsteuer);
        this.rabatt = rabatt;
    }

    protected double bruttobetragBerechnen(){
        double betrag = 0;
        betrag = this.gesamtbetrag + this.gesamtbetrag * this.mehrwertsteuer;
        return betrag;
    }

}
