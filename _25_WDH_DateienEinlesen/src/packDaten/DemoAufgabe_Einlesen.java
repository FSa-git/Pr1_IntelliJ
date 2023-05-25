package packDaten;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DemoAufgabe_Einlesen {

    static String dateiname = "/Users/francescosakautzki/Desktop/HeutePrg/Pr1_IntelliJ/_25_WDH_DateienEinlesen/src/packDaten/daten2.txt";

    public static void main(String[] args) {
        BufferedWriter writer = null;
        String trennzeichen = "\t";
        String umbruch = "\n";

        String text ="Zahl" + trennzeichen + "Quadratzahl" + trennzeichen + "Wurzel" + trennzeichen + umbruch + "******************************";
        String text2 = umbruch + "HalliHallo";
        int number = 23456;

        try {
            Files.writeString(Path.of(dateiname), text + text2 + number);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }



}
