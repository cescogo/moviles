package moviles;
import Conexion.ConexionBD;

public class Moviles {

    public static void main(String[] args) {
        // TODO code application logic here
        ConexionBD con = new ConexionBD();
        con.init();
        System.out.println("cesar y marco se maman");
    }
    
}
