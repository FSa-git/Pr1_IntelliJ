package Freitag_28_04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read_list {

    static String fileName = "";

        try ( FileReader reader = new FileReader(filePath) ) {
        int c;
        int count = 0;
        while ( ( c = reader.read() ) != -1 ) {
            //System.out.println("Char: " + ( char ) c);
            count++;
        }

        System.out.println("Anzahl Zeichen: " + count);

    }
    catch ( FileNotFoundException e ) {
        System.out.println("Die Datei wurde nicht gefunden!");
    } catch ( IOException e ) {
        e.printStackTrace();
    }

        for (int i = 0; i < lines.size(); i++){
        System.out.println("Hello" + lines.get(i) + "\n");
    }

}
