package Override;

public class GiroKonto extends Bankkonto{

    private double gebuehr;

    public GiroKonto(double anfangsBetrag, double gebuehr){
        super(anfangsBetrag);
        this.gebuehr = gebuehr;
    }

    @Override
    public void einzahlen(double x) {
        this.kontoStand = gebuehr;
    }

    @Override
    public void abheben(double x) {
        this.kontoStand = this.kontoStand + x - gebuehr;
    }
}
