import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeometrischeFormen extends JDialog {
    private JPanel contentPane;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField6;
    private JTextField textField7;
    private JButton kreiszylinderberechnungButton;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JButton kreiskegelberechnungButton;
    private JButton kugelberechnungButton;
    private JButton buttonOK;

    public GeometrischeFormen() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        kugelberechnungButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {

            }

        });
        kreiszylinderberechnungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }



        });
        kreiskegelberechnungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        GeometrischeFormen dialog = new GeometrischeFormen();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
