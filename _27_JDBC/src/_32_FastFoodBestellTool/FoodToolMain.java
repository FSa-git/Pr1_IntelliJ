package _32_FastFoodBestellTool;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.File;


public class FoodToolMain {

    // LOG-File
    private static final Logger logger = Logger.getLogger(FoodDB_GUI.class.getName());

    private static final String LOG_FILE = "/Users/francescosakautzki/Desktop/Pr1_IntelliJ/_27_JDBC/src/_32_FastFoodBestellTool/log.txt";

    public static void main(String[] args) {

        try {
            // Log-File leeren
            File logFile = new File(LOG_FILE);
            logFile.delete();

            // Log-File
            FileHandler fileHandler = new FileHandler(LOG_FILE, true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);

            logger.info("Programm wurde gestartet");

            FoodDB_GUI dialog  = new FoodDB_GUI();
            dialog.pack();
            dialog.setVisible(true);
            System.exit(0);
            dialog.setLocation(500, 500);

        }
        catch (IllegalArgumentException event){
            System.out.println("Fehler");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
