import controler.CtrGestionCajeros;
import controler.CtrLogin;
import controler.CtrProductosAdmin;
import controler.DatosCompartidos;
import controler.VistaCrudCajeroAdmi;
import controler.VistaCrudProductosAdmi;
import interfaces.VistaFacturaCajero;
import interfaces.VistaLogin;
import controler.*;

public class main {
    public static void main(String[] args) {
        DatosCompartidos dc = new DatosCompartidos();
        VistaLogin vl = new VistaLogin();
        new CtrLogin(vl, dc);
        vl.setVisible(true);
    }
}