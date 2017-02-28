package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ccg
 */
public class Control {
    
    private void agregarProfesor(String nombre, String cedula, int telefono, String email, String clave)
    {
        Profesor p= new Profesor( nombre, cedula,  telefono, email,  clave);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
    
    private void agregarAlumno(String nombre, String cedula,String Fec_Nac, int telefono, String email, String Cod_Car, String clave)
    {
        Alumno p= new Alumno(nombre,  cedula, Fec_Nac,  telefono, email,Cod_Car,  clave);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
    
      private void agregarCiclo(int anno, char nciclo, String Finicio, String Ffinal)
    {
        Ciclo p= new Ciclo(anno,nciclo,Finicio,Ffinal);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
      
        private void agregarCurso(String codigo, String nombre, int creditos, int hsemanales,String carrera)
    {
        Curso p= new Curso(codigo,nombre,creditos,hsemanales,carrera);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
        
        private void agregarGrupo(char ciclo, int numero, String horario, String profesor, String curso)
    {
        Grupo p= new Grupo(ciclo, numero,horario,profesor,curso);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
           
        private void agregarMatriculador(int telefono, String email, String nombre, String cedula, String clave)
    {
        Matriculador p= new Matriculador(telefono,  email,  nombre, cedula, clave);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
          private void agregarAdministrador(String nombre, String cedula, int telefono, String email, String clave)
    {
        Administrador p= new Administrador(nombre, cedula,  telefono, email, clave);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
}
