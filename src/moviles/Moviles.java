package moviles;
import Conexion.ConexionBD;
import Vista.VentanaInicio;
import Modelo.*;

public class Moviles {

    public static void main(String[] args) {
        // TODO code application logic here
        ConexionBD con = new ConexionBD();
        con.mostrarUsuarios();
        Usuario u= new Usuario("2","2",1);
        con.agregaUsusario(u);
        System.out.println("luego de la insercion");
//        VentanaInicio vi= new VentanaInicio();
       // vi.init();
       con.mostrarUsuarios();
    }
    
}
