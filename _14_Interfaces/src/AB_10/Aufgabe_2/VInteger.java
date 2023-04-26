package AB_10.Aufgabe_2;

public class VInteger extends Integer implements Vergleichbar{

    public VInteger(int w) {
        super(w);
    }

    @Override
    public int vergleichenMit(Vergleichbar obj) {
        return 0;
    }
}
