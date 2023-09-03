package interfaces;

import javax.swing.*;

public class login extends JPanel {
    private JPanel login;
    private JComboBox rolComboBox;
    private JTextField usuariotextField;
    private JButton ingresarButton;
    private JPasswordField contrasenaField;

    public static void main(String[] args) {
        JFrame frame = new JFrame("login");
        frame.setContentPane(new login().login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
