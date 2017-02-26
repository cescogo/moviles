
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ccg
 */
public class Alumno extends Persona{
    private String carrera;
    private String Fec_Nac;

    public Alumno(String carrera, String Fec_Nac, String telefono, String email, String nombre, String cedula, String clave) {
        super(telefono, email, nombre, cedula, clave);
        this.carrera = carrera;
        this.Fec_Nac = Fec_Nac;
    }

    

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFec_Nac() {
        return Fec_Nac;
    }

    public void setFec_Nac(String Fec_Nac) {
        this.Fec_Nac = Fec_Nac;
    }
    
    
}
