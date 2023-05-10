import javax.swing.*;

public class Test2 extends JDialog {
    private JPanel contentPane;
    private JTextArea radiusRTextArea;
    private JPasswordField passwordField1;

    public Test2() {
        setContentPane(contentPane);
        setModal(true);
    }

    public static void main(String[] args) {
        Test2 dialog = new Test2();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
