/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ccg
 */
public class Usuario {
    private String usuario;
    private String clave;
    private int permiso;

    public Usuario(String cedula, String clave, int permiso) {
        this.usuario = cedula;
        this.clave = clave;
        this.permiso = permiso;
    }

    public int getPermiso() {
        return permiso;
    }

    public void setPermiso(int permiso) {
        this.permiso = permiso;
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    

   
    
}
