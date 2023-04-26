package AB_30.Aufgabe_1;

public class Bohrer extends Werkezug{

    private int groesse;

    public Bohrer(String art, int verschleiss, int groesse) {
        super(art, verschleiss);
        this.groesse = groesse;
    }

    @Override
    public void ausgeben() {

    }
}
