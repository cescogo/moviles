package Control;

import AccesoDatos.AccesoDB;
import Vista.*;
import Modelo.*;

public class Control {

    public Control() {
        this.user = new Persona();
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
            inter.solicitaUsr();
            String use = String.valueOf(inter.leerI());
            inter.solicitaPass();
            String pas = inter.leerS();
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
        while(opc != 5){
            inter.menuCarr();
            switch(inter.leerI()){    
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
                case 6: opc = 5;
                break;
        }
        }
    }
    private void agregarCarrera(String nomcar, String codCAr) {
        Carrera car = new Carrera(nomcar,codCAr);
        accesoD.agrega(car);
    }
    private void crearCarrera() {
        inter.SolicitaNomCarrera();
        String nomcar = inter.leerS();
        inter.SolicitaCodCarrera();
        String codCAr = inter.leerS();
        agregarCarrera(nomcar,codCAr);
    }
    private void BorrarCarrera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void MostrarCarrera() {
        int p = 0; 
        Carrera C = new Carrera();
        while(p!= 3){
            inter.BusqCar();
            p = inter.leerI();
            switch(p){
                case 1:
                    inter.SolicitaCodCarrera();
                    accesoD.BuscarCarreraCod(C, inter.leerS());
                    break;
                case 2:
                    inter.SolicitaNomCarrera();
                    accesoD.BuscarCarreraNom(C, inter.leerS());
                    break;
                default: inter.ERROR();
            }
            System.out.println(C.toString());
        }
    }
    private void MostrarCarreras() {
         Lista l = new Lista();
         accesoD.mostrar(l);
         System.out.println(l.toString());
       }
    private void ActualizarCarrera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//</editor-fold>

//<editor-fold desc="Metodos de Curso">
   private void AdminCurso() {
     int opc = 0;
        while(opc != 5){
            inter.menuCurso();
            switch(inter.leerI()){    
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
                case 6: opc = 5;
                break;
        }
    }
    }
   private void crearCurso() {
         inter.SolicitaCodCurso();String cod = inter.leerS();
         inter.SolicitaNomCurso();String nom = inter.leerS();
         inter.SolicitaCreditos();int creditos = inter.leerI();
         inter.SolicitaHsemanal();int hsemanales = inter.leerI();
         inter.SolicitaCodCarrera();String carrera = inter.leerS(); 
         inter.SolicitaCiclo();int num_ciclo = inter.leerI();
         Curso cur = new Curso();
         accesoD.agrega(cur);         
    }
   private void BorrarCurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   private void MostrarCurso() {
          int p = 0; 
        Curso C = new Curso();
        while(p!= 4){
            inter.BusqCurso();
            p = inter.leerI();
            switch(p){
                case 1:
                    inter.SolicitaCodCurso();
                    accesoD.BuscarCursoCod(C, inter.leerS());
                    break;
                case 2:
                    inter.SolicitaNomCurso();
                    accesoD.BuscarCursoNom(C,inter.leerS());
                    break;
                case 3: 
                    inter.SolicitaNomCarrera();
                    accesoD.BuscarCursoCar(C, inter.leerS());
                default: inter.ERROR();
            }
            System.out.println(C.toString());
        }
    }
   private void MostrarCursos() {
         Curso C = new Curso();
         Lista l = new Lista();
         accesoD.mostrar(C, l);
         System.out.println(l.toString());
    }
   private void ActualizarCurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   //</editor-fold>
   
//<editor-fold desc="Metodos de Profesores">
    private void AdminProfes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void FuncProfesor() {
        inter.BienvInter(3);
    }

   //</editor-fold>

//<editor-fold desc="Metodos de Carrera"> 
    private void AdminEst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   //</editor-fold>
   
//<editor-fold desc="Metodos de Alumno">
    private void FuncAlumno() {
        inter.BienvInter(4);
    }
    private void ConsultaHistorial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    private void FuncMatriculador() {
        inter.BienvInter(2);
    }
    private void AdminMatricula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   



  
}
