package AB_30.Schulverwaltung;

public class Schueler extends Software{

    private int klassenstufe;
    private int beitrag;


    public Schueler(String name, int alter, int klassenstufe, int beitrag) {
        super(name, alter);
        this.klassenstufe = klassenstufe;
        this.beitrag = beitrag;
    }

    public int getKlassenstufe() {
        return klassenstufe;
    }

    public void setKlassenstufe(int klassenstufe) {
        this.klassenstufe = klassenstufe;
    }

    public int getBeitrag() {
        return beitrag;
    }

    public void setBeitrag(int beitrag) {
        this.beitrag = beitrag;
    }
}
