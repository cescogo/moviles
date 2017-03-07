package AccesoDatos;
import Modelo.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import Modelo.*;

public class AccesoDB {
    
   public void validaUser(Persona a, String us, String pass){
       try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM persona "
                    + "WHERE CEDULA ="+us
                    +" And PASS = "+pass;
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {                
                a.setCedula(bd.registro.getString("cedula"));
                a.setClave(bd.registro.getString("pass"));
                a.setEmail(bd.registro.getString("correo"));
                a.setNombre(bd.registro.getString("nombre"));
                a.setTelefono(bd.registro.getInt("telefono"));
                a.setTipo(bd.registro.getInt("tipo"));
                if(a instanceof Alumno)
                    ((Alumno) a).setF_nac("F_NACIMIENTO");
            }
            
            bd.closeCon();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
   } 
     
   //<editor-fold desc="Metodos de Busqueda">
    
   public void BuscarCursoCod(Curso a, String cod) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM curso WHERE codigo='"+ cod+"'"; 
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {                
                 a.setCodigo(bd.registro.getString("codigo"));
                 a.setNombre(bd.registro.getString("nombre"));  
                 a.setCreditos(bd.registro.getInt("creditos"));
                 a.setHsemanales(bd.registro.getInt("H_SEMANALES"));
                 a.setCarrera(bd.registro.getString("COD_CARRERA"));
                 a.setNum_ciclo(bd.registro.getInt("NUM_CICLO"));  
            }
            bd.closeCon();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
   
   public void BuscarCursoNom(Curso a, String nom) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM curso WHERE nombre ='"+ nom+"'";
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {                
                 a.setCodigo(bd.registro.getString("codigo"));
                 a.setNombre(bd.registro.getString("nombre"));  
                 a.setCreditos(bd.registro.getInt("creditos"));
                 a.setHsemanales(bd.registro.getInt("H_SEMANALES"));
                 a.setCarrera(bd.registro.getString("COD_CARRERA"));
                 a.setNum_ciclo(bd.registro.getInt("NUM_CICLO"));
            }
            bd.closeCon();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
      
   public void BuscarCursoCar(Lista l, String carr) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM curso WHERE COD_CARRERA ='"+ carr+"'";
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {  
                 Curso a = new Curso();
                 a.setCodigo(bd.registro.getString("codigo"));
                 a.setNombre(bd.registro.getString("nombre"));  
                 a.setCreditos(bd.registro.getInt("creditos"));
                 a.setHsemanales(bd.registro.getInt("H_SEMANALES"));
                 a.setCarrera(bd.registro.getString("COD_CARRERA"));
                 a.setNum_ciclo(bd.registro.getInt("NUM_CICLO"));
                 l.agregar(a);
            }
            bd.closeCon();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
         
