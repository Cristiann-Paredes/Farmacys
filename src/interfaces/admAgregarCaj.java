package interfaces;

import javax.swing.*;
import java.awt.*;

public class admAgregarCaj extends JFrame {
    private JPanel agregarcajeros;
    private JTextField apellidotextField;
    private JTextField nombretextField;
    private JTextField idtextField;
    private JTextField dirrecciontextField;
    private JTextField telefonotextField;
    private JTextField usuariotextField;
    private JTextField contrasenatextField;
    private JTextField correotextField;
    private JButton buscarCajeroButton;
    private JButton eliminarCajeroButton;
    private JButton actualizarCajeroButton;
    private JButton aagregarCajeroButton;
    private JButton regresarButton;
    private JButton salirLoginButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("admAgregarCaj");
        frame.setContentPane(new admAgregarCaj().agregarcajeros);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(800, 480));
        frame.setVisible(true);
    }

}
