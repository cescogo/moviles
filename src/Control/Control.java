package Control;

import AccesoDatos.AccesoDB;
import Vista.*;
import Modelo.*;

public class Control {

    public Control() {
        this.user = new Persona(0);
        this.accesoD = new AccesoDB();
        this.inter = new Interfaz();
    }

    public boolean verificaUsuario(String usr, String pass) {
        accesoD.validaUser(user, usr, pass);
        if (user == null || user.getCedula() == "") {
            return false;
        }
        return true;
    }

    public void init() {
        int opc = 0;
        while (opc != 2) {
            inter.menuLogin();
            String use = inter.solicitaUsr();
            String pas = inter.solicitaPass();
            if (verificaUsuario(use, pas)) {
                switch (user.getTipo()) {
                    case 1:
                        FuncAdministrativas();
                        break;
                    case 2:
                        FuncMatriculador();
                        break;
                    case 3:
                        FuncProfesor();
                        break;
                    case 4:
                        FuncAlumno();
                }
            }
            if (use.toLowerCase() == "salir") {
                opc = 2;
            }

        }

    }
    private Interfaz inter;
    private Persona user;
    private AccesoDB accesoD;

    private void FuncAdministrativas() {
        inter.BienvInter(1);
        int opc = -1;
        while (opc != 10) {
            inter.MenuAdministrador();
            switch (inter.leerI()) {
                case 1:
                    AdminCarrera();
                    break;
                case 2:
                    AdminCurso();
                    break;
                case 3:
                    AdminProfes();
                    break;
                case 4:
                    AdminEst();
                    break;
                case 5:
                    Adminciclo();
                    break;
                case 6:
                    AdminOferta();
                    break;
                case 7:
                    AdminMatricula();
                    break;
                case 8:
                    ConsultaHistorial();
                    break;
                case 9:
                    AgregarAcceso();
                    break;
                case 10:
                    opc = 10;
                    break;
                default:
                    inter.ERROR();
                    break;
            }
        }
    }

//<editor-fold desc="Metodos de Carrera">
    private void AdminCarrera() {
        int opc = 0;
        while (opc != 5) {
            inter.menuCarr();
            switch (inter.leerI()) {
                case 1:
                    crearCarrera();
                    break;
                case 2:
                    BorrarCarrera();
                    break;
                case 3:
                    MostrarCarrera();
                    break;
                case 4:
                    MostrarCarreras();
                    break;
                case 5:
                    ActualizarCarrera();
                    break;
                case 6:
                    opc = 5;
                    break;
            }
        }
    }

    private void agregarCarrera(String nomcar, String codCAr) {
        Carrera car = new Carrera(nomcar, codCAr);
        accesoD.agrega(car);
    }

    private void crearCarrera() {
        inter.SolicitaNomCarrera();
        String nomcar = inter.leerS();
        inter.SolicitaCodCarrera();
        String codCAr = inter.leerS();
        agregarCarrera(nomcar, codCAr);
    }

    private void BorrarCarrera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void MostrarCarrera() {
        int p = 0;
        Carrera C = new Carrera();
        while (p != 3) {
            inter.BusqCar();
            p = inter.leerI();
            switch (p) {
                case 1:
                    inter.SolicitaCodCarrera();
                    accesoD.BuscarCarreraCod(C, inter.leerS());
                    break;
                case 2:
                    inter.SolicitaNomCarrera();
                    accesoD.BuscarCarreraNom(C, inter.leerS());
                    break;
                default:
                    inter.ERROR();
            }
            System.out.println(C.toString());
        }
    }

    private void MostrarCarreras() {
        Lista l = new Lista();
        accesoD.mostrarCAs(l);
        System.out.println(l.toString());
    }

    private void ActualizarCarrera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//</editor-fold>

//<editor-fold desc="Metodos de Curso">
    private void AdminCurso() {
        int opc = 0;
        while (opc != 5) {
            inter.menuCurso();
            switch (inter.leerI()) {
                case 1:
                    crearCurso();
                    break;
                case 2:
                    BorrarCurso();
                    break;
                case 3:
                    MostrarCurso();
                    break;
                case 4:
                    MostrarCursos();
                    break;
                case 5:
                    ActualizarCurso();
                    break;
                case 6:
                    opc = 5;
                    break;
            }
        }
    }

