public class Curso 
{
    private String codigo;
    private String nombre;
    private int creditos;
    private int hsemanales;
    private String carrera;

    public Curso(String codigo, String nombre, int creditos, int hsemanales, String carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.hsemanales = hsemanales;
        this.carrera = carrera;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getHsemanales() {
        return hsemanales;
    }

    public void setHsemanales(int hsemanales) {
        this.hsemanales = hsemanales;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
 

    
}
