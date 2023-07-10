package _32_FastFoodBestellTool;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class FoodDB_GUI extends JDialog{
    private JPanel panel1;
    private JPanel contentPane;
    private JButton bestellungAkzeptierenButton;
    private JTextField textField10;
    private JButton kasseButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JPanel imageField;
    private JRadioButton karteRadioButton;
    private JRadioButton radioButton2;
    private JList list1;
    private JTextField rCode;
    private JLabel rabatt_Code;
    private JRadioButton payPalRadioButton;
    private JRadioButton bitCoinRadioButton;

    public FoodDB_GUI(){
        setContentPane(contentPane);
        setModal(true);

        kasseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                // Hier methode

            }
        });


        loadComboBoxOptionsFromDatabase("comboBox1", comboBox1);
        loadComboBoxOptionsFromDatabase("comboBox2", comboBox2);
        loadComboBoxOptionsFromDatabase("comboBox3", comboBox3);

        loadDrinksDatabase("comboBox4", comboBox4);




        // Hier heute:
        // loadPricefromDatabase("JButton", kasseButton);

        /*

        bestellungAkzeptierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    Class.forName("org.mariadb.jdbc.Driver");
                    Connection connection = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:8889/KrustyKrab", "root", "root");

                // SQL-Abfrage für Foods ausführen
                String foodsQuery = "SELECT Preis FROM Foods";
                Statement foodsStatement = connection.createStatement();
                ResultSet foodsResultSet = foodsStatement.executeQuery(foodsQuery);

                // SQL-Abfrage für Drinks ausführen
                String drinksQuery = "SELECT Preis FROM Drinks";
                Statement drinksStatement = connection.createStatement();
                ResultSet drinksResultSet = drinksStatement.executeQuery(drinksQuery);

                // Preise aus den ResultSets in ein ArrayList<Double> speichern
                ArrayList<Double> prices = new ArrayList<>();
                while (foodsResultSet.next()) {
                    double price = foodsResultSet.getDouble("Preis");
                    prices.add(price);
                }
                while (drinksResultSet.next()) {
                    double price = drinksResultSet.getDouble("Preis");
                    prices.add(price);
                }

                // Preise als Text im JTextField anzeigen
                StringBuilder sb = new StringBuilder();
                for (double price : prices) {
                    sb.append(price).append(", ");
                }
                // Entfernen des letzten Kommas und Leerzeichens
                if (sb.length() > 2) {
                    sb.setLength(sb.length() - 2);
                }
                textField10.setText(sb.toString());

                // Ressourcen freigeben
                foodsResultSet.close();
                foodsStatement.close();
                drinksResultSet.close();
                drinksStatement.close();
                connection.close();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        });

        // loadComboBoxOptionsFromDatabase(comboBox1);
*/

    }

    private void loadPricefromDatabase(String jButton, JButton kasseButton) {}


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

            // Recupero del valore selezionato dalla JComboBox
            String selectedOption = comboBox.getSelectedItem().toString();

            // Impostazione dell'immagine come sfondo in base alla selezione
            if (selectedOption.equals("Double Cheese Burger")) {
                ImageIcon icon = new ImageIcon("src/_32_FastFoodBestellTool/double_cheese_burger.png");
                JLabel label = new JLabel(icon);
                imageField.add(label);
            } else {
                System.out.println("Immagine non trovata");
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

    public static void main(String[] args) {

        try {

            FoodDB_GUI dialog  = new FoodDB_GUI();
            dialog.pack();
            dialog.setVisible(true);
            System.exit(0);

        }
        catch (IllegalArgumentException event){
            System.out.println("Fehler");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
