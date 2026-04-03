package co.edu.poli.contexto3.modelo;

public class Cientifico extends Persona {

    private String experiencia;
    private static double sueldo;

    public Cientifico() {
    }

    public Cientifico(String nombre, String id, String sexo) {
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
               "nombre='" + getNombre()+ '\'' +
               ", id='" + getId() + '\''+
               "experiencia='" + experiencia + '\'' +
               ", sueldo=" + sueldo +
                '}';
    }

    @Override
    public int operacion(int i) {
        return i * 2;
    }

    @Override
    public int sueldoSinPasaje() {
        int sueldo = 2000000;
        int pasaje = 180000;
        int resultado = sueldo - pasaje; 
        return resultado;
    }
    
    
}