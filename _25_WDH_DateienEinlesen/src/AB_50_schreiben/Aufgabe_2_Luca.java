package AB_50_schreiben;

import javax.lang.model.element.Element;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Aufgabe_2_Luca {

        static String filename =  "/Users/francescosakautzki/Desktop/HeutePrg/Pr1_IntelliJ/_25_WDH_DateienEinlesen/src/AB_50_schreiben/celsius.txt";

        public static void main(String[] args){

            // DecimalFormat df = new DecimalFormat("#.##");

            BufferedReader reader = null;
            String trennzeichen = "\t";
            String Umbruch = "\n";
            String line;

            ArrayList kelvins = new ArrayList();
            ArrayList celsiusse = new ArrayList();

            Path path = Paths.get("/Users/francescosakautzki/Desktop/HeutePrg/Pr1_IntelliJ/_25_WDH_DateienEinlesen/src/AB_50_schreiben/celsius.txt");
            Charset charset = Charset.forName("UTF-8");
            BufferedWriter writer = null;
            String text = "";

            try{
                reader = Files.newBufferedReader(Path.of(filename));
                int zaehler = 0;

                while((line = reader.readLine()) != null) {
                    System.out.print(line + "°C" + "\t" + "\t");
                    celsiusse.add(zaehler, line);
                    double kelvin = Double. parseDouble(line);
                    kelvin = kelvin + 273.15;
                    System.out.print(kelvin + "K"+ "\n");
                    kelvins.add(zaehler, kelvin);
                    zaehler++;
                }
            /*
            for (Object e : kelvins) {
                System.out.println(e);
            }
            */
                reader.close();

                writer = Files.newBufferedWriter(path, charset, StandardOpenOption.TRUNCATE_EXISTING);
                text = "Celsius"+trennzeichen+trennzeichen+"Kelvin"+ Umbruch;
                writer.write(text);
                text = "***************************************************************" + Umbruch;
                writer.write(text);

                for (int i = 0; i < celsiusse.size(); i++){
                    text = celsiusse.get(i) + trennzeichen + trennzeichen + trennzeichen + trennzeichen + trennzeichen + kelvins.get(i) + Umbruch;
                    writer.write(text);
                }

                writer.close();


            }
        /*catch (FileNotFoundException e){
            e.printStackTrace();
        }*/
            catch (NoSuchFileException er){
                System.out.println(er.getMessage());
            }
            catch (IOException ioe){
                System.out.println(ioe.getMessage());
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }

    }