   public void BuscarCursosCar(Curso a, String carrera, Lista l) {
        try {
             ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM curso WHERE COD_CARRERA ='"+ carrera+"'";
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {                
                a.setNum_ciclo(bd.registro.getInt("Num_ciclo"));
                a.setNombre(bd.registro.getString("nombre"));                               
                a.setCreditos(bd.registro.getInt("creditos"));
                a.setHsemanales(bd.registro.getInt("H_SEMANALES"));
                a.setCodigo(bd.registro.getString("codigo"));
                a.setNum_ciclo(bd.registro.getInt("NUM_CICLO"));
                l.agregar(a);
            }
            bd.closeCon();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
 
   public void BuscarCarreraCod(Carrera a, String cod) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM carrera WHERE codigo ='"+ cod+"'";      
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {                
                 a.setCodigo(bd.registro.getString("codigo"));
                 a.setNombre(bd.registro.getString("nombre"));    
            }
            bd.closeCon();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

   public void BuscarCarreraNom(Carrera a, String nom) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM carrera WHERE nombre ='"+ nom+"'";         
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {                
                 a.setCodigo(bd.registro.getString("codigo"));
                 a.setNombre(bd.registro.getString("nombre"));    
            }
            bd.closeCon();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

   public void BuscarEStId(Persona a, String id) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM persona WHERE CEDULA='"+ id+"'";
            bd.registro = bd.comando.executeQuery(comandoListar);
            
            while (bd.registro.next()) {                
                a.setCedula(bd.registro.getString("cedula"));
                a.setClave(bd.registro.getString("pass"));
                a.setEmail(bd.registro.getString("correo"));
                a.setNombre(bd.registro.getString("nombre"));
                a.setTelefono(bd.registro.getInt("telefono"));
                a.setTipo(bd.registro.getInt("tipo"));
                if(a instanceof Alumno)
                    ((Alumno) a).setF_nac("F_NACIMIENTO");
            }
            bd.closeCon();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

   public void BuscarEstNom(Persona a, String nom) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM persona WHERE nombre='"+ nom+"'";
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {                
                a.setCedula(bd.registro.getString("cedula"));
                a.setClave(bd.registro.getString("pass"));
                a.setEmail(bd.registro.getString("correo"));
                a.setNombre(bd.registro.getString("nombre"));
                a.setTelefono(bd.registro.getInt("telefono"));
                a.setTipo(bd.registro.getInt("tipo"));
                if(a instanceof Alumno)
                    ((Alumno) a).setF_nac("F_NACIMIENTO");
            }
            bd.closeCon();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

   public void BuscarEstCarr(Persona a, String carr) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM persona WHERE carrera='"+ carr+"'";
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {                
                a.setCedula(bd.registro.getString("cedula"));
                a.setClave(bd.registro.getString("pass"));
                a.setEmail(bd.registro.getString("correo"));
                a.setNombre(bd.registro.getString("nombre"));
                a.setTelefono(bd.registro.getInt("telefono"));
                a.setTipo(bd.registro.getInt("tipo"));
                if(a instanceof Alumno)
                    ((Alumno) a).setF_nac("F_NACIMIENTO");
            }
            bd.closeCon();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

   public void BuscarPrfId(Persona a, String id) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM persona WHERE CEDULA='"+ id+"'";
            bd.registro = bd.comando.executeQuery(comandoListar);
            
            while (bd.registro.next()) {                
                a.setCedula(bd.registro.getString("cedula"));
                a.setClave(bd.registro.getString("pass"));
                a.setEmail(bd.registro.getString("correo"));
                a.setNombre(bd.registro.getString("nombre"));
                a.setTelefono(bd.registro.getInt("telefono"));
                a.setTipo(bd.registro.getInt("tipo"));
                if(a instanceof Alumno)
                    ((Alumno) a).setF_nac("F_NACIMIENTO");
            }
            bd.closeCon();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

   public void BuscarPrfNombre(String nom, Lista l) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM persona WHERE nombre='"+ nom+"'";
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {  
                Profesor a = new Profesor();
                a.setCedula(bd.registro.getString("cedula"));
                a.setClave(bd.registro.getString("pass"));
                a.setEmail(bd.registro.getString("correo"));
                a.setNombre(bd.registro.getString("nombre"));
                a.setTelefono(bd.registro.getInt("telefono"));
                a.setTipo(bd.registro.getInt("tipo"));
                l.agregar(a);
            }
            bd.closeCon();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
   
   public void mostrar(Persona a, Lista l) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM persona";
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {                
                a.setCedula(bd.registro.getString("cedula"));
                a.setClave(bd.registro.getString("pass"));
                a.setEmail(bd.registro.getString("correo"));
                a.setNombre(bd.registro.getString("nombre"));
                a.setTelefono(bd.registro.getInt("telefono"));
                a.setTipo(bd.registro.getInt("tipo"));
                l.agregar(a);                
            }
            bd.closeCon();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
   public void mostrarCAs(Lista l) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM carrera";
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) { 
                Carrera a = new Carrera();
                a.setCodigo(bd.registro.getString("CODIGO"));
                a.setNombre(bd.registro.getString("NOMBRE"));
                l.agregar(a);                
            }
            bd.closeCon();
       } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
   public void mostrar(Ciclo a, Lista l) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM ciclo";
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {                
                a.setAnno(bd.registro.getInt("anno"));
                a.setFfinal(bd.registro.getString("fecha_final"));
                a.setFinicio(bd.registro.getString("fecha_inicio"));
                a.setId(bd.registro.getString("id"));
                a.setNciclo(bd.registro.getInt("num_ciclo"));
                l.agregar(a);                
            }
            bd.closeCon();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
   
   public void mostrarCUs(Lista l, String cod) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM curso";
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {   
                Curso a  = new Curso();
               a.setCodigo( bd.registro.getString("codigo"));
                a.setNombre( bd.registro.getString("nombre"));
                a.setCreditos( bd.registro.getInt("creditos"));
                a.setHsemanales( bd.registro.getInt("h_semanales"));
                a.setCarrera( bd.registro.getString("COD_CARRERA"));
                a.setNum_ciclo( bd.registro.getInt("num_ciclo"));
                l.agregar(a);              
            }
            bd.closeCon();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
 
