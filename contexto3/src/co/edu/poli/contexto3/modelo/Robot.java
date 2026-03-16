package co.edu.poli.contexto3.modelo;

public final class Robot {

    private String id;
    private String modelo;
    private String material;
    private double peso;
    private String estado;
    private String fechadecreacion;
    private int capacidadbateria;

    public Robot() {
    }

    public Robot(String id, String modelo) {
        this.id = id;
        this.modelo = modelo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechadecreacion() {
        return fechadecreacion;
    }

    public void setFechadecreacion(String fechadecreacion) {
        this.fechadecreacion = fechadecreacion;
    }

    public int getCapacidadbateria() {
        return capacidadbateria;
    }

    public void setCapacidadbateria(int capacidadbateria) {
        this.capacidadbateria = capacidadbateria;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id='" + id + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}