package Modelo;


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
    
    public Lista()
    {
        lista= new ArrayList();
    }

   public void agregar(Object e)
   {
       lista.add(0, e);
   }

   public void eliminar(Object e)
   {
       lista.remove(e);
   }

    @Override
    public String toString() {
       return lista.toString();
    }
    
   public int size()
   {
       return lista.size();
   }
   
   public Object getElemento(int index)
   {
       return lista.get(index);
   }
    
}
