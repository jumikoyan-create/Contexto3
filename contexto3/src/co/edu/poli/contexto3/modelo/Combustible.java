package co.edu.poli.contexto3.modelo;

public class Combustible {

    private String id;
    private String nombre;
    private boolean esinflamable;
    private String marca;
    private boolean escontaminante;

    public Combustible() {
    }

    public Combustible(String id, String nombre) {
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

    public boolean isEsinflamable() {
        return esinflamable;
    }

    public void setEsinflamable(boolean esinflamable) {
        this.esinflamable = esinflamable;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEscontaminante() {
        return escontaminante;
    }

    public void setEscontaminante(boolean escontaminante) {
        this.escontaminante = escontaminante;
    }

    @Override
    public String toString() {
        return "Combustible{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}