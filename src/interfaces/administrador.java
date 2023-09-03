package interfaces;

import controler.CtrGestionCajeros;
import controler.CtrLogin;
import controler.CtrProductosAdmin;
import controler.CtrVistaVentas;
import modelo.datosuser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class administrador extends JFrame {
    private JPanel admin;
    private JButton ventasButton;
    private JButton ingresarproducButton;
    private JButton agregarButton;
    private JButton regresarButton;
    private JLabel nombreadmin;
    private JLabel correoadmin;

    private datosuser datosuser;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Administrador");
        frame.setContentPane(new administrador().admin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