    private void crearCurso() {
        inter.SolicitaCodCurso();
        String cod = inter.leerS();
        inter.SolicitaNomCurso();
        String nom = inter.leerS();
        inter.SolicitaCreditos();
        int creditos = inter.leerI();
        inter.SolicitaHsemanal();
        int hsemanales = inter.leerI();
        inter.SolicitaCodCarrera();
        String carrera = inter.leerS();
        inter.SolicitaCiclo();
        int num_ciclo = inter.leerI();
        Curso cur = new Curso(cod, nom, creditos, hsemanales, carrera, num_ciclo);
        accesoD.agrega(cur);
    }

    private void BorrarCurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void MostrarCurso() {
        int p = 0;
        Curso C = new Curso();
        while (p != 4) {
            inter.BusqCurso();
            p = inter.leerI();
            switch (p) {
                case 1:
                    inter.SolicitaNomCurso();
                    accesoD.BuscarCursoNom(C, inter.leerS());
                    System.out.println(C.toString());
                    break;
                case 2:
                    inter.SolicitaCodCurso();
                    accesoD.BuscarCursoCod(C, inter.leerS());
                    System.out.println(C.toString());
                    break;
                case 3:
                    Lista l = new Lista();
                    inter.SolicitaCodCarrera();
                    accesoD.BuscarCursoCar(l, inter.leerS());
                    System.out.println(l.toString());
                    break;
                default:
                    inter.ERROR();
            }
        }
    }

    private void MostrarCursos() {
        Lista l = new Lista();
        accesoD.mostrarCUs(l);
        System.out.println(l.toString());
    }

