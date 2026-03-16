package co.edu.poli.contexto3.modelo;

public class Cientifico extends Persona {

    private String experiencia;
    private static double sueldo;

    public Cientifico() {
    }

    public Cientifico(String nombre, String id) {
        super(nombre, id);
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public static double getSueldo() {
        return sueldo;
    }

    public static void setSueldo(double sueldo) {
        Cientifico.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Cientifico{" +
                "experiencia='" + experiencia + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}