package moviles;
import Vista.VentanaAdministrador;
import Conexion.ConexionBD;
import Vista.*;
import Modelo.*;

public class Moviles {

    public static void main(String[] args) {
        // TODO code application logic here
//        ConexionBD con = new ConexionBD();
//        Persona aux=new Persona();
//        Lista l= new Lista();
//        
//        con.mostrar(aux,l);
//        System.out.println(l.toString());
//       Profesor pro= new Profesor(8888,"@","allan","51","56");
//       Administrador ad= new Administrador(7894,"@","marta","1234","12");
//       Alumno alu= new Alumno(456,"@","marco","789","25/03/1995","4568");
//       Carrera car= new Carrera("info","eif");
//       Ciclo ci= new Ciclo("20171",2017,1,"13/02/2017","28/06/2017");
//       Curso cu= new Curso("406","ing.Sis.3",3,10,"eif",1);
//       Grupo gru= new Grupo("406-01",'1',01," ","51","406");
//       Matriculador ma= new Matriculador(894,"@","maria","234","12");
//        con.agrega(pro);
//        con.agrega(ad);
//        con.agrega(alu);
//        con.agrega(car);
//        con.agrega(ci);
//        con.agrega(cu);
//        con.agrega(gru);
//        con.agrega(ma);
//        System.out.println("luego de la insercion");
//        VentanaInicio vi= new VentanaInicio();
//       vi.init();
//        con.mostrar(aux,l);
//        System.out.println(l.toString());
//         System.out.println("persona especifica: ");
//         Lista p= new Lista();
//         con.Buscar(aux, "51");
//         System.out.println(aux.toString());
        VenOpcMatriculador va= new  VenOpcMatriculador();
        va.init();
        
    }
    
}
