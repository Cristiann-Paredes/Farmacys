package interfaces;

import javax.swing.*;

public class login extends JPanel {
    private JPanel login;
    public JComboBox rolComboBox;
    public JTextField usuariotextField;
    public JButton ingresarButton;
    public JPasswordField contrasenaField;

    public static void main(String[] args) {
        JFrame frame = new JFrame("login");
        frame.setContentPane(new login().login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void dispose() {
    }
}
