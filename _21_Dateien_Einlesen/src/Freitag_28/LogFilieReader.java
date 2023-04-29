package Freitag_28;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class LogFilieReader {

    public static void main ( String[] args ) {

        ArrayList<String> lines = new ArrayList<String>();

        String filePath = "src/Freitag_28/log.csv";
        String splitter = ",";

        try ( BufferedReader myReader = Files.newBufferedReader(Path.of(filePath)) ) {

            String c;

            while ( ( c = myReader.readLine() ) != null ) {
                lines.add(c);
            }

        } catch ( FileNotFoundException e ) {
            System.out.println("Datei nicht gefunden");
        } catch ( IOException e ) {
            System.out.println("Fehler beim Lesen der Datei");
        } catch ( Exception e ) {
            e.printStackTrace();
        }

        // --------------------

        for ( String line : lines ) {
            String[] segments = line.split(splitter);
            System.out.println(segments[4] + ": " + segments[1] + " (" + segments[0] + ") – " + segments[3] + " (" + segments[2] + ")");
        }

    }

}
