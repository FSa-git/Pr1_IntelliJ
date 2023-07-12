package _32_FastFoodBestellTool;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.DecimalFormat;

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
    private JRadioButton radioButton2;
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

    private double summe = 0;

    DecimalFormat df = new DecimalFormat("#.##");

    public FoodDB_GUI() throws SQLException {

        setContentPane(contentPane);
        setModal(true);

        kasseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog( null, "Ihre Bestellung wurde erfolgreich aufgenommen. Vielen Dank für Ihren Einkauf!");

                System.exit(0);
                // Hier methode

            }
        });


        loadComboBoxOptionsFromDatabase("comboBox1", comboBox1);
        loadComboBoxOptionsFromDatabase("comboBox2", comboBox2);
        loadComboBoxOptionsFromDatabase("comboBox3", comboBox3);

        loadDrinksDatabase("comboBox4", comboBox4);

        init();


        rabattEinloesenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                    String code = rCode.getText();

                    if (code.equals("CODEWELLI")) {
                        summe = summe * 0.9;
                        summenField.setText(df.format(summe));
                    } else if (code.equals("CODEFRANCI")) {
                        summe = summe * 0.8;
                        summenField.setText(df.format(summe));
                    } else if (code.equals("CODEADV")) {
                        summe = summe * 0.85;
                        summenField.setText(df.format(summe));
                    } else if (code.equals("CODE3BKI")) {
                        summe = summe * 0.75;
                        summenField.setText(df.format(summe));
                    } else {
                        JOptionPane.showMessageDialog(null, "Der eingegebene Code ist ungültig!");
                    }

            }
        });
    }

    private void init() throws SQLException {

        bestellungAkzeptierenButton.addActionListener(e -> {

            StringBuilder sb = new StringBuilder();

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

                while (r1.next()) {
                    System.out.println(r1.getString("Preis"));
                    preis1 = Double.parseDouble(r1.getString("Preis"));
                    // textArea1.setText(preis1);
                    sb.append(i1 + " " + preis1 + "\n");
                }

                while (r2.next()) {
                    System.out.println(r2.getString("Preis"));
                    preis2 = Double.parseDouble(r2.getString("Preis"));
                    sb.append(i2 + " " + preis2 + "\n");
                }

                while (r3.next()) {
                    System.out.println(r3.getString("Preis"));
                    preis3 = Double.parseDouble(r3.getString("Preis"));
                    sb.append(i3 + " " + preis3 + "\n");
                }

                while (r4.next()) {
                    System.out.println(r4.getString("Preis"));
                    preis4 = Double.parseDouble(r4.getString("Preis"));
                    sb.append(i4 + " " + preis4 + "\n");
                }

                sb.append("-------------------\n");
                summe = preis1 + preis2 + preis3 + preis4;
                sb.append("Gesamt: " + df.format(summe) + "\n");

            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

            System.out.println(i2);
            System.out.println(query2);

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
