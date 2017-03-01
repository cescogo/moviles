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
        Profesor p= new Profesor( telefono, email,  nombre, cedula, clave);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
    
    private void agregarAlumno(String nombre, String cedula,String Fec_Nac, int telefono, String email, String clave)
    {
        Alumno p= new Alumno(telefono,  email, nombre, cedula, Fec_Nac, clave);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
    
      private void agregarCiclo(int anno, int nciclo, String Finicio, String Ffinal)
    {
        String id = String.valueOf(anno)+String.valueOf(nciclo);
        Ciclo p= new Ciclo(id,anno,nciclo,Finicio,Ffinal);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
      
        private void agregarCurso(String codigo, String nombre, int creditos, int hsemanales,String carrera,int num_ciclo)
    {
        Curso p= new Curso(codigo,nombre,creditos,hsemanales,carrera,num_ciclo);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
        
        private void agregarGrupo(char ciclo, int numero, String horario, String profesor, String curso)
    {
        String id=curso+'-'+String.valueOf(numero);
        Grupo p= new Grupo(id,ciclo, numero,horario,profesor,curso);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
           
        private void agregarMatriculador(int telefono, String email, String nombre, String cedula, String clave)
    {
        Matriculador p= new Matriculador(telefono,  email,  nombre, cedula, clave);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
          private void agregarAdministrador(String nombre, String cedula, int telefono, String email, String clave)
    {
        Administrador p= new Administrador(telefono, email, nombre, cedula, clave);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
}
