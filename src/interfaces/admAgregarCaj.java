package interfaces;

import javax.swing.*;
import java.awt.*;

public class admAgregarCaj {
    private JPanel agregarcajeros;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField1;
    private JTextField textField4;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
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
