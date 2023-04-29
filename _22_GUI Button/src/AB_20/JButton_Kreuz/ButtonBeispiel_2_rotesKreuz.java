package AB_20.JButton_Kreuz;

import javax.swing.*;
import java.awt.*;

public class ButtonBeispiel_2_rotesKreuz extends JFrame{
    JButton bSchliessen;

    public ButtonBeispiel_2_rotesKreuz (String text) throws HeadlessException{

        super(text);

        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        ImageIcon image = new ImageIcon("/Users/francescosakautzki/Desktop/HeutePrg/Pr1_IntelliJ/_22_GUI Button/src/AB_20/JButton_Kreuz/pngwing.com.png");

        bSchliessen = new JButton("Schliessen", new ImageIcon(image.getImage().getScaledInstance(20,20, Image.SCALE_DEFAULT)));
        bSchliessen.addActionListener(e -> System.exit(0));
        this.add(bSchliessen);


    }


}
