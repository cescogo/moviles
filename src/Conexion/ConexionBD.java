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
    
    public void mostrar(Persona a, Lista l) {
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
                    = "SELECT * FROM persona";
            ResultSet rs = stm.executeQuery(comandoListar);

            while (rs.next()) {
                
                a.setCedula(rs.getString("cedula"));
                a.setClave(rs.getString("pass"));
                a.setEmail(rs.getString("correo"));
                a.setNombre(rs.getString("nombre"));
                a.setTelefono(rs.getInt("telefono"));
                a.setTipo(rs.getInt("tipo"));
                l.agregar(a);
              
                
            }

            rs.close();
            stm.close();
            cnx.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
   public void mostrar(Carrera a, Lista l) {
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
                    = "SELECT * FROM curso";
            ResultSet rs = stm.executeQuery(comandoListar);

            while (rs.next()) {
                
                a.setCodigo(rs.getString("codigo"));
                a.setNombre(rs.getString("nombre"));
               
                l.agregar(a);
              
                
            }

            rs.close();
            stm.close();
            cnx.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
   public void mostrar(Ciclo a, Lista l) {
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
                    = "SELECT * FROM ciclo";
            ResultSet rs = stm.executeQuery(comandoListar);

            while (rs.next()) {
                
                a.setAnno(rs.getInt("anno"));
                a.setFfinal(rs.getString("fecha_final"));
                a.setFinicio(rs.getString("fecha_inicio"));
                a.setId(rs.getString("id"));
                a.setNciclo(rs.getInt("num_ciclo"));
                l.agregar(a);
              
                
            }

            rs.close();
            stm.close();
            cnx.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
   
   public void mostrar(Curso a, Lista l) {
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
                    = "SELECT * FROM curso";
            ResultSet rs = stm.executeQuery(comandoListar);

            while (rs.next()) {
                
                a.setCodigo(rs.getString("codigo"));
                a.setNombre(rs.getString("nombre"));
                a.setCreditos(rs.getInt("creditos"));
                a.setHsemanales(rs.getInt("h_semanales"));
                a.setCarrera(rs.getString("cod_caarrera"));
                a.setNum_ciclo(rs.getInt("num_ciclo"));
                l.agregar(a);
              
                
            }

            rs.close();
            stm.close();
            cnx.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
   
   public void mostrar(Grupo a, Lista l) {
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
                    = "SELECT * FROM grupo";
            ResultSet rs = stm.executeQuery(comandoListar);

            while (rs.next()) {
                
                a.setId(rs.getString("id_grupo"));
                a.setNumero(rs.getInt("numero"));
                a.setProfesor(rs.getString("id_prof"));
                a.setCurso(rs.getString("cod_curso"));
                
                l.agregar(a);
              
                
            }

            rs.close();
            stm.close();
            cnx.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
   

   
    public void agrega(Persona a) 
    {
          try {
          
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
                    + "(CEDULA,pass,tipo, NOMBRE,F_NACIMIENTO,CORREO,TELEFONO) "
                    + "VALUES (?, ?, ?,?,?,?,?) ";
            PreparedStatement pstm
                    = cnx.prepareStatement(COMANDO_AGREGAR);

            pstm.clearParameters();
            pstm.setString(1,a.getCedula());
            pstm.setString(2,a.getClave());
            pstm.setInt(3, a.getTipo());
            pstm.setString(4, a.getNombre());            
            pstm.setString(6,a.getEmail());
            pstm.setInt(7,a.getTelefono());
         
            Alumno alu=null;

            if(a instanceof Alumno)
            {
              alu=(Alumno) a;
                pstm.setString(5, alu.getF_nac());  
            }
            else
            {
                pstm.setString(5,null);
            }
            
            

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

    public void agrega(Carrera a) 
    {
          try {
          
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
                    = "INSERT INTO carrera "
                    + "(CODIGO, NOMBRE) "
                    + "VALUES (?, ?) ";
            PreparedStatement pstm
                    = cnx.prepareStatement(COMANDO_AGREGAR);

            pstm.clearParameters();
            pstm.setString(1,a.getCodigo());
            pstm.setString(2,a.getNombre());
       
            

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
    
     public void agrega(Curso a) 
    {
          try {
          
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
                    = "INSERT INTO CURSO "
                    + "(CODIGO,NOMBRE,CREDITOS,H_SEMANALES,COD_CARRERA,NUM_CICLO) "
                    + "VALUES (?, ?, ?,?,?,?) ";
            PreparedStatement pstm
                    = cnx.prepareStatement(COMANDO_AGREGAR);

            pstm.clearParameters();
            pstm.setString(1,a.getCodigo());
            pstm.setString(2,a.getNombre());
            pstm.setInt(3, a.getCreditos());
            pstm.setInt(4, a.getHsemanales());            
            pstm.setString(5,a.getCarrera());
            pstm.setInt(6,a.getNum_ciclo());
            
            

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
     
      public void agrega(Grupo a) 
    {
          try {
          
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
                    = "INSERT INTO GRUPO"
                    + "(ID_GRUPO,NUMERO,ID_PROF,COD_CURSO) "
                    + "VALUES (?, ?, ?,?) ";
            PreparedStatement pstm
                    = cnx.prepareStatement(COMANDO_AGREGAR);

            pstm.clearParameters();
            pstm.setString(1, a.getId());
            pstm.setInt(2,a.getNumero());
            pstm.setString(3,a.getProfesor());
            pstm.setString(4, a.getCurso());            
                  

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
      
      public void agrega(Ciclo a) 
    {
          try {
          
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
                    = "INSERT INTO CICLO "
                    + "(ID,ANNO,NUM_CICLO,FECHA_INICIO,FECHA_FINAL) "
                    + "VALUES (?, ?, ?,?,?) ";
            PreparedStatement pstm
                    = cnx.prepareStatement(COMANDO_AGREGAR);
            
            pstm.clearParameters();
            pstm.setString(1,a.getId());
            pstm.setInt(2,a.getAnno());
            pstm.setInt(3,a.getNciclo());
            pstm.setString(4, a.getFinicio());            
            pstm.setString(5,a.getFfinal());
           
            
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
