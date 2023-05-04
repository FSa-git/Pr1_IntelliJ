package AB_25_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zahlenschloss_1 extends JFrame implements ActionListener {

    // Deklaration
    JButton bEins, bZwei;

    // -- DAS BRAUCHT MAN IMMER --
    public Zahlenschloss_1(String title) {
        super(title);

        // Buttons festlegen
        JButton bEins = new JButton("1");
        JButton bZwei = new JButton("2");

        // Den Jframe einsetzen
        bEins.addActionListener(this);
        bZwei.addActionListener(this);

        // Layout festsetzen
        this.setLayout(new FlowLayout());


        this.add(bEins);
        this.add(bZwei);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    // -- BIS HIER --

    @Override
    public void actionPerformed(ActionEvent evt) { // evt -> Event, kann aber auch anders heißen

        if (evt.getActionCommand().equals("1")){

            // Die Fläche und den Hintergrund auf Grün setzen
            this.getContentPane().setBackground(Color.green);
        }

        if (evt.getActionCommand().equals("2")){

            // Die Fläche und den Hintergrund auf Blau setzen
            this.getContentPane().setBackground(Color.blue);
        }

    }
}
