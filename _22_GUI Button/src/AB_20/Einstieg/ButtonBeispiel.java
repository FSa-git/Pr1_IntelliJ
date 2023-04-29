package AB_20.Einstieg;

import javax.swing.*; //JFrame
import java.awt.*;

public class ButtonBeispiel extends JFrame{

    JButton bSchliessen;

    public ButtonBeispiel(String text) {
        super(text);
        this.setLayout(new FlowLayout());
        bSchliessen = new JButton("Schliessen");
        this.add(bSchliessen);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

 }
