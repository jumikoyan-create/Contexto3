package co.edu.poli.contexto3.modelo;

public class Muestra {

    private String id;
    private String nombre;
    private String tipomuestra;
    private int cantidad;
    private String material;
    private String estado;
    private String dedondeviene;
    private boolean esradioactiva;
    private String fecharecoleccion;
    private Suelo suelo;

    public Muestra() {
    }

    public Muestra(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipomuestra() {
        return tipomuestra;
    }

    public void setTipomuestra(String tipomuestra) {
        this.tipomuestra = tipomuestra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDedondeviene() {
        return dedondeviene;
    }

    public void setDedondeviene(String dedondeviene) {
        this.dedondeviene = dedondeviene;
    }

    public boolean isEsradioactiva() {
        return esradioactiva;
    }

    public void setEsradioactiva(boolean esradioactiva) {
        this.esradioactiva = esradioactiva;
    }

    public String getFecharecoleccion() {
        return fecharecoleccion;
    }

    public void setFecharecoleccion(String fecharecoleccion) {
        this.fecharecoleccion = fecharecoleccion;
    }

    public Suelo getSuelo() {
        return suelo;
    }

    public void setSuelo(Suelo suelo) {
        this.suelo = suelo;
    }

    @Override
    public String toString() {
        return "Muestra{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}