package _32_FastFoodBestellTool;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;
import java.time.LocalDate;

public class RechnungSchreiben {

    static String path = "/Users/francescosakautzki/Desktop/Pr1_IntelliJ/_27_JDBC/src/_32_FastFoodBestellTool/beleg.txt";
    public static void writeBill(double totalpreis, double rabatt, String i1, double preis1, String i2, double preis2, String i3, double preis3, String i4, double preis4) throws IOException {

        Charset charset = Charset.forName("UTF-8");
        String platzhalter = "\t";
        BufferedWriter writer = null;
        DecimalFormat df = new DecimalFormat("0.00");
        double gesamtP = preis1 + preis2 + preis3 + preis4;

        LocalDate date = LocalDate.now();

        try {
            writer = Files.newBufferedWriter(Path.of(path), charset, StandardOpenOption.CREATE);

            // Rechnungsinformationen schreiben
            writer.write("[ Rechnung vom " + date + " ]");
            writer.newLine();
            writer.write("Ihre Bestellung: ");
            writer.newLine();
            writer.write("=================");
            writer.newLine();
            writer.newLine();
            if (!i1.equals("Bitte Auswählen")){
                writer.write(i1 + platzhalter + df.format(preis1) + " €");
                writer.newLine();
            }
            if (!i2.equals("Bitte Auswählen")) {
                writer.write(i2 + " " + df.format(preis2) + " €");
                writer.newLine();
            }

            if (!i3.equals("Bitte Auswählen")) {
                writer.write(i3 + " " + df.format(preis3) + " €");
                writer.newLine();
            }

            if (!i4.equals("Bitte Auswählen")) {
                writer.write(i4 + " " + df.format(preis4) + " €");
                writer.newLine();
            }
            writer.write("-----------------");
            writer.newLine();
            writer.write("Gesamtpreis: " + platzhalter + df.format(gesamtP) + " €");
            writer.newLine();
            writer.write("Rabatt: " + platzhalter + df.format(rabatt) + " €");
            writer.newLine();
            writer.write("-----------------");
            writer.newLine();
            writer.write("Zu zahlender Betrag: " + platzhalter + df.format(totalpreis) + " €");
            writer.newLine();
            writer.write("=================");
            writer.newLine();

            System.out.println("Die Rechnung wurde erfolgreich erstellt.");

        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }


}
