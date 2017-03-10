package moviles;
import AccesoDatos.AccesoDB;
import Vista.*;
import Modelo.*;
import Control.Control;
public class Moviles {

    public static void main(String[] args) {

//      VentanaInicio vi= new VentanaInicio();
//       vi.init();
       Control ctrl  = new Control();
//       Interfaz in = new Interfaz(ctrl);
//           in.initB();
        
       VenDesmatricular m= new VenDesmatricular(ctrl);
       m.init();
//           
    }
    
}
