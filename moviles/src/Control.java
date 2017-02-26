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
    
    private void agregarProfesor(String telefono, String email, String nombre, String cedula, String clave)
    {
        Profesor p= new Profesor( telefono, email,  nombre, cedula,  clave);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
    
    private void agregarAlumno(String carrera, String Fec_Nac, String telefono, String email, String nombre, String cedula, String clave)
    {
        Alumno p= new Alumno(carrera,  Fec_Nac, telefono,  email, nombre,  cedula,  clave);
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
           
        private void agregarMatriculador(String telefono, String email, String nombre, String cedula, String clave)
    {
        Matriculador p= new Matriculador(telefono,  email,  nombre, cedula, clave);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
          private void agregarAdministrador(String telefono, String email, String nombre, String cedula, String clave)
    {
        Administrador p= new Administrador(telefono,  email,  nombre, cedula, clave);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }
}
