package interfaces;

import javax.swing.*;

public class admRevVentas {
    private JPanel admVentas;
    private JButton regresarButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTable table1;
    private JButton buscarButton;
    private JButton registarButton;
    private JButton seleccionarButton;
    private JButton limpiarButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("admRevVentas");
        frame.setContentPane(new admRevVentas().admVentas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
