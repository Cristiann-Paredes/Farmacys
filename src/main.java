import controler.controlerlogin;
import model.datosuser;
import interfaces.admAgregarCaj;
import interfaces.admProductos;
import interfaces.cajero;
import interfaces.login;
import controler.controlerAgregarCaj;
import controler.controlerRevVentas;
//import controler.controlerProductos;
import controler.*;
public class main {
    public static void main(String[] args) {
        datosuser datosuser = new datosuser();
        login login = new login();
        new controlerlogin(login, datosuser);
        login.setVisible(true);
    }
}