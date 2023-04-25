package AB_30.Schulverwaltung;

public class Lehrer extends Software{

    private String uFach;

    public Lehrer(String name, int alter, String uFach){
        super(name, alter);
        this.uFach = uFach;
    }

    public String getuFach() {
        return uFach;
    }

    public void setuFach(String uFach) {
        this.uFach = uFach;
    }
}
