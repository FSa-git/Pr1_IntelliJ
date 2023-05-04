package Erklaerung;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zahlenschloss_Erklearung extends JFrame implements ActionListener {

    // Deklaration
    JButton [] btns;
    String eingabe = "";
    public static final String CODE = "123";

    // -- DAS BRAUCHT MAN IMMER --
    public Zahlenschloss_Erklearung(String title) {
        super(title);

        this.setSize(200,200);
        this.setLayout(new FlowLayout());

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        btns = new JButton[9];
        int i = 1;

        for (JButton btn: btns){
            btn = new JButton(Integer.toString(i));
            btn.addActionListener(this);
            btn.setActionCommand(Integer.toString(i)); // Action Command gibt etwas zurück

            btn.add(btn);

            i++;
        }

        // Reset Button
        JButton reset = new JButton("Reset");

        reset.addActionListener(this);
        reset.setActionCommand("0");

        // Button kommt auf den Content Frame
        this.add(reset);

        // Layout festsetzen
        this.setLayout(new FlowLayout());


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    // -- BIS HIER --

    @Override
    public void actionPerformed(ActionEvent evt) { // evt -> Event, kann aber auch anders heißen

        if (evt.getActionCommand().equals("0")){

            eingabe = "";
            // Die Fläche und den Hintergrund auf Grün setzen
            this.getContentPane().setBackground(Color.white);
        }
        else {
            // Gib mir die letzte Action Command und ..
            eingabe += evt.getActionCommand();
            if (eingabe.length() == 3){
                if (eingabe.equals(CODE)){
                    this.getContentPane().setBackground(Color.green);
                }
                else {
                    this.getContentPane().setBackground(Color.red);
                    eingabe = "";
                }
            }
            repaint();
        }
    }
}
