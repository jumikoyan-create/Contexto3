package co.edu.poli.contexto3.modelo;

public class Planeta {

    private String nombre;
    private String id;
    private double tamanio;
    private String material;
    private boolean eshabitable;
    private String fechadescubrimiento;
    private double distanciaalatierra;
    private Suelo suelo;
    private Mision mision;

    public Planeta() {
    }

    public Planeta(String nombre, String id) {
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

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isEshabitable() {
        return eshabitable;
    }

    public void setEshabitable(boolean eshabitable) {
        this.eshabitable = eshabitable;
    }

    public String getFechadescubrimiento() {
        return fechadescubrimiento;
    }

    public void setFechadescubrimiento(String fechadescubrimiento) {
        this.fechadescubrimiento = fechadescubrimiento;
    }

    public double getDistanciaalatierra() {
        return distanciaalatierra;
    }

    public void setDistanciaalatierra(double distanciaalatierra) {
        this.distanciaalatierra = distanciaalatierra;
    }

    public Suelo getSuelo() {
        return suelo;
    }

    public void setSuelo(Suelo suelo) {
        this.suelo = suelo;
    }

    public Mision getMision() {
        return mision;
    }

    public void setMision(Mision mision) {
        this.mision = mision;
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}