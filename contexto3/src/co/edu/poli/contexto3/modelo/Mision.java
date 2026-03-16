package co.edu.poli.contexto3.modelo;

public class Mision {

    private String nombre;
    private String id;
    private String lugar;
    private int fechadeinicio;
    private int fechafinalizacion;
    private String objetivo;
    private String encargado;
    private String beneficio;
    private Planeta planeta;

    public Mision() {
    }

    public Mision(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getFechadeinicio() {
        return fechadeinicio;
    }

    public void setFechadeinicio(int fechadeinicio) {
        this.fechadeinicio = fechadeinicio;
    }

    public int getFechafinalizacion() {
        return fechafinalizacion;
    }

    public void setFechafinalizacion(int fechafinalizacion) {
        this.fechafinalizacion = fechafinalizacion;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return "Mision{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}