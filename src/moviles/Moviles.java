package moviles;
import Conexion.ConexionBD;
import Vista.VentanaInicio;
import Modelo.*;

public class Moviles {

    public static void main(String[] args) {
        // TODO code application logic here
        ConexionBD con = new ConexionBD();
        con.mostrarUsuarios();
       // Profesor pro= new Profesor("allan","6",1,"@","123");
       // con.agregaProfesor(pro);
        System.out.println("luego de la insercion");
        VentanaInicio vi= new VentanaInicio();
        vi.init();
       con.mostrarUsuarios();
    }
    
}
