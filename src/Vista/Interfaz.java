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

public String solicitaUsr(){
    System.out.println("Introdusca Usuario: ");
    String pass = "";
    Scanner entradaEscaner = new Scanner (System.in); 
    pass = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
    return pass;
    
}
public void errorLogin(){
    System.out.println("Error Usuario o Contraseña incorrecta: ");
}
public String solicitaPass(){
    System.out.println("digite la contraseña:");
    String pass = "";
    Scanner entradaEscaner = new Scanner (System.in); 
    pass = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
    return pass;
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
public void ErrorDel(){
    System.out.println("Problemas en la eliminacion");
}
public void SucceDel(){
            System.out.println("Eliminacion Correcta");
}
public void MenuProfesor(){
    System.out.println("-----Menu Profesor-----");
    System.out.println("1--> agregar Profesor");
    System.out.println("2--> Borrar Profesor");
    System.out.println("3--> mostrar Profesor");   
    System.out.println("4--> actualizar Profesor");
    System.out.println("5-->SALIR");
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
public void BusqProf(){
    System.out.println("1--Cedula");
    System.out.println("2--Nombre");
    System.out.println("3--salir");    
}
public void BusqAlmn(){
    System.out.println("1--Cedula");
    System.out.println("2--Nombre");
    System.out.println("3--Carrera");
    System.out.println("4--salir");    
}
public int ModifProf(){
    System.out.println("1--Nombre");
    System.out.println("2--Contraseña");
    System.out.println("3--correo");
    System.out.println("4--telefono");
    System.out.println("5--salir");
return leerI();    
}
public int ModifAlmn(){
    System.out.println("1--Nombre");
    System.out.println("2--Contraseña");
    System.out.println("3--correo");
    System.out.println("4--telefono");
    System.out.println("5--salir");
return leerI();    
}
public void BusqCar(){
    System.out.println("1--Codigo");
    System.out.println("2--Nombre");
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

public void SolicitaCodCurso(){
    System.out.println("digite el codigo correrspondiente al curso:");
}
public void SolicitaNomCurso(){
    System.out.println("digite el nombre del curso:");
}
public void SolicitaCreditos(){
    System.out.println("digite  el numero de creditos del curso:");
}
public void SolicitaHsemanal(){
    System.out.println("digite  el numero de horas semanales:");
}
public void SolicitaCiclo(){
    System.out.println("digite el numero de ciclo en que impartera el curso:");
}
public void Solicitaidgrupo(){
    System.out.println("digite el id del grupo:");
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
