package packDaten;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Erklaerung_2 {

    static String myPath = "/Users/francescosakautzki/Desktop/HeutePrg/Pr1_IntelliJ/_25_WDH_DateienEinlesen/src/packDaten/daten3_erklaerung.txt";

    public static void main(String[] args) throws IOException {
        BufferedWriter writer = null;
        String trennzeichen = "\t";

        Charset charset = Charset.forName("UTF-8"); // kann auch ohne gehen..
        try{
            writer = Files.newBufferedWriter(Path.of(myPath), charset, StandardOpenOption.WRITE);

            writer.write("zahl" + trennzeichen + "quadratzahl" + trennzeichen + "wurzel");
            writer.newLine();
            writer.write("************");
            writer.newLine();
            int zahl = 0, quadratzahl = 0;
            double wurzel = 0.0;

            for (int i = 0; i <= 10; i++){
                zahl = i;
                quadratzahl = (int) Math.pow(quadratzahl, 2);
                wurzel = Math.sqrt(zahl);

                writer.write(zahl + trennzeichen + quadratzahl + trennzeichen + wurzel);
                writer.newLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            if (writer != null){
                writer.close();
            }
        }
    }
}
