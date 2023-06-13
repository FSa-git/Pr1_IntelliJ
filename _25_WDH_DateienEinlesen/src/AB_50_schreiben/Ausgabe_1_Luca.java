package AB_50_schreiben;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;

public class Ausgabe_1_Luca {

        public static void main(String[] args) {

            Path path = Paths.get("/Users/francescosakautzki/Desktop/HeutePrg/Pr1_IntelliJ/_25_WDH_DateienEinlesen/src/AB_50_schreiben/zahlen.txt");
            Charset charset = Charset.forName("UTF-8");
            BufferedWriter writer = null;
            String trennzeichen = "\t";
            String Umbruch = "\n";
            String text = "";
            DecimalFormat format = new DecimalFormat("0.00");



            try {

                writer = Files.newBufferedWriter(path, charset, StandardOpenOption.TRUNCATE_EXISTING);
                text = "Geschwindigkeit (km/h)"+trennzeichen+trennzeichen+"ca. Anhalteweg (m)"+ Umbruch;
                writer.write(text);
                text = "***************************************************************" + Umbruch;
                writer.write(text);

                for (int i = 10; i <= 100; i = i + 10){
                    System.out.println(i + "---------");
                    int lösung = calcBremsweg(i);
                    text = i + trennzeichen + trennzeichen +trennzeichen + trennzeichen + trennzeichen + lösung + Umbruch;
                    writer.write(text);
                }

                writer.close();

            }
            catch (IOException e){

            }

        }

        static int calcBremsweg(int i){
            System.out.println(i);
            int nb = (i/10) * (i/10);
            System.out.println(nb);
            int rw = (i/10) * 3;
            System.out.println(rw);
            int aw = nb + rw;
            System.out.println(aw);
            return aw;
        }

    }

