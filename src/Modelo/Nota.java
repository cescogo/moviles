
package Modelo;

public class Nota {
private double NOTA;
private String CURSO;
private String ESTUDIANTE;
private String grupo;
private String condision;

    public Nota(double NOTA, String CURSO, String ESTUDIANTE, String grupo, String condision) {
        this.NOTA = NOTA;
        this.CURSO = CURSO;
        this.ESTUDIANTE = ESTUDIANTE;
        this.grupo = grupo;
        this.condision = condision;
    }

    public double getNOTA() {
        return NOTA;
    }

    public void setNOTA(double NOTA) {
        this.NOTA = NOTA;
    }

    public String getCURSO() {
        return CURSO;
    }

    public void setCURSO(String CURSO) {
        this.CURSO = CURSO;
    }

    public String getESTUDIANTE() {
        return ESTUDIANTE;
    }

    public void setESTUDIANTE(String ESTUDIANTE) {
        this.ESTUDIANTE = ESTUDIANTE;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCondision() {
        return condision;
    }

    public void setCondision(String condision) {
        this.condision = condision;
    }

   
}
