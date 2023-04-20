package Start_mit_Uhr;

import javax.swing.*;
import java.util.Date;

public class UhrAnwendung {
    public static void main(String[] args) {

        JFrame andiframe = new JFrame("Uhrzeit in der ADV");

        andiframe.setSize(500, 500);

        //andiframe.setBounds(0,0,500,500); -> das gleiche

        andiframe.setBounds(100, 100, 500, 500);

        andiframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JLabel label = new JLabel("Die Uhrzeit ist: ");
        andiframe.add(label);

        JLabel label1 = new JLabel(String.format("%tT", new Date())); // "%tT" steht für Time, "tD" steht für Datum
        andiframe.add(label1);

        label.setBounds(100, 100, 500, 250);

        andiframe.setVisible(true);

        // keine Abbruch Schleife     // die Schleife überschreibt alles
        while (true) {
            // andiframe.remove(label1);
            // label1 = new JLabel(String.format("%tT", new Date()));
            label1.setText(String.format("%tT", new Date()));
            label1.setSize(500, 250);
            andiframe.setTitle(String.format("%tT", new Date())); // Überschrift bzw. der Titel
            // andiframe.add(label1);
            // andiframe.setVisible(true);

        }
    }
}
