package interfaces;

import javax.swing.*;

public class admProductos {
    private JPanel admProductos;
    private JTextField idtextField;
    private JTextField nombretextField;
    private JTextField descripciontextField;
    private JTextField inventariotextField;
    private JTextField preciotextField;
    private JTextField proveedortextField;
    private JTable informacion;
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
