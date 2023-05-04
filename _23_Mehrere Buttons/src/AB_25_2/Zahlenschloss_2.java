package AB_25_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zahlenschloss_2 extends JFrame implements ActionListener {

    // Deklaration
    JButton bEins, bZwei, bDrei, bVier, bFuenf, bSechs, bSieben, bAcht, bNeun;

    // -- DAS BRAUCHT MAN IMMER --
    public Zahlenschloss_2(String title) {
        super(title);

        // Buttons festlegen
        JButton bEins = new JButton("1");
        JButton bZwei = new JButton("2");
        JButton bDrei = new JButton("3");
        JButton bVier = new JButton("4");
        JButton bFuenf = new JButton("5");
        JButton bSechs = new JButton("6");
        JButton bSieben = new JButton("7");
        JButton bAcht = new JButton("8");
        JButton bNeun = new JButton("9");

        // Den Jframe einsetzen
        bEins.addActionListener(this);
        bZwei.addActionListener(this);
        bDrei.addActionListener(this);
        bVier.addActionListener(this);
        bFuenf.addActionListener(this);
        bSechs.addActionListener(this);
        bSieben.addActionListener(this);
        bAcht.addActionListener(this);
        bNeun.addActionListener(this);

        // Layout festsetzen
        this.setLayout(new FlowLayout());



        this.add(bEins);
        this.add(bZwei);
        this.add(bDrei);
        this.add(bVier);
        this.add(bFuenf);
        this.add(bSechs);
        this.add(bSieben);
        this.add(bAcht);
        this.add(bNeun);

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

        if (evt.getActionCommand().equals("3")){

            // Die Fläche und den Hintergrund auf Blau setzen
            this.getContentPane().setBackground(Color.red);
        }

        if (evt.getActionCommand().equals("4")){

            // Die Fläche und den Hintergrund auf Blau setzen
            this.getContentPane().setBackground(Color.cyan);
        }

        if (evt.getActionCommand().equals("5")){

            // Die Fläche und den Hintergrund auf Blau setzen
            this.getContentPane().setBackground(Color.black);
        }

        if (evt.getActionCommand().equals("6")){

            // Die Fläche und den Hintergrund auf Blau setzen
            this.getContentPane().setBackground(Color.white);
        }
        if (evt.getActionCommand().equals("7")){

            // Die Fläche und den Hintergrund auf Blau setzen
            this.getContentPane().setBackground(Color.magenta);
        }
        if (evt.getActionCommand().equals("8")){

            // Die Fläche und den Hintergrund auf Blau setzen
            this.getContentPane().setBackground(Color.yellow);
        }
        if (evt.getActionCommand().equals("9")){

            // Die Fläche und den Hintergrund auf Blau setzen
            this.getContentPane().setBackground(Color.pink);
        }
    }
}
