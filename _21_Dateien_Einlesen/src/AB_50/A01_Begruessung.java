package AB_50;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class A01_Begruessung {

    public static void main(String[] args) {

        ArrayList<String> namen = new ArrayList<String>();

        try {
            FileInputStream myFileReader = new FileInputStream("/Users/..");
            InputStreamReader myReader = new InputStreamReader(myFileReader, StandardCharsets.UTF_8);

            int read;
            StringBuilder currentName = new StringBuilder();

            while ((read = myReader.read()) != -1){
                char c = ( char ) read;

                // if char is not a line break
                if (c == '\n'){
                    namen.add(currentName.toString());
                    currentName = new StringBuilder();
                }
                else{
                    currentName.append(c);
                }
            }
            // add last name
            if ( currentName.length() > 0 ) {
                namen.add(currentName.toString());
            }

            myReader.close();

        } catch ( java.io.FileNotFoundException e ) {
            System.out.println("Datei nicht gefunden");
        } catch ( java.io.IOException e ) {
            System.out.println("Fehler beim Lesen der Datei");
        } catch ( Exception e ) {
            System.out.println("Fehler");
        }

        namen.forEach(( name ) -> {
            System.out.println("Hallo " + name);
        });
        }

    }
