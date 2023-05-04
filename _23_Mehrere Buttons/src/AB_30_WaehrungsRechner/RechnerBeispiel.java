package AB_30_WaehrungsRechner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RechnerBeispiel extends JFrame implements ActionListener {

    JButton bRechnen;

    public RechnerBeispiel(String title) {
        super(title);
        this.setLayout(new FlowLayout());

        JLabel j1 = new JLabel("<html> <h1>Betrag in Singapurdollar</h1> </html>");
        JTextField jj1 = new JTextField(20);

        JLabel j2 = new JLabel("<html> <br> <h1>Betrag Euro</h1> </html>");
        JTextField jj2 = new JTextField(20);

        bRechnen = new JButton("Umrechnen");

        this.add(j1);
        this.add(jj1);

        this.add(j2);
        this.add(jj2);

        this.add(bRechnen);

        bRechnen.addActionListener(this);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Umrechnen")){
            this.getContentPane().setBackground(Color.red);
        }
    }
}
