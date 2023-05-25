package packDaten;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class Erklaerung_2 {

    static String myPath = "C:\\tmp\\zahlen.txt";

    public static void main(String[] args) {

        Charset charset = Charset.forName("UTF-8"); // kann auch ohne gehen..
        try (BufferedWriter writer = Files.newBufferedWriter(myPath, charset, StandardOpenOption)){ // Optionen gehen by "try" auch

        }
        catch(IOException e){

        }
    }
}
