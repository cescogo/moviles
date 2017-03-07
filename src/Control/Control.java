package Control;

import AccesoDatos.AccesoDB;
import Modelo.*;

public class Control {

    public Control() {
        this.user = new Persona(0);
        this.accesoD = new AccesoDB();

    }

    public int verificaUsuario(String usr, String pass) {
        accesoD.validaUser(user, usr, pass);
        return user.getTipo();
    }

    private Persona user;
    private AccesoDB accesoD;

//<editor-fold desc="Metodos de Carrera">
    public void agregarCarrera(String nomcar, String codCAr) {
        Carrera car = new Carrera(nomcar, codCAr);
        accesoD.agrega(car);
    }

    public void BorrarCarrera(String c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void MostrarCarreraC(Carrera C, String c) {
        accesoD.BuscarCarreraCod(C, c);
    }

    public void MostrarCarreraN(Carrera C, String c) {
        accesoD.BuscarCarreraNom(C, c);
    }

    public void MostrarCarreras(Lista l) {
        accesoD.mostrarCAs(l);
    }

    public void ActualizarCarrera(String cod, String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//</editor-fold>

//<editor-fold desc="Metodos de Curso">
    public void agregarCurso(String cod, String nom, int cre, int hsm, String cca, int C) {
        Curso c = new Curso(cod, nom, cre, hsm, cca, C);
        accesoD.agrega(c);
    }

    public boolean BorrarCurso(String cod) {
        return accesoD.eliminarCurso(cod);
    }

    public void MostrarCurso(Curso C, String cod, int t) {
        if (t == 1) {
            accesoD.BuscarCursoNom(C, cod);
        }
        if (t == 2) {
            accesoD.BuscarCursoCod(C, cod);
        }
    }

    public void MostrarCursos(Lista l, String cod) {
        accesoD.BuscarCursoCar(l, cod);
    }

    public void ActualizarCurso(Curso c) {
        accesoD.Actualiza(c);
    }
    //</editor-fold>

//<editor-fold desc="Metodos de Profesores">
    public void agregarProfesor(String nombre, String cedula, int telefono, String email, String clave) {
        Profesor p = new Profesor(telefono, email, nombre, cedula, clave);
        agregarP(p);
    }

//</editor-fold>
//<editor-fold desc="Metodos de Persona">
    public void agregarP(Persona a) {
        accesoD.agrega(a);
    }

    public boolean borrarP(String id) {
        if (accesoD.eliminar(id)) {
            return true;
        }
        return false;
    }

    public void mostrarProNom(String nom, Lista l) {
        accesoD.BuscarPrfNombre(nom, l);
    }

    public void mostrarEstNom(String nom, Lista l) {
        accesoD.BuscarEstNom(nom, l);
    }

    public void mostrarPCed(Persona a, String ced) {
        if (a instanceof Profesor) {
            accesoD.BuscarPrfId(a, ced);
        }
        if (a instanceof Alumno) {
            accesoD.BuscarEStId(a, ced);
        }
         if (a instanceof Administrador) {
            accesoD.BuscarAdmId(a, ced);
        }
         if (a instanceof Matriculador) {
            accesoD.BuscarMtr(a, ced);
        }
    }

    public void mostrarPCar(String carr, Lista l) {
        accesoD.BuscarEstCarr(carr, l);
    }

    public void actualizaP(Persona p) {
        accesoD.Actualiza(p);
    }

//</editor-fold>
//    private void Adminciclo() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void AdminOferta() {
//        int opc = 0;
//        String Carrera =  inter.SolicitaNomCarrera();
//        int ciclo =  inter.SolicitaCiclo();
//        Lista cursos =  new Lista();
//        accesoD.ofertaAcd(Carrera,ciclo,cursos);
//        System.out.println(cursos.toString());
//        opc = inter.Oferta();
//        if(opc == 1){
//            String curso = inter.SolicitaCodCurso();
//            Lista grupos = new Lista();
//            accesoD.BuscarGrpCrs(curso, grupos);
//            
//            
//        }
//        
//    }
//
//    private void AgregarAcceso() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void AdminMatricula() {
//        String ced =  inter.SolicitaCedulas();
//        Alumno al = new Alumno();
//        mostrarCed(al, ced);
//        
//        
//    }
//
//    private void FuncMatriculador() {
//        inter.BienvInter(2);
//    }
//
//    private void FuncAlumno() {
//        inter.BienvInter(4);
//        int opc = 0 ;
//        while((opc = inter.leerI())!= 2)
//            if(opc ==1)
//                ConsultaHistorial();
//    }
//     private void ConsultaHistorial() {
//         Lista l =  new Lista();
//         if(user.getTipo() == 1)
//            accesoD.Historial(inter.SolicitaCedulas(),l);
//         else
//             accesoD.Historial(user.getCedula(), l);
//         System.out.println(l.toString());    
//     }
//
//    private void FuncProfesor() {
//        inter.BienvInter(3);
//
//    }
//    
    public void agregarAlumno(String nombre, String cedula, String Fec_Nac, int telefono, String email, String clave) {
        Alumno p = new Alumno(telefono, email, nombre, cedula, Fec_Nac, clave);
        accesoD.agrega(p);
    }

    public void agregarMatriculador(int telefono, String email, String nombre, String cedula, String clave) {
        Matriculador p = new Matriculador(telefono, email, nombre, cedula, clave);
        accesoD.agrega(p);
    }

    public void agregarAdministrador(String nombre, String cedula, int telefono, String email, String clave) {
        Administrador p = new Administrador(telefono, email, nombre, cedula, clave);
        accesoD.agrega(p);
    }

    public void agregarCiclo(int anno, int nciclo, String Finicio, String Ffinal) {
        String id = String.valueOf(anno) + String.valueOf(nciclo);
        Ciclo p = new Ciclo(id, anno, nciclo, Finicio, Ffinal);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }

    public void agregarGrupo(char ciclo, int numero, String horario, String profesor, String curso) {
        String id = curso + '-' + String.valueOf(numero);
        Grupo p = new Grupo(id, ciclo, numero, horario, profesor, curso);
        //llamar al met de acceso de datos para ingresar a la base de datos
    }

    public void eliminarPersona(String id) {
        accesoD.eliminar(id);
    }

}
