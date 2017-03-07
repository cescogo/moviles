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

//<editor-fold desc="Metodos de Carrera">
    public void agregarCarrera(String nomcar, String codCAr) {
        Carrera car = new Carrera(nomcar, codCAr);
        accesoD.agrega(car);
    }

    public void BorrarCarrera(String c) {
        accesoD.eliminarCarrera(c);
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

    public void ActualizarCarrera(Carrera a) {
        accesoD.Actualiza(a);
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
    public void agregarAlumno(String nombre, String cedula, String Fec_Nac, int telefono, String email, String clave,String codCarr) {
        Alumno p = new Alumno(telefono, email, nombre, cedula, Fec_Nac, clave,codCarr);
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

    public void agregarP(Persona a) {
        accesoD.agrega(a);
    }

    public boolean borrarP(String id) {
        return accesoD.eliminar(id);

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

    public void buscarPer(Persona a, String ced) {
        accesoD.Buscar(a, ced);
    }

    public void mostrarPCar(String carr, Lista l) {
        accesoD.BuscarEstCarr(carr, l);
    }

    public void actualizaP(Persona p) {
        accesoD.Actualiza(p);
    }

//</editor-fold>
    public void ofertaAcd(String Carrera, int ciclo, Lista cursos) {
        accesoD.ofertaAcd(Carrera, ciclo, cursos);
    }

    public void BuscarGrpCrs(String curso, Lista grupos) {
        accesoD.BuscarGrpCrs(curso, grupos);
    }
//    private void Adminciclo() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
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

    public void ConsultaHistorial(String ced, Lista l) {
        accesoD.Historial(ced, l);
    }

    public void matriculados(String ced, Lista l) {
        accesoD.Matriculados(ced, l);
    }
//
//    private void FuncProfesor() {
//        inter.BienvInter(3);
//
//    }
//    

//<editor-fold desc="Metodos de Ciclo">
    public void agregarCiclo(int anno, int nciclo, String Finicio, String Ffinal) {
        String id = String.valueOf(anno) + String.valueOf(nciclo);
        Ciclo p = new Ciclo(id, anno, nciclo, Finicio, Ffinal);
        accesoD.agrega(p);
    }

    public void buscar(Ciclo c, String id) {
        accesoD.Buscar(c, id);
    }

    public void actualizar(Ciclo c, String id) {
        accesoD.Actualiza(c, id);
    }
    //</editor-fold>

    public void agregarGrupo(char ciclo, int numero, String horario, String profesor, String curso) {
        String id = curso + '-' + String.valueOf(numero);
        Grupo p = new Grupo(id, ciclo, numero, horario, profesor, curso);
        accesoD.agrega(p);
    }

    public void Bcgrupo(String id_g, int ngrp, Grupo p) {
        accesoD.Buscar(p, id_g, ngrp);
    }

    private Persona user;
    private AccesoDB accesoD;
}
