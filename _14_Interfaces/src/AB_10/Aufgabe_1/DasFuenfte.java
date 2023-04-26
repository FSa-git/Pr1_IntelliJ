package AB_10.Aufgabe_1;

import java.util.Vector;

public class DasFuenfte implements Nachrichtenquelle{

    private String typ;
    private Vector vec = new Vector<Person>();

    public DasFuenfte ( String typ ) {
        this.typ = typ;
    }

    @Override
    public void anmelden ( NachrichtenEmpfaenger empf ) {
        vec.add(empf);
    }

    @Override
    public void abmelden ( NachrichtenEmpfaenger empf ) {
        vec.remove(empf);
    }

    @Override
    public void sendeNachricht ( String nachricht ) {
        for ( int i = 0; i < vec.size(); i++ ) {
            NachrichtenEmpfaenger ref = ( NachrichtenEmpfaenger ) vec.elementAt(i);
            ref.empfangeNachricht(nachricht);
        }
    }

}
