package AB_50_schreiben;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Aufgabe_1 {

    static String myPath = "/Users/francescosakautzki/Desktop/HeutePrg/Pr1_IntelliJ/_25_WDH_DateienEinlesen/src/AB_50_schreiben/zahlen.txt";

    public static void main(String[] args) throws IOException {

        BufferedWriter writer = null;
        String trennzeichen = "\t";

        Charset charset = Charset.forName("UTF-8");

        try{
            writer = Files.newBufferedWriter(Path.of(myPath), charset, StandardOpenOption.WRITE);

            writer.write("Geschwindigkeit [km/h]" + trennzeichen + "ca. Anhalteweg [m]");
            writer.newLine();
            writer.write("____________________________");
            writer.newLine();

            int geschwindigkeit = 0;
            int reaktionsweg = (geschwindigkeit / 10)*3;

            int bremsweg = (geschwindigkeit / 10) * (geschwindigkeit / 10);

            int anhalteweg = reaktionsweg + bremsweg;

            for (int i = 0; i <= 100; i = i + 10){
                geschwindigkeit = i;


                writer.write(geschwindigkeit + trennzeichen + anhalteweg);
                writer.newLine();
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if (writer != null){
                writer.close();
            }
        }

    }

}
