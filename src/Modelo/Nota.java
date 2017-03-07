
package Modelo;

public class Nota {
private double NOTA;
private String CURSO;
private String ESTUDIANTE;

    public Nota(double NOTA, String CURSO, String ESTUDIANTE) {
        this.NOTA = NOTA;
        this.CURSO = CURSO;
        this.ESTUDIANTE = ESTUDIANTE;
    }
    public Nota(){
        this.NOTA = 0;
        this.CURSO = "";
        this.ESTUDIANTE = "";    
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
    
}
