package ZweitesBeispiel;

import javax.swing.*;
import java.awt.*;

public class FranciFrame extends JFrame {
    JLabel lb;

    // Der Standard
    public FranciFrame(String title) throws HeadlessException {
        super(title);
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new FlowLayout()); // Layout-Manager

        lb = new JLabel("Hallo ADV World!");
        this.add(lb);
    }
}
