package Vista;

import java.util.Scanner;
import Control.Control;
import Modelo.*;
import java.awt.List;

public class Interfaz {

    private Control ctrl;

    public Interfaz(Control cont) {
        ctrl = cont;
    }

    public void BienvInter(int t) {
        switch (t) {
            case 1:
                System.out.println("Area de adinistrador");
                break;
            case 2:
                System.out.println("Area de Matriculador");
                break;
            case 3:
                System.out.println("Area de Profesor");
                break;
            case 4:
                System.out.println("Area de Alumno");
                break;
        }
    }

    public void initB() {
        int opc = 0;
        while (opc != 2) {
            System.out.println("1--> ENTRAR");
            System.out.println("2--> SALIR");
            opc = leerI();
            if (opc == 1) {
                init();
            }
        }
    }

    public void init() {
        System.out.println("Bienvenido al programa de gestion academica");
        System.out.println("---------LOGIN---------");
        String usr = solicitaUsr();
        String pass = solicitaPass();
        int tipo = ctrl.verificaUsuario(usr, pass);
        switch (tipo) {
            case 1:
                FuncAdministrativas();
                break;
            case 2:
                int opc = 0;
                while((opc = nuevamatricula())!= 2)
                    if(opc==1)AdminMatricula();
                break;
            case 3:
                //FuncProfesor();
                break;
            case 4:
                FuncAlumno();
                //
                break;
            case 0:break;
                
        }

    }
    public int solicitaAlopc(){
        System.out.println("1->historial");
        System.out.println("2->salir");
        return leerI();
    }
    
        private void FuncAlumno() {
        BienvInter(4);
        int opc = 0 ;
        while((opc = solicitaAlopc())!= 2)
            if(opc ==1)
                ConsultaHistorial();
    }

    public String solicitaUsr() {
        System.out.println("Introdusca Usuario: ");
        String pass = "";
        Scanner entradaEscaner = new Scanner(System.in);
        pass = entradaEscaner.nextLine(); //Invocamos un método sobre un objeto Scanner
        return pass;

    }

    public String solicitaPass() {
        System.out.println("digite la contraseña:");
        String pass = "";
        Scanner entradaEscaner = new Scanner(System.in);
        pass = entradaEscaner.nextLine(); //Invocamos un método sobre un objeto Scanner
        return pass;
    }

    public void FuncAdministrativas() {
        BienvInter(1);
        int opc = -1;
        while (opc != 10) {
            MenuAdministrador();
            switch (opc = leerI()) {
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
                    //Adminciclo();
                    break;
                case 6:
                    Oferta();
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
                default:
                    ERROR();
                    break;
                }
        }
    }

