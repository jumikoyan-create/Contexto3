package co.edu.poli.contexto3.modelo;

/**
 * Clase que representa un Científico, la cual hereda de la clase Persona.
 */
public class Cientifico extends Persona {

    /**
     * Años o nivel de experiencia del científico.
     */
    private String experiencia;

    /**
     * Sueldo del científico (compartido entre todas las instancias).
     */
    private static double sueldo;

    /**
     * Constructor vacío de la clase Cientifico.
     */
    public Cientifico() {
    }

    /**
     * Constructor con parámetros para inicializar un científico.
     * 
     * @param nombre Nombre del científico
     * @param id Identificación del científico
     * @param sexo Sexo del científico
     */
    public Cientifico(String nombre, String id, String sexo) {
        super(nombre, id);
    }

    /**
     * Obtiene la experiencia del científico.
     * 
     * @return experiencia del científico
     */
    public String getExperiencia() {
        return experiencia;
    }

    /**
     * Establece la experiencia del científico.
     * 
     * @param experiencia experiencia a asignar
     */
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    /**
     * Obtiene el sueldo del científico.
     * 
     * @return sueldo actual
     */
    public static double getSueldo() {
        return sueldo;
    }

    /**
     * Establece el sueldo del científico.
     * 
     * @param sueldo nuevo valor del sueldo
     */
    public static void setSueldo(double sueldo) {
        Cientifico.sueldo = sueldo;
    }

    /**
     * Devuelve una representación en cadena del objeto Cientifico.
     * 
     * @return cadena con la información del científico
     */
    @Override
    public String toString() {
        return "Cientifico{" +
               "nombre='" + getNombre()+ '\'' +
               ", id='" + getId() + '\''+
               "experiencia='" + experiencia + '\'' +
               ", sueldo=" + sueldo +
                '}';
    }

    /**
     * Realiza una operación matemática sobre un entero.
     * 
     * @param i valor de entrada
     * @return resultado de multiplicar el valor por 2
     */
    @Override
    public int operacion(int i) {
        return i * 2;
    }

    /**
     * Calcula el sueldo del científico sin incluir el costo del pasaje.
     * 
     * @return sueldo resultante después de restar el pasaje
     */
    @Override
    public int sueldoSinPasaje() {
        int sueldo = 2000000;
        int pasaje = 180000;
        int resultado = sueldo - pasaje; 
        return resultado;
    }
    
    
}