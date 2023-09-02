package interfaces;

import javax.swing.*;

public class administrador extends JFrame {
    private JPanel admin;
    private JButton VENTASDEPRODUCTOSButton;
    private JButton INGRESARNUEVOPRODUCTOButton;
    private JButton AGREGARNUEVOCAJEROButton;
    private JButton regresarButton;
    private JLabel nombreadmin;
    private JLabel correoadmin;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Administrador");
        frame.setContentPane(new administrador().admin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
