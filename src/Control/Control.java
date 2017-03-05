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
    
    public boolean verificaUsuario(String usr, String pass){
        accesoD.validaUser(user, usr, pass);
        if(user == null || user.getCedula() == "" )
            return false;
        return true;
    }
    
    public void init(){
        int opc = 0;
        while(opc!= 2){
        inter.menuLogin();
        inter.solicitaUsr();
        String use= String.valueOf(inter.leerI());
        inter.solicitaPass();
        String pas = inter.leerS();
        if( verificaUsuario(use, pas)){
            switch(user.getTipo()){
                case 1: 
                    FuncAdministrativas();
                    break;
                case 2:
                    FuncMatriculador();
                    break;
                case 3 :
                    FuncProfesor();
                    break;
                case 4:
                    FuncAlumno();            
            }        
        }
        if(use.toLowerCase() == "salir")
            opc = 2;
        
        }
        
        
    }
    private Interfaz inter;
    private Persona user;
    private AccesoDB accesoD;

    private void FuncAdministrativas() {
        inter.BienvInter(1);
    }

    private void FuncMatriculador() {
        inter.BienvInter(2);    }

    private void FuncProfesor() {
        inter.BienvInter(3);
    }

    private void FuncAlumno() {
        inter.BienvInter(4);
    }
}
