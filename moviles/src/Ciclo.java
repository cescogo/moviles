public class Ciclo {
    private int anno;
    private char nciclo;
    private String Finicio;
    private String Ffinal;
    

    public Ciclo(int anno, char nciclo, String Finicio, String Ffinal) {
        this.anno = anno;
        this.nciclo = nciclo;
        this.Finicio = Finicio;
        this.Ffinal = Ffinal;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public char getNciclo() {
        return nciclo;
    }

    public void setNciclo(char nciclo) {
        this.nciclo = nciclo;
    }

    public String getFinicio() {
        return Finicio;
    }

    public void setFinicio(String Finicio) {
        this.Finicio = Finicio;
    }

    public String getFfinal() {
        return Ffinal;
    }

    public void setFfinal(String Ffinal) {
        this.Ffinal = Ffinal;
    }
    
}
