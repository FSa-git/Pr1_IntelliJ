package _32_FastFoodBestellTool;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;

public class RechnungSchreiben {

    static String path = "/Users/francescosakautzki/Desktop/Pr1_IntelliJ/_27_JDBC/src/_32_FastFoodBestellTool/beleg.txt";

    public static void writeBill(double totalpreis, double rabatt) throws IOException {
        Charset charset = Charset.forName("UTF-8");
        BufferedWriter writer = null;
        DecimalFormat df = new DecimalFormat("#.00");

        try {
            writer = Files.newBufferedWriter(Path.of(path), charset, StandardOpenOption.CREATE);

            // Rechnungsinformationen schreiben
            writer.write("Ihre Bestellung: ");
            writer.newLine();
            writer.write("===============");
            writer.write("");
            writer.newLine();
            writer.newLine();
            writer.write("Gesamtpreis: " + df.format(totalpreis) + " €");
            writer.newLine();
            writer.write("Rabatt: " + df.format(rabatt) + " €");
            writer.newLine();
            writer.write("Zu zahlender Betrag: " + df.format(totalpreis - rabatt) + " €");
            writer.newLine();
            writer.write("===============");
            writer.newLine();

            System.out.println("Die Rechnung wurde erfolgreich erstellt.");

        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }


}
