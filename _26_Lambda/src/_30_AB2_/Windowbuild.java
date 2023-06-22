package _30_AB2_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Windowbuild extends JFrame implements ActionListener {

    JButton bAusloeser;

    public Windowbuild(String title) {
        super(title);

        JButton bAusloeser = new JButton("Lambda Auslöser");

        bAusloeser.addActionListener(this);

        this.setLayout(new FlowLayout());
        this.setSize(200,300);

        this.add(bAusloeser);

        // Lambda Ausdruck
        // -> Lambda Operator
        // e ist hier "shift-operator"
        //  sout ist der Inhalt

        // Wann verwende ich einen Lambda-Ausdruck? Aw: "Anwendungsfälle.."
        // es ist eine Kurzschreibweise für..
        bAusloeser.addActionListener(e -> {

            System.out.println("Lambda Ausdruck wurde ausgelöst");
            System.exit(0);

        });

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
