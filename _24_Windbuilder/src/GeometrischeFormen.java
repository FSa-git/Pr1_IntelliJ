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
    private JTextField textField1;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField12;
    private JButton kugelberechnungButton;
    private JButton buttonOK;

    public GeometrischeFormen() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        kugelberechnungButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // Abrufen der Werte aus den Textfeldern
                double radius = Double.parseDouble(textField1.getText());

                // Berechnung des Volumens und der Oberfläche
                double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
                double oberflaeche = 4.0 * Math.PI * Math.pow(radius, 2);

                // Anzeige der Ergebnisse in den Textfeldern
                textField4.setText(String.valueOf(volumen));
                textField5.setText(String.valueOf(oberflaeche));
            }

        });
        kreiszylinderberechnungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abrufen der Werte aus den Textfeldern
                double radius = Double.parseDouble(textField2.getText());
                double hoehe = Double.parseDouble(textField3.getText());

                // Berechnung des Volumens und der Oberfläche
                double volumen = Math.PI * Math.pow(radius, 2) * hoehe;
                double oberflaeche = 2.0 * Math.PI * radius * (radius + hoehe);

                // Anzeige der Ergebnisse in den Textfeldern
                textField6.setText(String.valueOf(volumen));
                textField7.setText(String.valueOf(oberflaeche));
            }


        });
        kreiskegelberechnungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Abrufen der Werte aus den Textfeldern
                double radius = Double.parseDouble(textField8.getText());
                double hoehe = Double.parseDouble(textField9.getText());

                // Berechnung des Volumens und der Oberfläche
                double volumen = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * hoehe;
                double oberflaeche = Math.PI * radius * (radius + Math.sqrt(Math.pow(hoehe, 2) + Math.pow(radius, 2)));

                // Anzeige der Ergebnisse in den Textfeldern
                textField10.setText(String.valueOf(volumen));
                textField11.setText(String.valueOf(oberflaeche));

            }
        });
    }

    public static void main(String[] args) {

        try{

        GeometrischeFormen dialog = new GeometrischeFormen();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
