package Modelo;

public class Grupo {
    private char ciclo;
    private int numero;
    private String horario;
    private String  profesor;
    private String curso;

    public Grupo(char ciclo, int numero, String horario, String profesor, String curso) {
        this.ciclo = ciclo;
        this.numero = numero;
        this.horario = horario;
        this.profesor = profesor;
        this.curso = curso;
    }

    public char getCiclo() {
        return ciclo;
    }

    public void setCiclo(char ciclo) {
        this.ciclo = ciclo;
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
 