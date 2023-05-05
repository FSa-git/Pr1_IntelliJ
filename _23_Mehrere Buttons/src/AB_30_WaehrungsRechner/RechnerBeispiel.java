package AB_30_WaehrungsRechner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RechnerBeispiel extends JFrame implements ActionListener {

    JButton bRechnen, bLoeschen;
    JTextField jj1;
    JTextField jj2;

    public RechnerBeispiel(String title) {
        super(title);
        this.setLayout(new FlowLayout());

        JLabel j1 = new JLabel("<html> <h1>Betrag in Singapurdollar</h1> </html>");
        jj1 = new JTextField(20);

        JLabel j2 = new JLabel("<html> <br> <h1>Betrag Euro</h1> </html>");
        jj2 = new JTextField(20);

        bRechnen = new JButton("Umrechnen");

        bLoeschen = new JButton("Reset");

        JPanel panel = new JPanel();
        this.add(panel);
        String[] choices = { "Euro","USD", "Lira","Yen"};
        final JComboBox<String> cb = new JComboBox<String>(choices);
        this.add(cb);

        this.add(j1);
        this.add(jj1);

        this.add(j2);
        this.add(jj2);

        this.add(bRechnen);
        this.add(bLoeschen);

        bRechnen.addActionListener(this);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Umrechnen")) {

            // Get the value of the first text field as a double | Gibt den Wert
            double singaporeDollar = Double.parseDouble(jj1.getText());

            // Convert Singapore Dollar to Euro at a fixed exchange rate
            double euro = singaporeDollar * 0.64;

            // Set the value of the second text field to the converted Euro value
            jj2.setText(String.format("%.2f", euro));
        }
    }
}