   public void mostrar(Grupo a, Lista l) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM grupo";
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {                
                a.setId(bd.registro.getString("id_grupo"));
                a.setNumero(bd.registro.getInt("numero"));
                a.setProfesor(bd.registro.getString("id_prof"));
                a.setCurso(bd.registro.getString("cod_curso"));
                l.agregar(a);           
            }
            bd.closeCon();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
   
   public void Buscar(Persona a, String id) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM carrera WHERE CEDULA:"+id;
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {                
                a.setCedula(bd.registro.getString("cedula"));
                a.setClave(bd.registro.getString("pass"));
                a.setEmail(bd.registro.getString("correo"));
                a.setNombre(bd.registro.getString("nombre"));
                a.setTelefono(bd.registro.getInt("telefono"));
                a.setTipo(bd.registro.getInt("tipo"));
                if(a instanceof Alumno)
                    ((Alumno) a).setF_nac("F_NACIMIENTO");
            }
            bd.closeCon();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

   public void Buscar(Carrera a, String cod) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM carrera WHERE codigo ="+cod;
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {                
                 a.setCodigo(bd.registro.getString("codigo"));
                 a.setNombre(bd.registro.getString("nombre"));    
            }
            bd.closeCon();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
   
   public void Buscar(Grupo a, String cod, String num) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM grupo WHERE ID_GRUPO ="+cod
                        +" && From grupo where NUMERO="+num;
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {                
                a.setId(bd.registro.getString("ID_GRUPO"));
                a.setNumero(bd.registro.getInt("NUMERO"));
                a.setProfesor(bd.registro.getString("ID_PROF"));
                a.setCurso(bd.registro.getString("COD_CURSO"));     
            }
            bd.closeCon();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
   
