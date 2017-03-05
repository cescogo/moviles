package Vista;

import java.util.Scanner;

public class Interfaz {

public void BienvInter(int t){
switch(t){
    case 1:System.out.println("Area de adinistrador");
    break;
    case 2: System.out.println("Area de Matriculador");
    break;
    case 3: System.out.println("Area de Profesor");
    break;
    case 4: System.out.println("Area de Alumno");
    break;
}
}
    
public void init(){
    int opc = 0;
    while(opc !=2 ){
        System.out.println("1--> ENTRAR");
        System.out.println("2--> SALIR");
        if(opc == 1){
        menuLogin();
        } 
    }
}
    
public void menuLogin(){
    System.out.println("Bienvenido al programa de gestion academica");
    System.out.println("---------LOGIN---------");
    System.out.println("->salir escriba salir");
}

public void solicitaUsr(){
    System.out.println("Introdusca Usuario: ");
}
public void errorLogin(){
    System.out.println("Error Usuario o Contraseña incorrecta: ");
}
public void solicitaPass(){
    System.out.println("digite la contraseña:");
}

public void ERROR(){
    System.out.println("ERROR....");
}
public void MenuAdministrador(){
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

public void MenuProfesor(){
    System.out.println("-----Menu Profesor-----");
}

public void MenuAlumno(){
    System.out.println("-----Menu Alumno-----");
}

public void MenuMatriculador(){
    System.out.println("-----Menu Matriculador-----");
}
public void menuCarr(){
    System.out.println("-----Menu Carrera-----");
    System.out.println("1--> agregar Carreras");
    System.out.println("2--> Borrar Carreras");
    System.out.println("3--> mostrar Carrera");    
    System.out.println("4--> mostrar Carreras");   
    System.out.println("5--> actualizar Carreras");
    System.out.println("6--> SALIR");    

}
public void menuCurso(){
    System.out.println("-----Menu Curso-----");
    System.out.println("1--> agregar Curso");
    System.out.println("2--> Borrar Curso");
    System.out.println("3--> mostrar Curso");    
    System.out.println("4--> mostrar Curso");   
    System.out.println("5--> actualizar Curso");
    System.out.println("6--> SALIR");    
}
public void BusqCurso(){
    System.out.println("1--Nombre");
    System.out.println("2--Codigo");
    System.out.println("3--Carrera");
    System.out.println("4--salir");
    
}
public void BusqCar(){
    System.out.println("1--Nombre");
    System.out.println("2--Codigo");
    System.out.println("3--salir");
    
}
public String SolicitaNombres(){
    System.out.println("digite el nombre de la persona:");
    String nombre = "";
    Scanner entradaEscaner = new Scanner (System.in); 
    nombre = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
    return nombre;
}
public String SolicitaCedulas(){
    System.out.println("digite la cedula de persona:");
    String cedula = "";
    Scanner entradaEscaner = new Scanner (System.in); 
    cedula = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
    return cedula;
}
public String SolicitaEmail(){
    System.out.println("digite el correo correspondiente:");
    String correo = "";
    Scanner entradaEscaner = new Scanner (System.in); 
    correo = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
    return correo;
}
public int SolicitaTelefono(){
    System.out.println("digite el telefono de la persona:");
    int telefono = 0;
    Scanner entradaEscaner = new Scanner (System.in); 
    telefono = entradaEscaner.nextInt(); //Invocamos un método sobre un objeto Scanner
    return telefono;
}
public String SolicitaFec_Nac(){
    System.out.println("digite la fecha de nacimiento del estudiante:");
    String fecNac = "";
    Scanner entradaEscaner = new Scanner (System.in); 
    fecNac = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
    return fecNac;
}
public void SolicitaCodCarrera(){
    System.out.println("digite el codigo correrspondiente a la carrera:");
}
public void SolicitaNomCarrera(){
    System.out.println("digite el nombre correrspondiente a la carrera:");
}

public String SolicitaCodCurso(){
    System.out.println("digite el codigo correrspondiente a la carrera:");
    String codcur = "";
    Scanner entradaEscaner = new Scanner (System.in); 
    codcur = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
    return codcur;
}
public String SolicitaNomCurso(){
    System.out.println("digite el nombre de la carrera:");
    String nomcur = "";
    Scanner entradaEscaner = new Scanner (System.in); 
    nomcur = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
    return nomcur;
}
public int SolicitaCreditos(){
    System.out.println("digite  el numero de creditos del curso:");
    int crecur =0;
    Scanner entradaEscaner = new Scanner (System.in); 
    crecur = entradaEscaner.nextInt(); //Invocamos un método sobre un objeto Scanner
    return crecur;
}
public int SolicitaHsemanal(){
    System.out.println("digite  el numero de horas semanales:");
    int Hcur =0;
    Scanner entradaEscaner = new Scanner (System.in); 
    Hcur = entradaEscaner.nextInt(); //Invocamos un método sobre un objeto Scanner
    return Hcur;
}
public int SolicitaCiclo(){
    System.out.println("digite el numero de ciclo en que impartera el curso:");
    int niclo =0;
    Scanner entradaEscaner = new Scanner (System.in); 
    niclo = entradaEscaner.nextInt(); //Invocamos un método sobre un objeto Scanner
    return niclo;
}
public String Solicitaidgrupo(){
    System.out.println("digite el id del grupo:");
    String idgr ="";
    Scanner entradaEscaner = new Scanner (System.in); 
    idgr = entradaEscaner.nextLine(); //Invocamos un método sobre un objeto Scanner
    return idgr;
}
public int Solicitaiciclogrupo(){
    System.out.println("digite el ciclo para grupo:");
    int ciclogr =0;
    Scanner entradaEscaner = new Scanner (System.in); 
    ciclogr = entradaEscaner.nextInt(); //Invocamos un método sobre un objeto Scanner
    return ciclogr;
}
public int SolicitaNgrupo(){
    System.out.println("digite el numero para grupo:");
    int ngrpo =0;
    Scanner entradaEscaner = new Scanner (System.in); 
    ngrpo = entradaEscaner.nextInt(); //Invocamos un método sobre un objeto Scanner
    return ngrpo;
}
public String SolicitaHorario(){
    System.out.println("digite el horario del grupo:");
    String hgrp ="";
    Scanner entradaEscaner = new Scanner (System.in); 
    hgrp = entradaEscaner.nextLine(); //Invocamos un método sobre un objeto Scanner
    return hgrp;
}
public int leerI() {
    int datoI = 0;
    Scanner entradaEscaner = new Scanner (System.in); 
    datoI = entradaEscaner.nextInt(); 
    return datoI;
    }
public String leerS(){
    String datoS = "";
    Scanner entradaEscaner = new Scanner (System.in); 
    datoS = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
    return datoS;
}
}
