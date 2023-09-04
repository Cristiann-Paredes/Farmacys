package controler;

import interfaces.cajero;
import model.datosuser;
import model.ValidacionUsuarios;
import interfaces.login;
import interfaces.administrador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controlerlogin implements ActionListener{
    ValidacionUsuarios validaciondb = new ValidacionUsuarios();
    public login login;
    public datosuser datosuser;

    public controlerlogin(interfaces.login login, model.datosuser datosuser) {
        this.validaciondb = validaciondb;
        this.login = login;
        this.datosuser = datosuser;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == login.ingresarButton){
            //CODIGO PARA VALIDAR SI ES CAJERO O ADMINISTRADOR
            System.out.println("Boton ingresar presionado");
            ctrValidacionUsusario();
        }
    }
    private void ctrValidacionUsusario(){
        String rol = (String) login.rolComboBox.getSelectedItem();
        String usuario = login.usuariotextField.getText();
        char[] contra = login.contrasenaField.getPassword();
        String contrasena = new String(contra);

        if (rol.equals("ADMIN")){
            String[] credenciales = validaciondb.validarAdministrador(usuario);
            datosuser.setNombre(credenciales[2]);
            datosuser.setCorreo(credenciales[3]);

            if (usuario.equals(credenciales[0]) && contrasena.equals(credenciales[1])){
                administrador vistapa = new administrador(datosuser);
                vistapa.setVisible(true);
                login.dispose();
            } else{
                JOptionPane.showMessageDialog(null,"Acceso denegado a administrador");
            }

        } else if (rol.equals("CAJERO")){
            String[] credenciales = validaciondb.validarCajero(usuario);
            if (usuario.equals(credenciales[0]) && contrasena.equals(credenciales[1])){
                cajero cajero = new cajero();
                datosuser.setId(credenciales[2]);
                new cajero(cajero, datosuser);
                cajero.setVisible(true);
                login.dispose();
            } else {
                JOptionPane.showMessageDialog(null,"Acceso denegado a cajero");
            }
        }
    }

}