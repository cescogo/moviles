
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ccg
 */
public class Lista {
    private ArrayList lista;

   public void agregar(Object e)
   {
       lista.add(0, e);
   }

   public void eliminar(Object e)
   {
       lista.remove(e);
   }
    
    
}
