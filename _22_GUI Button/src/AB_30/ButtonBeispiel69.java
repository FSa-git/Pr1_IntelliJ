package AB_30;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonBeispiel69 extends JFrame implements ActionListener {

    JButton bSchliessen;

    public ButtonBeispiel69(String text) {
        super(text);
        this.setLayout(new FlowLayout());
        bSchliessen = new JButton("Schliessen");

        bSchliessen.addActionListener(this);

        this.add(bSchliessen);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        bSchliessen.setText("aus");
        // System.exit(0);
    }
}
