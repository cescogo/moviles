package Modelo;

public class Persona{
    
    private int telefono;
    private String email;
    private String nombre;
    private String cedula;
    private int tipo;
    private String F_nac;
    private String clave;

    public Persona(int telefono, String email, String nombre, String cedula, int tipo, String F_nac, String clave) {
        this.telefono = telefono;
        this.email = email;
        this.nombre = nombre;
        this.cedula = cedula;
        this.tipo = tipo;
        this.F_nac = F_nac;
        this.clave = clave;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getF_nac() {
        return F_nac;
    }

    public void setF_nac(String F_nac) {
        this.F_nac = F_nac;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

   
  
    
}