   public void BuscarGrpCrs(String curso, Lista l) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM grupo WHERE COD_CURSO ='"+ curso+"'";
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) { 
                Grupo a = new Grupo();
                a.setId(bd.registro.getString("ID_GRUPO"));
                a.setNumero(bd.registro.getInt("NUMERO"));
                a.setProfesor(bd.registro.getString("ID_PROF"));
                a.setCurso(bd.registro.getString("COD_CURSO"));  
                l.agregar(a);    
            }
            bd.closeCon();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
   
   public void BuscarGrpPrf(Grupo a, String profe, Lista l) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT * FROM grupo WHERE ID_PROF ='"+ profe+"'";
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {                
                a.setId(bd.registro.getString("ID_GRUPO"));
                a.setNumero(bd.registro.getInt("NUMERO"));
                a.setProfesor(bd.registro.getString("ID_PROF"));
                a.setCurso(bd.registro.getString("COD_CURSO"));  
                l.agregar(a);
            }
            bd.closeCon();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
   
   public void Historial(String a,Lista l) {
        try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT Curso FROM NOTA WHERE NOTA != 0 AND ESTUDIANTE="+a;
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {   
                 String aux = bd.registro.getString("Curso");
                 l.agregar(aux);              
            }
            bd.closeCon();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
 
   
 //</editor-fold>
   
  //<editor-fold desc="Metodos de Insercion">
    
   public void agrega(Persona a){
          try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            String fec ="";
            if(a instanceof Alumno){
              Alumno alu=(Alumno) a;
                fec = alu.getF_nac(); 
            }
            Statement s = bd.conexion.createStatement();
            s.executeUpdate("INSERT INTO Persona  VALUES('" + a.getCedula() + "','"+ a.getClave() +"','"+ a.getTipo() +"','"+ a.getNombre() +"','"+ fec +"','"+ a.getEmail() +"','"+ a.getTelefono() +"')");
            bd.closeCon();
                  
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

   public void agrega(Carrera a){
          try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            String fec ="";
            Statement s = bd.conexion.createStatement();
            s.executeUpdate("INSERT INTO carrera  VALUES('" + a.getCodigo() + "','"+ a.getNombre()+"')");
            bd.closeCon();                     
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
   public void agrega(Curso a){
          try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            String fec ="";
            Statement s = bd.conexion.createStatement();
            s.executeUpdate("INSERT INTO CURSO VALUES('" + a.getCodigo() + "','" + a.getNombre()+ "','"
                                                         + a.getCreditos()+ "','"+ a.getHsemanales()+ "','"
                                                         + a.getCarrera()+ "','" + a.getNum_ciclo()+ "')");
            bd.closeCon();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
     
   public void agrega(Grupo a){
          try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            String fec ="";
            Statement s = bd.conexion.createStatement();
            s.executeUpdate("INSERT INTO CURSO VALUES('" + a.getId() + "','" + a.getNumero()+ "','"
                                                         + a.getProfesor()+ "','" + a.getCurso()+ "')");
            bd.closeCon();
            }
          catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
      
   public void agrega(Ciclo a){
          try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            String fec ="";
            Statement s = bd.conexion.createStatement();
            s.executeUpdate("INSERT INTO CURSO VALUES('" + a.getId() + "','" + a.getAnno()+ "','"
                                                         + a.getNciclo()+ "','" + a.getFinicio() +"','"
                                                         + a.getFfinal()+ "')");
            bd.closeCon();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
 //</editor-fold>
   
   //<editor-fold desc="Metodos de Actualizar">
    
   public void Actualiza(Persona a){
          try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            Statement s = bd.conexion.createStatement();
          //  s.execute("SET SQL_SAFE_UPDATES = 0");
            String sql = 
"update persona set PASS = '"+a.getClave()+"', NOMBRE = '"+a.getNombre()+"', CORREO = '"+a.getEmail()+"',TELEFONO ="+ a.getTelefono()
                    +" WHERE CEDULA = '"+  a.getCedula()        +"'";
            
            s.executeUpdate(sql);
            bd.closeCon();
            
       
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

   public void Actualiza(Carrera a){
          try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            String sql = "update Carrera set NOMBRE = '%s' where Codigo = '%s'";
            sql=String.format(sql, a.getNombre(),a.getCodigo());
            Statement s = bd.conexion.createStatement();
            s.executeUpdate(sql);
            bd.closeCon();                     
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
   public void Actualiza(Curso a){
          try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            String sql = "update curso set NOMBRE = '%s' ,CREDITOS = '%i' ,NUM_CICLO = '%i',"
                    + " where Codigo = '%S'";
            sql=String.format(sql, a.getNombre(), a.getCreditos(),a.getNum_ciclo(),a.getCodigo());
            Statement s = bd.conexion.createStatement();
            s.executeUpdate(sql);
            bd.closeCon();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
     
   public void Actualiza(Grupo a){
          try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
             String sql = "update grupo set ID_PROF = '%s', NUMERO = '%i',  where ID_GRUPO = '%S'";
            sql=String.format(sql,a.getProfesor(), a.getNumero(),a.getId());
            Statement s = bd.conexion.createStatement();
            s.executeUpdate(sql);
            bd.closeCon();
            }
          catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    //</editor-fold>  
   
   public boolean eliminar(String id){
         try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            Statement s = bd.conexion.createStatement();
            String sql = "delete from persona WHERE CEDULA='"+ id+"'";            
            s.executeUpdate(sql);
            bd.closeCon();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
           
        }
        return false;
      
   }

   public boolean eliminarCurso(String id){
         try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            Statement s = bd.conexion.createStatement();
            String sql = "delete from curso WHERE CODIGO='"+ id+"'";            
            s.executeUpdate(sql);
            bd.closeCon();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
           
        }
        return false;
      
   }
    public void ofertaAcd(String Carrera, int ciclo, Lista l) {
      try {
            ConexionBD bd = new ConexionBD();
            bd.Connect();
            bd.comando = bd.conexion.createStatement();
            String comandoListar = "SELECT CODIGO FROM CURSO WHERE COD_CARRERA ="+Carrera+""
                    + "AND NUM_CICLO="+ciclo;
            bd.registro = bd.comando.executeQuery(comandoListar);
            while (bd.registro.next()) {
                Curso a = new Curso();
                a.setNum_ciclo(bd.registro.getInt("Num_ciclo"));
                a.setNombre(bd.registro.getString("nombre"));                               
                a.setCreditos(bd.registro.getInt("creditos"));
                a.setHsemanales(bd.registro.getInt("H_SEMANALES"));
                a.setCodigo(bd.registro.getString("codigo"));
                a.setNum_ciclo(bd.registro.getInt("NUM_CICLO"));
                l.agregar(a);         
            }
            bd.closeCon();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
