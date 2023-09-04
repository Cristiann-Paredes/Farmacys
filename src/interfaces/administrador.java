package interfaces;

import model.datosuser;

import javax.swing.*;

public class administrador extends JFrame {
    private JPanel admin;
    private JButton ventasButton;
    private JButton ingresarproducButton;
    private JButton agregarButton;
    private JButton regresarButton;
    private JLabel nombreadmin;
    private JLabel correoadmin;

    private datosuser datosuser;

    public administrador(model.datosuser datosuser) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Administrador");
        frame.setContentPane(new administrador().admin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
