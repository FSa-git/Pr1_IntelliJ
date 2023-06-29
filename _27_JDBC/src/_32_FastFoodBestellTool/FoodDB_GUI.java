package _32_FastFoodBestellTool;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public FoodDB_GUI(){
        setContentPane(contentPane);
        setModal(true);

        kasseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        /*
        // Optionen für comboBox1 hinzufügen
        comboBox1.addItem("Double Cheese Burger");
        comboBox1.addItem("Ceaser Burger");
        comboBox1.addItem("Belgium Fries");

        // Optionen für comboBox2 hinzufügen
        comboBox2.addItem("Option A");
        comboBox2.addItem("Option B");
        comboBox2.addItem("Option C");

        // Optionen für comboBox3 hinzufügen
        comboBox3.addItem("Choice X");
        comboBox3.addItem("Choice Y");
        comboBox3.addItem("Choice Z");

        // Optionen für comboBox4 hinzufügen
        comboBox4.addItem("Item 1");
        comboBox4.addItem("Item 2");
        comboBox4.addItem("Item 3");
*/
        loadComboBoxOptionsFromDatabase("comboBox1", comboBox1);


    }

    private void loadComboBoxOptionsFromDatabase(String columnName, JComboBox comboBox) {
        try {
            // MySQL-Datenbankverbindung herstellen
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8888/your_database_name", "username", "password");

            // SQL-Abfrage ausführen
            String query = "SELECT " + columnName + " FROM your_table_name";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            // JComboBox-Optionen aktualisieren
            while (resultSet.next()) {
                String option = resultSet.getString(columnName);
                comboBox.addItem(option);
            }

            // Ressourcen freigeben
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
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
