package co.edu.poli.contexto3.modelo;

public class Laboratorio {

    private String nombre;
    private String id;
    private String direccion;
    private double tamanio;
    private boolean esmoderno;
    private int numeroempleados;
    private String horario;
    private Contenedor[] contenedor;
    private Cientifico[] cientifico;

    public Laboratorio() {
    }

    public Laboratorio(String nombre, String id) {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isEsmoderno() {
        return esmoderno;
    }

    public void setEsmoderno(boolean esmoderno) {
        this.esmoderno = esmoderno;
    }

    public int getNumeroempleados() {
        return numeroempleados;
    }

    public void setNumeroempleados(int numeroempleados) {
        this.numeroempleados = numeroempleados;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Contenedor[] getContenedor() {
        return contenedor;
    }

    public void setContenedor(Contenedor[] contenedor) {
        this.contenedor = contenedor;
    }

    public Cientifico[] getCientifico() {
        return cientifico;
    }

    public void setCientifico(Cientifico[] cientifico) {
        this.cientifico = cientifico;
    }

    @Override
    public String toString() {
        return "Laboratorio{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}