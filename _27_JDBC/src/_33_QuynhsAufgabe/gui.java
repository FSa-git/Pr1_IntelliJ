package _33_QuynhsAufgabe;

import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class gui {

    private JFrame frmFastfoodBestellung;

    private Image img_burger = new ImageIcon(gui.class.getResource("/fastfoodBestelltool_bilder/amirali-mirhashemian-9hIJ4ZLMnZA-unsplash.jpg")).getImage().getScaledInstance(90, 60, Image.SCALE_SMOOTH);
    private Image img_pizza = new ImageIcon(gui.class.getResource("H:\\PR1\\PrJ\\DB_Connection_SQL\\amirhosein-darbzanjiri-Q5NhoNIFxXQ-unsplash.jpg")).getImage().getScaledInstance(90, 60, Image.SCALE_SMOOTH);
    private Image img_wrap = new ImageIcon(gui.class.getResource("H:\\PR1\\PrJ\\DB_Connection_SQL\\max-griss-Spp1G283dow-unsplash.jpg")).getImage().getScaledInstance(90, 60, Image.SCALE_SMOOTH);
    private Image img_sandwich = new ImageIcon(gui.class.getResource("H:\\PR1\\PrJ\\DB_Connection_SQL\\aigars-peda-a_iKAg00LN4-unsplash.jpg")).getImage().getScaledInstance(90, 60, Image.SCALE_SMOOTH);
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    gui window = new gui();
                    window.frmFastfoodBestellung.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public gui() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmFastfoodBestellung = new JFrame();
        frmFastfoodBestellung.setTitle("FastFood Bestellung");
        frmFastfoodBestellung.setBounds(100, 100, 642, 445);
        frmFastfoodBestellung.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SpringLayout springLayout = new SpringLayout();
        frmFastfoodBestellung.getContentPane().setLayout(springLayout);

        JPanel panel_Bestellung = new JPanel();
        springLayout.putConstraint(SpringLayout.NORTH, panel_Bestellung, 10, SpringLayout.NORTH, frmFastfoodBestellung.getContentPane());
        springLayout.putConstraint(SpringLayout.WEST, panel_Bestellung, 10, SpringLayout.WEST, frmFastfoodBestellung.getContentPane());
        springLayout.putConstraint(SpringLayout.SOUTH, panel_Bestellung, -10, SpringLayout.SOUTH, frmFastfoodBestellung.getContentPane());
        panel_Bestellung.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Bestellung", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        frmFastfoodBestellung.getContentPane().add(panel_Bestellung);

        JPanel panel_Rechnung = new JPanel();
        springLayout.putConstraint(SpringLayout.EAST, panel_Bestellung, -6, SpringLayout.WEST, panel_Rechnung);
        springLayout.putConstraint(SpringLayout.NORTH, panel_Rechnung, 0, SpringLayout.NORTH, panel_Bestellung);
        springLayout.putConstraint(SpringLayout.WEST, panel_Rechnung, 303, SpringLayout.WEST, frmFastfoodBestellung.getContentPane());
        springLayout.putConstraint(SpringLayout.SOUTH, panel_Rechnung, -10, SpringLayout.SOUTH, frmFastfoodBestellung.getContentPane());
        springLayout.putConstraint(SpringLayout.EAST, panel_Rechnung, -10, SpringLayout.EAST, frmFastfoodBestellung.getContentPane());
        panel_Rechnung.setToolTipText("");
        panel_Rechnung.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Rechnung", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel_Bestellung.setLayout(null);

        Image img_burger = new ImageIcon(gui.class.getResource("/fastfoodBestelltool_bilder/amirali-mirhashemian-9hIJ4ZLMnZA-unsplash.jpg")).getImage().getScaledInstance(120, 90, Image.SCALE_SMOOTH);
        JLabel burger = new JLabel("");
        burger.setHorizontalAlignment(SwingConstants.CENTER);
        burger.setIcon(new ImageIcon(img_burger));
        burger.setBounds(10, 21, 86, 79);
        panel_Rechnung.add(burger);


        JRadioButton rdbtnNewRadioButton = new JRadioButton("Burger");
        rdbtnNewRadioButton.setBounds(6, 26, 57, 23);
        panel_Bestellung.add(rdbtnNewRadioButton);

        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Pizza");
        rdbtnNewRadioButton_1.setBounds(6, 55, 49, 23);
        panel_Bestellung.add(rdbtnNewRadioButton_1);

        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Wrap");
        rdbtnNewRadioButton_2.setBounds(6, 85, 51, 23);
        panel_Bestellung.add(rdbtnNewRadioButton_2);

        JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Sandwich");
        rdbtnNewRadioButton_3.setBounds(6, 114, 71, 23);
        panel_Bestellung.add(rdbtnNewRadioButton_3);

        JButton btnNewButton = new JButton("-");
        btnNewButton.setBounds(136, 26, 37, 23);
        panel_Bestellung.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("+");
        btnNewButton_1.setBounds(230, 26, 41, 23);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        panel_Bestellung.add(btnNewButton_1);

        textField = new JTextField();
        textField.setBounds(183, 28, 37, 20);
        panel_Bestellung.add(textField);
        textField.setColumns(10);

        JButton btnNewButton_1_1 = new JButton("+");
        btnNewButton_1_1.setBounds(230, 55, 41, 23);
        panel_Bestellung.add(btnNewButton_1_1);

        JButton btnNewButton_2 = new JButton("-");
        btnNewButton_2.setBounds(136, 55, 37, 23);
        panel_Bestellung.add(btnNewButton_2);

        JButton btnNewButton_1_1_1 = new JButton("+");
        btnNewButton_1_1_1.setBounds(230, 85, 41, 23);
        panel_Bestellung.add(btnNewButton_1_1_1);

        JButton btnNewButton_2_1 = new JButton("-");
        btnNewButton_2_1.setBounds(136, 85, 37, 23);
        panel_Bestellung.add(btnNewButton_2_1);

        JButton btnNewButton_1_1_1_1 = new JButton("+");
        btnNewButton_1_1_1_1.setBounds(230, 114, 41, 23);
        panel_Bestellung.add(btnNewButton_1_1_1_1);

        JButton btnNewButton_2_1_1 = new JButton("-");
        btnNewButton_2_1_1.setBounds(136, 114, 37, 23);
        panel_Bestellung.add(btnNewButton_2_1_1);

        textField_1 = new JTextField();
        textField_1.setBounds(183, 86, 37, 20);
        panel_Bestellung.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(183, 56, 37, 20);
        panel_Bestellung.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(183, 115, 37, 20);
        panel_Bestellung.add(textField_3);
        textField_3.setColumns(10);
        frmFastfoodBestellung.getContentPane().add(panel_Rechnung);
        panel_Rechnung.setLayout(null);

        JButton btnNewButton_3 = new JButton("Hinzufügen");
        btnNewButton_3.setBounds(40, 162, 89, 23);
        panel_Bestellung.add(btnNewButton_3);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(10, 217, 261, 124);
        panel_Bestellung.add(textArea);

        JButton btnNewButton_4 = new JButton("Bestellen");
        btnNewButton_4.setBounds(98, 352, 75, 23);
        panel_Bestellung.add(btnNewButton_4);

        JButton btnNewButton_5 = new JButton("Entfernen");
        btnNewButton_5.setBounds(146, 162, 89, 23);
        panel_Bestellung.add(btnNewButton_5);

        JLabel lblNewLabel = new JLabel("Warenkorb:");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel.setBounds(10, 196, 71, 14);
        panel_Bestellung.add(lblNewLabel);
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
}
