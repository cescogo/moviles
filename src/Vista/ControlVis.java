/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import AccesoDatos.AccesoDB;
import Modelo.Administrador;
import Modelo.Alumno;
import Modelo.Ciclo;
import Modelo.Curso;
import Modelo.Grupo;
import Modelo.Matriculador;
import Modelo.Persona;
import Modelo.Profesor;

/**
 *
 * @author ccg
 */
public class ControlVis {

    public ControlVis() {
        //inter= new VentanaInicio(this);
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
    
      public void agregarProfesor(String nombre, String cedula, String telefono, String email, String clave)
    {
        int tel=Integer.parseInt(telefono);
        Profesor p= new Profesor( tel, email,  nombre, cedula, clave);
        accesoD.agrega(p);
    }
    
    public void agregarAlumno(String nombre, String cedula,String Fec_Nac, String telefono, String email, String clave)
    {
        int tel=Integer.parseInt(telefono);
        Alumno p= new Alumno(tel,  email, nombre, cedula, Fec_Nac, clave);
        accesoD.agrega(p);
    }
    
      public void agregarCiclo(int anno, int nciclo, String Finicio, String Ffinal)
    {
        String id = String.valueOf(anno)+String.valueOf(nciclo);
        Ciclo p= new Ciclo(id,anno,nciclo,Finicio,Ffinal);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
      
        public void agregarCurso(String codigo, String nombre, int creditos, int hsemanales,String carrera,int num_ciclo)
    {
        Curso p= new Curso(codigo,nombre,creditos,hsemanales,carrera,num_ciclo);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
        
        public void agregarGrupo(char ciclo, int numero, String horario, String profesor, String curso)
    {
        String id=curso+'-'+String.valueOf(numero);
        Grupo p= new Grupo(id,ciclo, numero,horario,profesor,curso);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
           
        public void agregarMatriculador(String telefono, String email, String nombre, String cedula, String clave)
    {
        int tel=Integer.parseInt(telefono);
        Matriculador p= new Matriculador(tel,  email,  nombre, cedula, clave);
        accesoD.agrega(p);
    }
          public void agregarAdministrador(String nombre, String cedula, String telefono, String email, String clave)
    {
        int tel=Integer.parseInt(telefono);
        Administrador p= new Administrador(tel, email, nombre, cedula, clave);
        accesoD.agrega(p);
    }
          public void eliminarPersona(String id)
          {
              accesoD.eliminar(id);
          }
     private VentanaInicio inter;
     private AccesoDB accesoD;
}
