package Conexion;
import Modelo.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {
    public ConexionBD conectar() {
		ConexionBD con = null;
		
		String password = "root";
		String usuario = "root";
		String url = "jdbc:mysql://localhost:3306/ventas?user=" + usuario
				+ "&password=" + password;
		try {
			con = (ConexionBD) DriverManager.getConnection(url);
			if (con != null) {
				System.out.println("Conectado");
			}
		} catch (SQLException e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.printStackTrace();
		}
		return con;
	}
    public void mostrarUsuarios() {
        try {
            // Se crea la instancia del driver de la base de datos.
            Class.forName(MANEJADOR_DB).newInstance();

            // Se establece una conexión con la base de datos..
            String URL_servidor = SERVIDOR_POR_DEFECTO;
            String baseDatos = "matricula";
            String URL_conexion
                    = String.format("%s//%s/%s",
                            PROTOCOLO, URL_servidor, baseDatos);
            
            System.out.println(String.format(
                    "Hilera de conexión: %s", URL_conexion));

            String usuario = "root";
            String claveAcceso = "";
            Connection cnx
                    = DriverManager.getConnection(
                            URL_conexion, usuario, claveAcceso);

            // Obtiene los datos de la base..
            Statement stm = cnx.createStatement();
          String comandoListar
                    = "SELECT * FROM usuario";
            ResultSet rs = stm.executeQuery(comandoListar);

            while (rs.next()) {
                String id = rs.getString("user");
                String nombre = rs.getString("password");
              
                System.out.println(String.format(
                        "t%2s\t%2s",
                        id, nombre));
            }

            rs.close();
            stm.close();
            cnx.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
   
    
    public void agregaPersona(Persona a) 
    {
          try {
           //agregar usuario
           
           // Se crea la instancia del driver de la base de datos.
//            Class.forName(MANEJADOR_DB).newInstance();

            // Se establece una conexión con la base de datos..
            String URL_servidor = SERVIDOR_POR_DEFECTO;
            String baseDatos = "matricula";
            String URL_conexion
                    = String.format("%s//%s/%s",
                            PROTOCOLO, URL_servidor, baseDatos);
            System.out.println(String.format(
                    "Hilera de conexión: %s", URL_conexion));
            
            String usuario = "root";
            String claveAcceso = "";
            Connection cnx
                    = DriverManager.getConnection(
                            URL_conexion, usuario, claveAcceso);

            // Agrega un registro a la tabla en la base de datos
            // ANTES de recuperar los datos para mostrarlos
            // en la consola.
           
// modificar la insercion a datos
            String COMANDO_AGREGAR
                    = "INSERT INTO PERSONA "
                    + "(CEDULA, NOMBRE,F_NACIMIENTO,CORREO,TELEFONO,COD_CARRERA) "
                    + "VALUES (?, ?, ?,?,?,?) ";
            PreparedStatement pstm
                    = cnx.prepareStatement(COMANDO_AGREGAR);

            pstm.clearParameters();
            pstm.setString(1,a.getCedula());
            pstm.setString(2, a.getNombre());
            pstm.setString(3, a.getFec_Nac());
            pstm.setString(4,a.getEmail());
            pstm.setInt(5,a.getTelefono());
            pstm.setString(7,a.getCarrera());
            
            

            if (pstm.executeUpdate() == 1) {
                System.out.println("Se insertaron los datos correctamente.");
            } else {
                System.out.println("Ocurrió un error al agregar el registro.");
            }
            System.out.println();
            pstm.close();
            cnx.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void agregaProfesor(Profesor a) 
    {
          try {
           //agregar usuario
           agregaUsuario(a.getCedula(),a.getPass(),3);
           // Se crea la instancia del driver de la base de datos.
//            Class.forName(MANEJADOR_DB).newInstance();

            // Se establece una conexión con la base de datos..
            String URL_servidor = SERVIDOR_POR_DEFECTO;
            String baseDatos = "matricula";
            String URL_conexion
                    = String.format("%s//%s/%s",
                            PROTOCOLO, URL_servidor, baseDatos);
            System.out.println(String.format(
                    "Hilera de conexión: %s", URL_conexion));
            
            String usuario = "root";
            String claveAcceso = "";
            Connection cnx
                    = DriverManager.getConnection(
                            URL_conexion, usuario, claveAcceso);

            // Agrega un registro a la tabla en la base de datos
            // ANTES de recuperar los datos para mostrarlos
            // en la consola.
           

            String COMANDO_AGREGAR
                    = "INSERT INTO PROFESOR "
                    + "(CEDULA, NOMBRE,CORREO,TELEFONO) "
                    + "VALUES (?, ?, ?,?) ";
            PreparedStatement pstm
                    = cnx.prepareStatement(COMANDO_AGREGAR);

            pstm.clearParameters();
            pstm.setString(1,a.getCedula());
            pstm.setString(2, a.getNombre());
            pstm.setString(3, a.getEmail());
            pstm.setInt(4,a.getTelefono());
           
            
            

            if (pstm.executeUpdate() == 1) {
                System.out.println("Se insertaron los datos correctamente.");
            } else {
                System.out.println("Ocurrió un error al agregar el registro.");
            }
            System.out.println();
            pstm.close();
            cnx.close();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    private static final String MANEJADOR_DB = "com.mysql.jdbc.Driver";
    private static final String PROTOCOLO = "jdbc:mysql:";
    private static final String SERVIDOR_POR_DEFECTO = "localhost";
    
}
