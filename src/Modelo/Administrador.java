package Modelo;

public class Administrador extends Persona {

    public Administrador(String nombre, String cedula, int telefono, String email, String clave) {
        super( nombre, cedula, telefono, email, clave, 1);
    }
}
