package Modelo;

public class Grupo {
    private String id;
    
    private int numero;
    private String horario;
    private String  profesor;
    private String curso;

    public Grupo(String id, int numero, String horario, String profesor, String curso) {
        this.id = id;
        this.numero = numero;
        this.horario = horario;
        this.profesor = profesor;
        this.curso = curso;
    }

    public Grupo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

  
    
  
    
}
 