    private void ActualizarCurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //</editor-fold>

//<editor-fold desc="Metodos de Profesores">
    private void AdminProfes() {
        int opc = 0;
        while (opc != 5) {
            inter.MenuProfesor();
            switch (opc = inter.leerI()) {
                case 1:
                    crearProfe();
                    break;
                case 2:
                    BorrarProfe();
                    break;
                case 3:
                    MostrarProfe();
                    break;
                case 4:
                    ActualizarProfe();
                    break;
                default: inter.ERROR();
                    break;
            }
        }
    }
    private void crearProfe() {
        int tel = inter.SolicitaTelefono();
        String mail = inter.SolicitaEmail();
        String nom = inter.SolicitaNombres();
        String id = inter.SolicitaCedulas();
        inter.solicitaPass();
        String pass = inter.leerS();
        Profesor p = new Profesor(tel, mail, nom, id, pass);
        agregar(p);
    }
    private void BorrarProfe() {
        String ced = inter.SolicitaCedulas();
        if(borrar(ced))inter.SucceDel();
        else inter.ErrorDel();
    }
    private void MostrarProfe() {
        int p = 0;
        Profesor per = new Profesor();

        while (p != 3) {
            inter.BusqProf();
            p = inter.leerI();
            switch (p) {
                case 1:
                    mostrarCed(per, inter.SolicitaCedulas());
                    System.out.println(per.toString());
                    break;
                case 2:
                    mostrarNom(inter.SolicitaNombres());
                    break;
                default:
                    inter.ERROR();
            }
        }
    }
    private void ActualizarProfe() {
        Profesor pro = new Profesor();
        mostrarCed(pro, inter.SolicitaCedulas());

        if (pro.getCedula() != "") {
            int p = 0;
            while (p != 5) {
                p = inter.ModifProf();
                switch (p) {
                    case 1://nombre
                        String nom = inter.SolicitaNombres();
                        if(nom != "")
                            pro.setNombre(nom);
                        break;
                    case 2://pass
                        String pass = inter.solicitaPass();
                        if(pass != "")pro.setClave(pass);
                        break;
                    case 3://correo
                         String correo = inter.SolicitaEmail();
                        if(correo != "")pro.setEmail(correo);
                        break;
                    case 4://telefono
                        int tel = inter.SolicitaTelefono();
                        if(tel != 0)pro.setTelefono(tel);
                        break;
                    default:
                        inter.ERROR();
                }
            }
        }
        else{ inter.ERROR();
                return;
        }
        actualiza(pro);
    }
//</editor-fold>
    
//<editor-fold desc="Metodos de Alumno">
    private void AdminEst() {
      int opc = 0;
        while (opc != 5) {
            inter.MenuProfesor();
            switch (opc = inter.leerI()) {
                case 1:
                    crearEst();
                    break;
                case 2:
                    BorrarEst();
                    break;
                case 3:
                    MostrarEst();
                    break;
                case 4:
                    ActualizarEst();
                    break;
                default: inter.ERROR();
                    break;
            }
        }
    }
    private void crearEst() {
        String nom = inter.SolicitaNombres();
        String id = inter.SolicitaCedulas();
        String FN = inter.SolicitaFec_Nac();
        int tel = inter.SolicitaTelefono();
        String mail = inter.SolicitaEmail();
        String pass = inter.solicitaPass();
        Alumno almn = new Alumno(tel, mail, nom, id, FN, pass);
        agregar(almn);
    }
    private void BorrarEst() {
        String ced = inter.SolicitaCedulas();
        if(borrar(ced))inter.SucceDel();
        else inter.ErrorDel();
    }
    private void MostrarEst() {
        int p = 0;
        Alumno al = new Alumno();
        while (p != 4) {
            inter.BusqAlmn();
            
            switch (p = inter.leerI()) {
                case 1:
                    mostrarCed(al, inter.SolicitaCedulas());
                    System.out.println(al.toString());
                    break;
                case 2:
                    mostrarNom(inter.SolicitaNombres());
                    break;
                case 3:
                    //buscar carrera
                    break;
                default:
                    inter.ERROR();
            }
        }
    }
    private void ActualizarEst() {
        Alumno al= new Alumno();
        mostrarCed(al, inter.SolicitaCedulas());

        if (al.getCedula() != "") {
            int p = 0;
            while (p != 5) {
                p = inter.ModifAlmn();
                switch (p) {
                    case 1://nombre
                        String nom = inter.SolicitaNombres();
                        if(nom != "")
                            al.setNombre(nom);
                        break;
                    case 2://pass
                        String pass = inter.solicitaPass();
                        if(pass != "")al.setClave(pass);
                        break;
                    case 3://correo
                         String correo = inter.SolicitaEmail();
                        if(correo != "")al.setEmail(correo);
                        break;
                    case 4://telefono
                        int tel = inter.SolicitaTelefono();
                        if(tel != 0)al.setTelefono(tel);
                        break;
                    default:
                        inter.ERROR();
                }
            }
        }
        else{ inter.ERROR();
                return;
        }
        actualiza(al);
    }
//</editor-fold>
    
    private void ConsultaHistorial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//<editor-fold desc="Metodos de Persona">
    public void agregar(Persona a) {
        accesoD.agrega(a);
    }

    public boolean borrar(String id) {
        if(accesoD.eliminar(id))return true;
        return false;
    }

    public void mostrarNom(String nom) {
//     Persona a  = new Persona();
//     accesoD.BuscarPersonaNombre(a, nom);
//     System.out.println(a.toString());
    }

    public void mostrarCed(Persona a, String ced) {
        accesoD.BuscarPersonaId(a, ced);
    }

    public void mostrarCar(String carr) {
        Alumno a = new Alumno();
        accesoD.BuscarPersonaCarrera(a, carr);
    }
    public void actualiza(Persona p){
        accesoD.Actualiza(p);
    }

//</editor-fold>

    private void Adminciclo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void AdminOferta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void AgregarAcceso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void AdminMatricula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void FuncMatriculador() {
        inter.BienvInter(2);
    }

    private void FuncAlumno() {
        inter.BienvInter(4);
    }

    private void FuncProfesor() {
        inter.BienvInter(3);

    }

}
