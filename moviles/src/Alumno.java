public class Alumno extends Persona{
    private String carrera;
    private String Fec_Nac;

    public Alumno(String nombre, String cedula, String Fec_Nac, String telefono, 
          String email,  String carrera, String clave) {
      
        super( nombre, cedula, telefono, email, clave, 4);
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
