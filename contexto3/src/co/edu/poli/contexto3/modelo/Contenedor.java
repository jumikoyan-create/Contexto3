package co.edu.poli.contexto3.modelo;

public class Contenedor {

    private String nombre;
    private String id;
    private double tamanio;
    private String tipo;
    private String marca;
    private boolean esterilizable;
    private boolean esdelicado;
    private Muestra muestra;

    public Contenedor() {
    }

    public Contenedor(String nombre, String id) {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEsterilizable() {
        return esterilizable;
    }

    public void setEsterilizable(boolean esterilizable) {
        this.esterilizable = esterilizable;
    }

    public boolean isEsdelicado() {
        return esdelicado;
    }

    public void setEsdelicado(boolean esdelicado) {
        this.esdelicado = esdelicado;
    }

    public Muestra getMuestra() {
        return muestra;
    }

    public void setMuestra(Muestra muestra) {
        this.muestra = muestra;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}