package moviles;
import Conexion.ConexionBD;
import Vista.VentanaInicio;
import Modelo.*;

public class Moviles {

    public static void main(String[] args) {
        // TODO code application logic here
        ConexionBD con = new ConexionBD();
        con.mostrarUsuarios();
       Alumno pro= new Alumno(8888,"@","allan","514","12/11/1993","56");
        con.agregaPersona(pro);
        System.out.println("luego de la insercion");
        VentanaInicio vi= new VentanaInicio();
        vi.init();
       con.mostrarUsuarios();
    }
    
}
