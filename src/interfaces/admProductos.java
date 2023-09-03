package interfaces;

import javax.swing.*;

public class admProductos {
    private JPanel admProductos;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTable table1;
    private JButton regresarButton;
    private JButton agregarButton;
    private JButton actualizarButton;
    private JButton buscarButton;
    private JButton eliminarButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("admProductos");
        frame.setContentPane(new admProductos().admProductos);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
