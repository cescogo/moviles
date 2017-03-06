/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import AccesoDatos.AccesoDB;
import Modelo.Persona;

/**
 *
 * @author ccg
 */
public class ControlVis {

    public ControlVis() {
        inter= new VentanaInicio(this);
        accesoD= new AccesoDB();
    }
       
    public void iniciar()
    {
        inter.init();
       
    }
    
    public int login(String user,String pass)
    {
        Persona p= new Persona(0);
        accesoD.validaUser(p, user, pass);
        return p.getTipo();
       
        
        
    }
     private VentanaInicio inter;
     private AccesoDB accesoD;
}
