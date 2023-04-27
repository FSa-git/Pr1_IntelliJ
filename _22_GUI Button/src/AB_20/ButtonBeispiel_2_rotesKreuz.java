package AB_20;

import javax.swing.*;
import java.awt.*;

public class ButtonBeispiel_2_rotesKreuz extends JFrame{
    JButton bSchliessen;

    public ButtonBeispiel_2_rotesKreuz(String text) {
        super(text);
        this.setLayout(new FlowLayout());
        bSchliessen = new JButton("Schliessen");
        this.add(bSchliessen);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


}
