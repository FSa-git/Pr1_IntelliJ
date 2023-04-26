package AB_10.Aufgabe_2;

public class NuetzlicheFunktionen {

    // liefert ein "kleinstes" (auf der Basis der
    // Vergleichbar-Implementierung!) Element des Parameter-Arrays
    // Achtung: Man kann davon ausgehen, dass das Parameter-Array
    // mindestens 1 Element enthaelt
    public static Vergleichbar kleinstesElement(Vergleichbar[] elemente) {

        // Vergleichbar heißt hier unser Datentyp
        Vergleichbar gefundenes_ergebnis = elemente[0];


        // todo, hier wollen wir das kleinste Element finden

        for (int i = 1; i < elemente.length; i++) {
            if(gefundenes_ergebnis.vergleichenMit(elemente[i]) < 0) { // Falls -1 ist das aufgerufene Objekt kleiner als das andere, bei beiden Objekte gleich = 0, bei +1 ist es größer
                // Wenn es kleiner ist, dann muss das, das neue element sein
                gefundenes_ergebnis = elemente[i];
            }

        }
        return gefundenes_ergebnis;

    }
}
