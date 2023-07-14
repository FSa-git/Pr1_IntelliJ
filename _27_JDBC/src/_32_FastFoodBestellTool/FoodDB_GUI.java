package _32_FastFoodBestellTool;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.*;
import java.text.DecimalFormat;

import static _32_FastFoodBestellTool.RechnungSchreiben.writeBill;

public class FoodDB_GUI extends JDialog{
    private JPanel panel1;
    private JPanel contentPane;
    private JButton bestellungAkzeptierenButton;
    private JButton kasseButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JPanel imageField;
    private JRadioButton karteRadioButton;
    private JRadioButton barButton;
    private JTextField rCode;
    private JLabel rabatt_Code;
    private JRadioButton payPalRadioButton;
    private JRadioButton bitCoinRadioButton;
    private JButton rabattEinloesenButton;
    private JLabel burger1_logo;
    private JLabel burger2_logo;
    private JLabel belgium_logo;
    private JLabel pop_logo;
    private JLabel cola_logo;
    private JLabel fanta_logo;
    private JTextArea textArea1;
    private JTextField summenField;
    private JButton zurücksetzenButton;

    private double summe = 0;

    DecimalFormat df = new DecimalFormat("#.##");

    public FoodDB_GUI() throws SQLException {

        setContentPane(contentPane);
        setModal(true);

        // Kasse Button
        kasseButton.addActionListener(new ActionListener() {

            String trennzeichen = "\n";
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Gesamtsumme: " + df.format(summe) + " €");
                System.out.println("-------------------");
                System.out.println("Vielen Dank für Ihren Einkauf!");
                System.out.println("-------------------");

                System.out.println("Bezahlmethode:");
                if (barButton.isSelected()) {
                    System.out.println("Bar");
                } else if (karteRadioButton.isSelected()) {
                    System.out.println("Kreditkarte");
                } else if (payPalRadioButton.isSelected()) {
                    System.out.println("PayPal");
                } else if (bitCoinRadioButton.isSelected()) {
                    System.out.println("BitCoin");
                } else {
                    System.out.println("Keine ausgewählt");
                }

                System.out.println("-------------------");

                try {
                    writeBill(summe, 0.8);
                    JOptionPane.showMessageDialog(null, "Ihre Bestellung wurde erfolgreich aufgenommen. Vielen Dank für Ihren Einkauf!");
                    System.exit(0);
                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("Fehler beim Schreiben der Rechnung.");
                }
            }
        });

        loadComboBoxOptionsFromDatabase("comboBox1", comboBox1);
        loadComboBoxOptionsFromDatabase("comboBox2", comboBox2);
        loadComboBoxOptionsFromDatabase("comboBox3", comboBox3);

        loadDrinksDatabase("comboBox4", comboBox4);

        init();

        // Rabattcode einlösen Button
        rabattEinloesenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                    String code = rCode.getText();

