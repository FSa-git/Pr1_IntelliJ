package Override;

public class Sparkonto extends Bankkonto{

    private double zinsSatz;

    public Sparkonto(double kontoStand, double zinsSatz){
        super(kontoStand);
        this.zinsSatz = zinsSatz;
    }

    /**
    * Zinsen auf Kontostand anrechnen lassen
    *
    */
    public void zinsenAnrechnen(){
        this.einzahlen(this.kontoStand *(this.zinsSatz/100));
    }

    @Override
    public void einzahlen (double x){
        this.kontoStand += x;
    }

    @Override
    public void abheben (double x){
        this.kontoStand -= x;
    }
}
