package Vista;

import java.util.Scanner;

public class Interfaz {

public String solicitaPass(){
    System.out.println("digite la contraseña:");
    String pass = "";
    Scanner entradaEscaner = new Scanner (System.in); 
    pass = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
    return pass;
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

public String SolicitaCodCarrera(){
    System.out.println("digite el codigo correrspondiente a la carrera:");
    String codcar = "";
    Scanner entradaEscaner = new Scanner (System.in); 
    codcar = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
    return codcar;
}
public String SolicitaNomCarrera(){
    System.out.println("digite el nombre correrspondiente a la carrera:");
    String nomcar = "";
    Scanner entradaEscaner = new Scanner (System.in); 
    nomcar = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
    return nomcar;
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





    
}
