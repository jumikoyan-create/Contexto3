package co.edu.poli.contexto3.modelo;

public class Suelo {

    private String nombre;
    private String id;
    private String material;
    private String estado;
    private double tamanio;
    private boolean estable;

    public Suelo() {
    }

    public Suelo(String nombre, String id) {
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

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isEstable() {
        return estable;
    }

    public void setEstable(boolean estable) {
        this.estable = estable;
    }

    @Override
    public String toString() {
        return "Suelo{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}