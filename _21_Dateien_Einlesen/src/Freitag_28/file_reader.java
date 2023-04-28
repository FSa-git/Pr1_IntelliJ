package Freitag_28;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class file_reader {

    static String filePath = "src/_21_Dateien_Einlesen/Freitag_28/namen.txt";

    public static void main(String[] args) {

        long nanoStartTime = System.nanoTime();
        long millisStartTime = System.currentTimeMillis();

        readWithFileReader();

        long nanoEndTime = System.nanoTime();
        long millisEndTime = System.currentTimeMillis();

        long nanoDurationFileReader = nanoEndTime - nanoStartTime;
        long millisDurationFileReader = millisEndTime - millisStartTime;

        // --------------------------------------------

        nanoStartTime = System.nanoTime();
        millisStartTime = System.currentTimeMillis();

        readWithBufferedReader();

        nanoEndTime = System.nanoTime();
        millisEndTime = System.currentTimeMillis();

        long nanoDurationBufferedReader = nanoEndTime - nanoStartTime;
        long millisDurationBufferedReader = millisEndTime - millisStartTime;

        // --------------------------------------------

        nanoStartTime = System.nanoTime();
        millisStartTime = System.currentTimeMillis();

        readWithBufferedReaderLines();

        nanoEndTime = System.nanoTime();
        millisEndTime = System.currentTimeMillis();

        long nanoDurationBufferedReaderLines = nanoEndTime - nanoStartTime;
        long millisDurationBufferedReaderLines = millisEndTime - millisStartTime;

        // --------------------------------------------

        System.out.println("--------------------------------------------------");

        // Sollte eigentlich schneller sein (bei MacOS ist es aber langsamer)
        System.out.println("Lesen mit dem FileReader:");
        System.out.println("Laufzeit in Nanosekunden: " + (nanoDurationFileReader) + "ns");
        System.out.println("Laufzeit in Millisekunden: " + (millisDurationFileReader) + "ms");

        System.out.println("--------------------------------------------------");

        // Sollte eigentlich langsamer sein (bei MacOS ist es aber schneller)
        System.out.println("Lesen mit dem BufferedReader:");
        System.out.println("Laufzeit in Nanosekunden: " + (nanoDurationBufferedReader) + "ns");
        System.out.println("Laufzeit in Millisekunden: " + (millisDurationBufferedReader) + "ms");

        System.out.println("--------------------------------------------------");

        System.out.println("Lesen mit dem BufferedReader (readLine()):");
        System.out.println("Laufzeit in Nanosekunden: " + (nanoDurationBufferedReaderLines) + "ns");
        System.out.println("Laufzeit in Millisekunden: " + (millisDurationBufferedReaderLines) + "ms");

    }
}