                    if (code.equals("CODEWELLI")) {
                        summe = summe * 0.9;
                        summenField.setText(df.format(summe) + " €");
                        System.out.println("-------------------");
                        System.out.println("Rabattcode: " + rCode.getText() + " eingelöst.");

                    } else if (code.equals("CODEFRANCI")) {
                        summe = summe * 0.8;
                        summenField.setText(df.format(summe) + " €");
                        System.out.println("-------------------");
                        System.out.println("Rabattcode: " + rCode.getText() + " eingelöst.");

                    } else if (code.equals("CODEADV")) {
                        summe = summe * 0.85;
                        summenField.setText(df.format(summe) + " €");
                        System.out.println("-------------------");
                        System.out.println("Rabattcode: " + rCode.getText() + " eingelöst.");

                    } else if (code.equals("CODE3BKI")) {
                        summe = summe * 0.75;
                        summenField.setText(df.format(summe) + " €");
                        System.out.println("-------------------");
                        System.out.println("Rabattcode: " + rCode.getText() + " eingelöst.");

                    } else {

                        // JOptionPane.showMessageDialog(null, "Der eingegebene Code ist ungültig!");

                        System.out.println("-------------------");
                        System.out.println("Der eingegebene Code: " + rCode.getText() + " ist ungültig!");

                        summenField.setText("Ungültiger Code!");
                    }

            }
        });

        // Zurücksetzen Button
        zurücksetzenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                    summe = 0;
                    summenField.setText("");
                    rCode.setText("");
                    comboBox1.setSelectedIndex(0);
                    comboBox2.setSelectedIndex(0);
                    comboBox3.setSelectedIndex(0);
                    comboBox4.setSelectedIndex(0);
                    textArea1.setText("");

                    System.out.println("-------------------");
                    System.out.println("Alle Felder wurden zurückgesetzt.");
                    System.out.println("-------------------");


            }
        });
    }

    // Methode um die Bestellmöglichkeiten in das Textfeld zu laden
    private void init() throws SQLException {

        bestellungAkzeptierenButton.addActionListener(e -> {

            StringBuilder sb = new StringBuilder();
            String trenner = "\n";
            String ph = "\t";

            String i1 = comboBox1.getSelectedItem().toString();
            String query = "SELECT Preis FROM Foods WHERE Bezeichnung = '" + i1 + "';";

            String i2 = comboBox2.getSelectedItem().toString();
            String query2 = "SELECT Preis FROM Foods WHERE Bezeichnung = '" + i2 + "'";

            String i3 = comboBox3.getSelectedItem().toString();
            String query3 = "SELECT Preis FROM Foods WHERE Bezeichnung = '" + i3 + "'";

            String i4 = comboBox4.getSelectedItem().toString();
            String query4 = "SELECT Preis FROM Drinks WHERE Bezeichnung = '" + i4 + "'";

            double preis1, preis2, preis3, preis4;
            preis1 = preis2 = preis3 = preis4 = 0;


            try {

                ResultSet r1 = db.select(query);
                ResultSet r2 = db.select(query2);
                ResultSet r3 = db.select(query3);
                ResultSet r4 = db.select(query4);

                System.out.println(trenner);
                System.out.println("Ihre Bestellung: ");
                System.out.println("===============");

                sb.append("Ihre Bestellung: " + trenner);
                sb.append("=================" + trenner);

                while (r1.next()) {
                    if (!i1.equals("Bitte Auswählen")) {
                        System.out.println(i1 + "\t" + r1.getString("Preis") + " €");
                        preis1 = Double.parseDouble(r1.getString("Preis"));
                        sb.append(i1 + " " + ph + df.format(preis1) + " €" + "\n");
                    }
                }

                while (r2.next()) {
                    if (!i2.equals("Bitte Auswählen")) {
                        System.out.println(i2 + "\t" + r2.getString("Preis") + " €");
                        preis2 = Double.parseDouble(r2.getString("Preis"));
                        sb.append(i2 + " " + ph + df.format(preis2) + " €" + "\n");
                    }
                }

                while (r3.next()) {
                    if (!i3.equals("Bitte Auswählen")) {
                        System.out.println(i3 + "\t" + r3.getString("Preis") + " €");
                        preis3 = Double.parseDouble(r3.getString("Preis"));
                        sb.append(i3 + " " + ph + df.format(preis3) + " €" + "\n");
                    }
                }

                while (r4.next()) {
                    if (!i4.equals("Bitte Auswählen")) {
                        System.out.println(i4 + "\t" + "\t" + r4.getString("Preis") + " €");
                        preis4 = Double.parseDouble(r4.getString("Preis"));
                        sb.append(i4 + " " + ph + df.format(preis4) + " €" + "\n");
                    }
                }


                sb.append("------------------------\n");
                summe = preis1 + preis2 + preis3 + preis4;
                sb.append("Gesamt: " + df.format(summe) + " €" + "\n");

                summenField.setText(df.format(summe) + " €");



            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

            textArea1.setText(sb.toString());

        });
    }

    // Foods-Tabelle
    private void loadComboBoxOptionsFromDatabase(String columnName, JComboBox comboBox) {
        try {

            Class.forName("org.mariadb.jdbc.Driver");

            // MySQL-Datenbankverbindung herstellen
            Connection connection = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:8889/KrustyKrab", "root", "root");
            // SQL-Abfrage ausführen
            String query = "SELECT Bezeichnung FROM Foods ORDER BY CASE WHEN Bezeichnung = 'Bitte Auswählen' THEN 0 ELSE 1 END, Preis ASC"; // Database column (2)
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            // JComboBox-Optionen aktualisieren
            while (resultSet.next()) {
                String option = resultSet.getString("Bezeichnung");
                comboBox.addItem(option);
            }

            // Ressourcen freigeben
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Fehler beim Abrufen der Daten aus der Datenbank", "Fehler", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // Drinks-Tabelle
    private void loadDrinksDatabase(String columnName, JComboBox comboBox) {
        try {

            Class.forName("org.mariadb.jdbc.Driver");

            // MySQL-Datenbankverbindung herstellen
            Connection connection = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:8889/KrustyKrab", "root", "root");

            // SQL-Abfrage ausführen
            String query = "SELECT Bezeichnung FROM Drinks ORDER BY CASE WHEN Bezeichnung = 'Bitte Auswählen' THEN 0 ELSE 1 END, Preis ASC"; // Database column (2)
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            // JComboBox-Optionen aktualisieren
            while (resultSet.next()) {
                String option = resultSet.getString("Bezeichnung");
                comboBox.addItem(option);
            }

            // Ressourcen freigeben
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Fehler beim Abrufen der Daten aus der Datenbank", "Fehler", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void createUIComponents() {
        ImageIcon burger1Icon = new ImageIcon("/Users/francescosakautzki/Desktop/Pr1_IntelliJ/_27_JDBC/src/_32_FastFoodBestellTool/double_cheese_burger.png");
        burger1_logo = new JLabel(scaleImageIcon(burger1Icon, 80, 80));

        ImageIcon burger2Icon = new ImageIcon("/Users/francescosakautzki/Desktop/Pr1_IntelliJ/_27_JDBC/src/_32_FastFoodBestellTool/ceaser_burger.png");
        burger2_logo = new JLabel(scaleImageIcon(burger2Icon, 80, 80));

        ImageIcon belgiumIcon = new ImageIcon("/Users/francescosakautzki/Desktop/Pr1_IntelliJ/_27_JDBC/src/_32_FastFoodBestellTool/belgium_fries.png");
        belgium_logo = new JLabel(scaleImageIcon(belgiumIcon, 80, 80));

        ImageIcon popIcon = new ImageIcon("/Users/francescosakautzki/Desktop/Pr1_IntelliJ/_27_JDBC/src/_32_FastFoodBestellTool/xxl_popcorn.png");
        pop_logo = new JLabel(scaleImageIcon(popIcon, 80, 80));

        ImageIcon colaIcon = new ImageIcon("/Users/francescosakautzki/Desktop/Pr1_IntelliJ/_27_JDBC/src/_32_FastFoodBestellTool/coca_cola.png");
        cola_logo = new JLabel(scaleImageIcon(colaIcon, 80, 80));

        ImageIcon fantaIcon = new ImageIcon("/Users/francescosakautzki/Desktop/Pr1_IntelliJ/_27_JDBC/src/_32_FastFoodBestellTool/fanta.png");
        fanta_logo = new JLabel(scaleImageIcon(fantaIcon, 80, 80));
    }

    private ImageIcon scaleImageIcon(ImageIcon icon, int width, int height) {
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }


}
