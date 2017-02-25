public class Persona extends Usuario{
    
    private String telefono;
    private String email;
    private String nombre;

    public Persona(String telefono, String email, String nombre, String cedula, String clave) {
        super(cedula, clave);
        this.telefono = telefono;
        this.email = email;
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
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

   
   
   
    
    
    
 
    
}
