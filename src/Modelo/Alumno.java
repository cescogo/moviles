package Modelo;

public class Alumno extends Persona{

    public Alumno(int telefono, String email, String nombre, String cedula, String F_nac, String clave) {
        super(telefono, email, nombre, cedula,4,clave);
        this.F_nac=F_nac;
    }

    public Alumno() {
        super(4);
        this.F_nac="";
    }

    public String getF_nac() {
        return F_nac;
    }

    public void setF_nac(String F_nac) {
        this.F_nac = F_nac;
    }
    

    
    private String F_nac;
}
