package AB_30.Aufgabe_1;

public abstract class Werkezug {

    private String art;
    protected int verschleiss = 0;

    public Werkezug(String art, int verschleiss){
        this.art = art;
        this.verschleiss = verschleiss;
    }

    public abstract void ausgeben();

}
