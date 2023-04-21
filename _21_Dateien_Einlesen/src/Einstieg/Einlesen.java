package Einstieg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Einlesen {

    public static void main ( String[] args ) {

        try {

            FileInputStream myFileReader = new FileInputStream("/Users/bd/dev_schule/projects_pr1/src/net/bdweb/gds2/pr1_x410_Anwendungen_Lesen_von_Dateien/einstieg/file.txt");

            InputStreamReader myReader = new InputStreamReader(myFileReader, StandardCharsets.US_ASCII);

            int read;
            while ( ( read = myReader.read() ) != -1 ) {
                System.out.print(( char ) read);
            }
            myReader.close();

            FileOutputStream myFileWriter = new FileOutputStream("/Users//file.txt");

            OutputStreamWriter myWriter = new OutputStreamWriter(myFileWriter, StandardCharsets.US_ASCII);

            myWriter.append('t');

            myWriter.close();

        } catch ( java.io.FileNotFoundException e ) {
            System.out.println("Datei nicht gefunden");
        } catch ( java.io.IOException e ) {
            System.out.println("Fehler beim Lesen der Datei");
        } catch ( Exception e ) {
            System.out.println("Fehler");
        }

    }

}
