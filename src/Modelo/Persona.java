package Modelo;

public class Persona{
    
    private int telefono;
    private String email;
    private String nombre;
    private String cedula;
    private Usuario usuario;

    public Persona( String nombre, String cedula, int telefono, String email,
            String clave, int permiso) {
        this.telefono = telefono;
        this.email = email;
        this.nombre = nombre;
        usuario= new Usuario(cedula, clave, permiso);
        this.cedula=cedula;
    }

    public String getCedula() {
        return cedula;
    }
    
   
    public String getPass(){
        return usuario.getClave();
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

   
   
   
    
    
    
 
    
}
