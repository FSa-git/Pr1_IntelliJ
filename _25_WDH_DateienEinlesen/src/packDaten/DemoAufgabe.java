package packDaten;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class DemoAufgabe {

    static String filename = "C:\\tmp\\daten.txt";

    public static void main(String[] args) throws IOException { // throws muss nicht sein, kann man machen..
        BufferedReader reader = null;
        String [] datenArray = null;
        String trennzeichen = "\t"; // bei char nur '', aber ein Split braucht ein String als Input.

        // Erste und zweite Zeile lesen
        String line, ersteZeile ="", zweiteZeile="";

        // Fürs aufsummieren..
        double zahl = 0.0, quadratZahl = 0.0, wurzelZahl = 0.0;
        double ergebnisZahl = 0.0, ergebnisQuadrat = 0.0, ergebnisWurzel = 0.0;

        try{
            reader = Files.newBufferedReader(Path.of(filename));

            // Auslesen und anzeigen lassen
            ersteZeile = reader.readLine();
            System.out.println(ersteZeile);

            zweiteZeile = reader.readLine();
            System.out.println(zweiteZeile);

            while ((line = reader.readLine() ) != null){
                System.out.println(line);
                datenArray = line.split(trennzeichen);
                zahl = Double.parseDouble(datenArray[0]);
                quadratZahl = Double.parseDouble(datenArray[1]);
                wurzelZahl = Double.parseDouble(datenArray[2].replace(',','.')); // Komma mit einem Punkt ersetzen

                // Berechnung
                ergebnisZahl = ergebnisZahl + zahl;
                ergebnisQuadrat = ergebnisQuadrat + zahl;
                ergebnisWurzel = ergebnisWurzel + zahl;

            }
            System.out.println(zweiteZeile);
            System.out.println(ergebnisZahl + trennzeichen + ergebnisQuadrat + trennzeichen + ergebnisWurzel);

        }
        catch (NoSuchFileException event){ // FileNotFoundException ist eine Alternative; bevorzugt wird -> nosuchfile
            System.out.println(event.getMessage());
        }
        // Normaler io Exception (MUSS NICHT SEIN) "Der DateiPfad wird nicht angezeigt".
        catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
        catch (Exception e){
            System.out.println("Fehler");
        }
        // finally steht um am Ende MUSS es schliessen
        finally{
            if (reader != null){
                reader.close();
            }
        }

    }
}
