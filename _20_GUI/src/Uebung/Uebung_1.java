package Uebung;

import javax.swing.*;

public class Uebung_1 {

    public static void main(String[] args) {

        JFrame jF = new JFrame("Das Fenster");

        jF.setSize(500,200);
        jF.setTitle("Meine Uhr");

        jF.setBounds(500,200,200,500);
        jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Moin moin");
        jF.add(label);

        jF.setVisible(true);

    }

}