    private void AdminCarrera() {
        int opc = 0;
        while (opc != 5) {
            menuCarr();
            switch (opc = leerI()) {
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

    private void crearCarrera() {
        String nomcar = SolicitaNomCarrera();
        String codCAr = SolicitaCodCarrera();
        ctrl.agregarCarrera(nomcar, codCAr);
    }

    public void BorrarCarrera() {
        String c = SolicitaCodCarrera();
        ctrl.BorrarCarrera(c);
    }

    public void MostrarCarrera() {
        int p = 0;
        Carrera c = new Carrera();
        while (p != 3) {
            BusqCar();
            switch (p = leerI()) {
                case 1:
                    ctrl.MostrarCarreraC(c, SolicitaCodCarrera());
                    break;
                case 2:
                    ctrl.MostrarCarreraN(c, SolicitaNomCarrera());
                    break;
                default:
                    ERROR();
            }
            System.out.println(c.toString());
        }
    }

    public void MostrarCarreras() {
        Lista l = new Lista();
        ctrl.MostrarCarreras(l);
        System.out.println(l.toString());
    }

    public void ActualizarCarrera() {
        Carrera a = new Carrera(SolicitaCodCarrera(), SolicitaNomCarrera());
        ctrl.ActualizarCarrera(a);
    }

    public void errorLogin() {
        System.out.println("Error Usuario o Contraseña incorrecta: ");
    }

    public void ERROR() {
        System.out.println("ERROR....");
    }

    private void AdminCurso() {
        int opc = 0;
        while (opc != 5) {
            menuCurso();
            switch (opc = leerI()) {
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
                    ActualizarCurso();
                    break;
                default:
                    ERROR();
            }
        }
    }

    private void crearCurso() {
        ctrl.agregarCurso(SolicitaCodCurso(), SolicitaNomCurso(), SolicitaCreditos(), SolicitaHsemanal(), SolicitaCodCarrera(), SolicitaCiclo());
    }

    private void BorrarCurso() {
        if (ctrl.BorrarCurso(SolicitaCodCurso())) {
            SucceDel();
        } else {
            ErrorDel();
        }
    }

    private void MostrarCurso() {
        int p = 0;
        Curso C = new Curso();
        while (p != 4) {
            BusqCurso();
            switch (p = leerI()) {
                case 1:
                    ctrl.MostrarCurso(C, SolicitaNomCurso(), 1);
                    System.out.println(C.toString());
                    break;
                case 2:
                    ctrl.MostrarCurso(C, SolicitaCodCurso(), 2);
                    System.out.println(C.toString());
                    break;
                case 3:
                    Lista l = new Lista();
                    ctrl.MostrarCursos(l, SolicitaCodCarrera());
                    System.out.println(l.toString());
                    break;
                default:
                    ERROR();
            }
        }
    }

    private void ActualizarCurso() {
        Curso s = new Curso();
        ctrl.MostrarCurso(s, SolicitaCodCurso(), 2);
        System.out.println(s.toString());
        if (s.getCodigo() != "") {
            int p = 0;
            while (p != 5) {
                
                switch (p = ModifProf()) {
                    case 1://nombre
                        String nom = SolicitaNomCurso();
                        if (nom != "") {
                            s.setNombre(nom);
                        }
                        break;
                    case 2:
                        int cr = SolicitaCreditos();
                        if (cr > 2 || cr < 5) {
                            s.setCreditos(cr);
                        }
                        break;
                    case 3://correo
                        int hr = SolicitaHsemanal();
                        if (hr > 1) {
                            s.setHsemanales(hr);
                        }
                        break;
                    case 4:
                        int ci = SolicitaCiclo();
                        if (ci == 1 || ci == 2) {
                            s.setNum_ciclo(ci);
                        }
                        break;
                    default:
                        ERROR();
                }
            }
        } else {
            ERROR();

        }
        ctrl.ActualizarCurso(s);
    }

    private void AdminProfes() {
        int opc = 0;
        while (opc != 5) {
            MenuProfesor();
            switch (opc = leerI()) {
                case 1:
                    crearProfe();
                    break;
                case 2:
                    BorrarPersona();
                    break;
                case 3:
                    MostrarProfe();
                    break;
                case 4:
                    ActualizarProfe();
                    break;
                default:
                    ERROR();
                    break;
            }
        }
    }

    private void crearProfe() {
        ctrl.agregarProfesor(SolicitaNombres(), SolicitaCedulas(), SolicitaTelefono(), SolicitaEmail(), solicitaPass());
    }

    private void BorrarPersona() {
        if (ctrl.borrarP(SolicitaCedulas())) {
            SucceDel();
        } else {
            ErrorDel();
        }
    }

    private void MostrarProfe() {
        int p = 0;
        Profesor per = new Profesor();
        while (p != 3) {
            BusqProf();
            switch (p = leerI()) {
                case 1:
                    ctrl.mostrarPCed(per, SolicitaCedulas());
                    System.out.println(per.toString());
                    break;
                case 2:
                    Lista l = new Lista();
                    ctrl.mostrarProNom(SolicitaNombres(), l);
                    System.out.println(l.toString());
                    break;
                default:
                    ERROR();
            }
        }
    }

    private void ActualizarProfe() {
        Profesor pro = new Profesor();
        ctrl.mostrarPCed(pro, SolicitaCedulas());
        if (pro.getCedula() != "") {
            int p = 0;
            while (p != 5) {
                switch (p = ModifProf()) {
                    case 1://nombre
                        String nom = SolicitaNombres();
                        if (nom != "") {
                            pro.setNombre(nom);
                        }

                        break;
                    case 2://pass
                        String pass = solicitaPass();
                        if (pass != "") {
                            pro.setClave(pass);
                        }
                        break;
                    case 3://correo
                        String correo = SolicitaEmail();
                        if (correo != "") {
                            pro.setEmail(correo);
                        }
                        break;
                    case 4://telefono
                        int tel = SolicitaTelefono();
                        if (tel != 0) {
                            pro.setTelefono(tel);
                        }
                        break;
                    default:
                        ERROR();
                }
            }
        } else {
            ERROR();
            return;
        }
        ctrl.actualizaP(pro);
    }

    private void AdminEst() {
        int opc = 0;
        while (opc != 5) {
            MenuAlumno();
            switch (opc = leerI()) {
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
                default:
                    ERROR();
                    break;
            }
        }
    }

    private void crearEst() {
        ctrl.agregarAlumno(SolicitaNombres(), SolicitaCedulas(), SolicitaFec_Nac(), SolicitaTelefono(), SolicitaEmail(), solicitaPass(),SolicitaCodCarrera());
    }

    private void BorrarEst() {
        if (ctrl.borrarP(SolicitaCedulas())) {
            SucceDel();
        } else {
            ErrorDel();
        }
    }

    private void MostrarEst() {
        int p = 0;
        Alumno per = new Alumno();
        while (p != 4) {
            BusqAlmn();
            switch (p = leerI()) {
                case 1:
                    ctrl.mostrarPCed(per, SolicitaCedulas());
                    System.out.println(per.toString());
                    break;
                case 2:
                    Lista l = new Lista();
                    ctrl.mostrarEstNom(SolicitaNombres(), l);
                    System.out.println(l.toString());
                    break;
                case 3:
                    // buscar carrera
                    Lista w = new Lista();
                    ctrl.mostrarPCar(SolicitaCodCarrera(), w);
                    System.out.println(w.toString());
                    break;
                default:
                    ERROR();
            }
        }
    }

    private void ActualizarEst() {
        Alumno al = new Alumno();
        ctrl.mostrarPCed(al, SolicitaCedulas());
        System.out.println(al.toString());

        if (al.getCedula() != "") {
            int p = 0;
            while (p != 5) {
                p = ModifAlmn();
                switch (p) {
                    case 1://nombre
                        String nom = SolicitaNombres();
                        if (nom != "") {
                            al.setNombre(nom);
                        }
                        break;
                    case 2://pass
                        String pass = solicitaPass();
                        if (pass != "") {
                            al.setClave(pass);
                        }
                        break;
                    case 3://correo
                        String correo = SolicitaEmail();
                        if (correo != "") {
                            al.setEmail(correo);
                        }
                        break;
                    case 4://telefono
                        int tel = SolicitaTelefono();
                        if (tel != 0) {
                            al.setTelefono(tel);
                        }
                        break;
                    default:
                        ERROR();
                }
            }
        } else {
            ERROR();
            return;
        }
        ctrl.actualizaP(al);
    }

    private void AgregarAcceso() {
        int opc =0 ;
       
        while(opc!=2){
            System.out.println("2__agregar accesos");
            System.out.println("1__salir");
                opc = leerI();
            if(opc==1)
                AddAcceso();
            else ERROR();        
        }

    }

    private void AdminAdmin() {
        int opc = 0;
        while (opc != 5) {
            MenuAdmisn();
            switch (opc = leerI()) {
                case 1:
                    crearAdm();
                    break;
                case 2:
                    BorrarAdm();
                    break;
                case 3:
                    MostrarAdm();
                    break;
                case 4:
                    ActualizarAdm();
                    break;
                case 5:
                    break;                    
                default:
                    ERROR();
                    break;
            }
        }
    }
     private void crearAdm() {
        ctrl.agregarAdministrador(SolicitaNombres(), SolicitaCedulas(), SolicitaTelefono(), SolicitaEmail(), solicitaPass());
    }

    private void BorrarAdm() {
        if (ctrl.borrarP(SolicitaCedulas())) {
            SucceDel();
        } else {
            ErrorDel();
        }
    }

    private void MostrarAdm() {
        int p = 0;
        Administrador per = new Administrador();
        while (p != 2) {
            BusqAcc();
            switch (p = leerI()) {
                case 1:
                    ctrl.mostrarPCed(per, SolicitaCedulas());
                    System.out.println(per.toString());
                    break;
                default:
                    ERROR();
            }
        }
    }

    private void ActualizarAdm() {
        Administrador al = new Administrador();
        ctrl.mostrarPCed(al, SolicitaCedulas());
        System.out.println(al.toString());

        if (al.getCedula() != "") {
            int p = 0;
            while (p != 5) {
                p = ModifAlmn();
                switch (p) {
                    case 1://nombre
                        String nom = SolicitaNombres();
                        if (nom != "") {
                            al.setNombre(nom);
                        }
                        break;
                    case 2://pass
                        String pass = solicitaPass();
                        if (pass != "") {
                            al.setClave(pass);
                        }
                        break;
                    case 3://correo
                        String correo = SolicitaEmail();
                        if (correo != "") {
                            al.setEmail(correo);
                        }
                        break;
                    case 4://telefono
                        int tel = SolicitaTelefono();
                        if (tel != 0) {
                            al.setTelefono(tel);
                        }
                        break;
                    default:
                        ERROR();
                }
            }
        } else {
            ERROR();
            return;
        }
        ctrl.actualizaP(al);
    }

    private void AdminMatr() {
        int opc = 0;
        while (opc != 5) {
            MenuMatriculador();
            switch (opc = leerI()) {
                case 1:
                    crearMatr();
                    break;
                case 2:
                    BorrarMatr();
                    break;
                case 3:
                    MostrarMatr();
                    break;
                case 4:
                    ActualizarMatr();
                    break;
                default:
                    ERROR();
                    break;
            }
        }
    }

    private void crearMatr() {
        ctrl.agregarMatriculador(SolicitaTelefono(), SolicitaEmail(), SolicitaNombres(), SolicitaCedulas(), solicitaPass());
    }

    private void BorrarMatr() {
        if (ctrl.borrarP(SolicitaCedulas())) {
            SucceDel();
        } else {
            ErrorDel();
        }
    }

    private void MostrarMatr() {
        int p = 0;
        Matriculador per = new Matriculador();
        while (p != 2) {
            BusqAcc();
            switch (p = leerI()) {
                case 1:
                    ctrl.mostrarPCed(per, SolicitaCedulas());
                    System.out.println(per.toString());
                    break;
                default:
                    ERROR();
            }
        }
    }

    private void ActualizarMatr() {
        Matriculador al = new Matriculador();
        ctrl.mostrarPCed(al, SolicitaCedulas());
        System.out.println(al.toString());

        if (al.getCedula() != "") {
            int p = 0;
            while (p != 5) {
                p = ModifAlmn();
                switch (p) {
                    case 1://nombre
                        String nom = SolicitaNombres();
                        if (nom != "") {
                            al.setNombre(nom);
                        }
                        break;
                    case 2://pass
                        String pass = solicitaPass();
                        if (pass != "") {
                            al.setClave(pass);
                        }
                        break;
                    case 3://correo
                        String correo = SolicitaEmail();
                        if (correo != "") {
                            al.setEmail(correo);
                        }
                        break;
                    case 4://telefono
                        int tel = SolicitaTelefono();
                        if (tel != 0) {
                            al.setTelefono(tel);
                        }
                        break;
                    default:
                        ERROR();
                }
            }
        } else {
            ERROR();
            return;
        }
        ctrl.actualizaP(al);
    }

    public void moferta() {
        System.out.println("1-->Oferta academica");
        System.out.println("2-->salir");
    }

    public int SolicitaNumgrp() {
        System.out.println("digite el numero de grupo");
        return leerI();
    }

    private void AgregarGrupo(String car) {
        ctrl.agregarGrupo(SolicitaNgrupo(), SolicitaHorario(), SolicitaCedulas(), car);
    }

    public void Oferta() {
        int opc = 0;
        while (opc != 2) {
            opc = Oferta2();
            if (opc == 1) {
                AdminOferta();
            }
        }
    }

    public void AdminOferta() {
        String Carrera = SolicitaCodCarrera();
        int ciclo = SolicitaCiclo();
        Lista cursos = new Lista();
        ctrl.ofertaAcd(Carrera, ciclo, cursos);
        System.out.println(cursos.toString());
        
        int opc = sbmoferta();
        if (opc == 1) {
            String curso = SolicitaCodCurso();
            Lista grupos = new Lista();
            ctrl.BuscarGrpCrs(curso, grupos);
            System.out.println(grupos.toString());
                int ccc= sbmgrpsCrs();
            if (ccc == 1) {
                AgregarGrupo(curso);
            }
            if (ccc == 2) {
                Grupo g = new Grupo();
                ctrl.Bcgrupo(curso, SolicitaNgrupo(), g);
                
                if (g.getId() != "") {
                    int p = 0;
                    String nom = SolicitaCedulas();
                    if (nom != "") {
                    g.setProfesor(nom);
                    }
                }else ERROR();
            }
        }
    }

    public int sbmgrpsCrs() {
        System.out.println("1--> agregar grupo ");
        System.out.println("2--> modificar grupo");
        System.out.println("otros salir...");
        return leerI();
    }

    public int sbmoferta() {
        System.out.println("1--> seleccionar un curso");
        System.out.println("2--> atras");
        return leerI();
    }
     private void ConsultaHistorial() {
         Lista l =  new Lista();
         ctrl.ConsultaHistorial(SolicitaCedulas(),l);
         System.out.println(l.toString());    
   
     }

    public void AddAcceso() {
       
        int opc = 0;
        while (opc != 3) {
        System.out.println("1-> Administrador");
        System.out.println("2-> Matriculador");
        System.out.println("3->Salir");
            switch (opc = leerI()) {
                case 1:
                    AdminAdmin();
                    break;
                case 2:
                    AdminMatr();
                    break;
                default:ERROR();
            }
        }
    }

    public void MenuAdministrador() {
        System.out.println("-----Menu Adminstrador-----");
        System.out.println("1--> Admisntrar Carreras");
        System.out.println("2--> Admisntrar cursos");
        System.out.println("3--> Admisntrar profesores");
        System.out.println("4--> Admisntrar Alumnos");
        System.out.println("5--> Admisntrar Ciclo");
        System.out.println("6--> Admisntrar Oferta Academica");
        System.out.println("7--> Admisntrar Matricula");
        System.out.println("8--> Admisntrar Consultar Historial");
        System.out.println("9--> Administrar Acceso de Seguridad");
        System.out.println("");
        System.out.println("10-> SALIR");
    }

    public void ErrorDel() {
        System.out.println("Problemas en la eliminacion");
    }

    public void SucceDel() {
        System.out.println("Eliminacion Correcta");
    }

    public void MenuProfesor() {
        System.out.println("-----Menu Profesor-----");
        System.out.println("1--> agregar Profesor");
        System.out.println("2--> Borrar Profesor");
        System.out.println("3--> mostrar Profesor");
        System.out.println("4--> actualizar Profesor");
        System.out.println("5-->SALIR");
    }

    public void MenuAlumno() {
        System.out.println("-----Menu Alumno-----");
        System.out.println("1--> agregar Alumno");
        System.out.println("2--> Borrar Alumno");
        System.out.println("3--> mostrar Alumno");
        System.out.println("4--> actualizar Alumno");
        System.out.println("5-->SALIR");
    }

    public void MenuMatriculador() {
        System.out.println("-----Menu Matriculador-----");
           System.out.println("1--> agregar Matriculador");
        System.out.println("2--> Borrar Matriculador");
        System.out.println("3--> mostrar Matriculador");
        System.out.println("4--> actualizar Matriculador");
        System.out.println("5-->SALIR");
    }
      public void MenuAdmisn() {
        System.out.println("-----Menu Administrador-----");
           System.out.println("1--> agregar Administrador");
        System.out.println("2--> Borrar Administrador");
        System.out.println("3--> mostrar Administrador");
        System.out.println("4--> actualizar Administrador");
        System.out.println("5-->SALIR");
    }

    public void menuCarr() {
        System.out.println("-----Menu Carrera-----");
        System.out.println("1--> agregar Carreras");
        System.out.println("2--> Borrar Carreras");
        System.out.println("3--> mostrar Carrera");
        System.out.println("4--> mostrar Carreras");
        System.out.println("5--> actualizar Carreras");
        System.out.println("6--> SALIR");

    }

    public void menuCurso() {
        System.out.println("-----Menu Curso-----");
        System.out.println("1--> agregar Curso");
        System.out.println("2--> Borrar Curso");
        System.out.println("3--> mostrar Curso");
        System.out.println("4--> actualizar Curso");
        System.out.println("5--> SALIR");
    }

    public void BusqCurso() {
        System.out.println("1--Nombre");
        System.out.println("2--Codigo");
        System.out.println("3--Carrera");
        System.out.println("4--salir");

    }

    public void BusqAcc() {
        System.out.println("1--Cedula");
        System.out.println("2--salir");
    }

    public void BusqProf() {
        System.out.println("1--Cedula");
        System.out.println("2--Nombre");
        System.out.println("3--salir");
    }

    public void BusqAlmn() {
        System.out.println("1--Cedula");
        System.out.println("2--Nombre");
        System.out.println("3--Carrera");
        System.out.println("4--salir");
    }

    public int ModifProf() {
        System.out.println("1--Nombre");
        System.out.println("2--Contraseña");
        System.out.println("3--correo");
        System.out.println("4--telefono");
        System.out.println("5--salir");
        return leerI();
    }

    public int ModifAlmn() {
        System.out.println("1--Nombre");
        System.out.println("2--Contraseña");
        System.out.println("3--correo");
        System.out.println("4--telefono");
        System.out.println("5--salir");
        return leerI();
    }

    public void BusqCar() {
        System.out.println("1--Codigo");
        System.out.println("2--Nombre");
        System.out.println("3--salir");

    }

    public String SolicitaNombres() {
        System.out.println("digite el nombre de la persona:");
        String nombre = "";
        Scanner entradaEscaner = new Scanner(System.in);
        nombre = entradaEscaner.nextLine(); //Invocamos un método sobre un objeto Scanner
        return nombre;
    }

    public String SolicitaCedulas() {
        System.out.println("digite la cedula de persona:");
        String cedula = "";
        Scanner entradaEscaner = new Scanner(System.in);
        cedula = entradaEscaner.nextLine(); //Invocamos un método sobre un objeto Scanner
        return cedula;
    }

    public String SolicitaEmail() {
        System.out.println("digite el correo correspondiente:");
        String correo = "";
        Scanner entradaEscaner = new Scanner(System.in);
        correo = entradaEscaner.nextLine(); //Invocamos un método sobre un objeto Scanner
        return correo;
    }

    public int SolicitaTelefono() {
        System.out.println("digite el telefono de la persona:");
        int telefono = 0;
        Scanner entradaEscaner = new Scanner(System.in);
        telefono = entradaEscaner.nextInt(); //Invocamos un método sobre un objeto Scanner
        return telefono;
    }

    public String SolicitaFec_Nac() {
        System.out.println("digite la fecha de nacimiento del estudiante:");
        String fecNac = "";
        Scanner entradaEscaner = new Scanner(System.in);
        fecNac = entradaEscaner.nextLine(); //Invocamos un método sobre un objeto Scanner
        return fecNac;
    }

    public String SolicitaCodCarrera() {
        System.out.println("digite el codigo correrspondiente a la carrera:");
        return leerS();
    }

    public String SolicitaNomCarrera() {
        System.out.println("digite el nombre correrspondiente a la carrera:");
        String pass = "";
        Scanner entradaEscaner = new Scanner(System.in);
        pass = entradaEscaner.nextLine(); //Invocamos un método sobre un objeto Scanner
        return pass;
    }

    public int Oferta2() {
        System.out.println("1--> ingrese Codigo para ver grupos");
        System.out.println("2--> salir");
        return leerI();
    }

    public String SolicitaCodCurso() {
        System.out.println("digite el codigo correrspondiente al curso:");
        return leerS();
    }

    public String SolicitaNomCurso() {
        System.out.println("digite el nombre del curso:");
        return leerS();
    }

    public int SolicitaCreditos() {
        System.out.println("digite  el numero de creditos del curso:");
        return leerI();
    }

    public int SolicitaHsemanal() {
        System.out.println("digite  el numero de horas semanales:");
        return leerI();
    }

    public int SolicitaCiclo() {
        System.out.println("digite el numero de ciclo en que impartera el curso:");
        return leerI();
    }

    public void Solicitaidgrupo() {
        System.out.println("digite el id del grupo:");
    }

    public int Solicitaiciclogrupo() {
        System.out.println("digite el ciclo para grupo:");
        int ciclogr = 0;
        Scanner entradaEscaner = new Scanner(System.in);
        ciclogr = entradaEscaner.nextInt(); //Invocamos un método sobre un objeto Scanner
        return ciclogr;
    }

    public int SolicitaNgrupo() {
        System.out.println("digite el numero para grupo:");
        int ngrpo = 0;
        Scanner entradaEscaner = new Scanner(System.in);
        ngrpo = entradaEscaner.nextInt(); //Invocamos un método sobre un objeto Scanner
        return ngrpo;
    }

    public String SolicitaHorario() {
        System.out.println("digite el horario del grupo:");
        String hgrp = "";
        Scanner entradaEscaner = new Scanner(System.in);
        hgrp = entradaEscaner.nextLine(); //Invocamos un método sobre un objeto Scanner
        return hgrp;
    }

    public int leerI() {
        int datoI = 0;
        Scanner entradaEscaner = new Scanner(System.in);
        datoI = entradaEscaner.nextInt();
        return datoI;
    }

    public String leerS() {
        String datoS = "";
        Scanner entradaEscaner = new Scanner(System.in);
        datoS = entradaEscaner.nextLine(); //Invocamos un método sobre un objeto Scanner
        return datoS;
    }

    private void AdminMatricula() {
        Alumno a = new Alumno();
        ctrl.mostrarPCed(a, SolicitaCedulas());
        if(!a.getCedula().isEmpty()){
            Lista l = new Lista();
            ctrl.matriculados(a.getCedula(), l);
            System.out.println(l.toString());
            int op = 0;
            while(op!=3){
            op=opcMA();
            if(op == 1){
                if(ctrl.MAtricula(SolicitaNomCurso(), a))
                    System.out.println("Matriculado");
                else System.out.println("no Matriculado");
           }
            if(op == 2){
                if(ctrl.DesMAtricula(SolicitaNomCurso(), a))
                    System.out.println("DesMatriculado");
                else System.out.println("no puede desmatricular");                
                //dematricula
            }
            }
            
            
        }
    }
    public int nuevamatricula(){
        System.out.println("1--> nueva matricula");
        System.out.println("2--> salir");
        return leerI();
    }
    
public int opcMA(){
    System.out.println("Agregar");
    System.out.println("eliminar");
    return leerI();
}
}