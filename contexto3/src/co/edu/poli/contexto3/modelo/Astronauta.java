package co.edu.poli.contexto3.modelo;

/**
 * Clase que representa un Astronauta, la cual hereda de la clase Persona.
 */
public class Astronauta extends Persona {

    /**
     * Fecha de nacimiento del astronauta.
     */
    private String fechadenacimiento;

    /**
     * Constructor vacío de la clase Astronauta.
     */
    public Astronauta() {
    }

    /**
     * Constructor con parámetros para inicializar un astronauta.
     * 
     * @param nombre Nombre del astronauta
     * @param id Identificación del astronauta
     * @param sexo Sexo del astronauta
     */
    public Astronauta(String nombre, String id, String sexo) {
        super(nombre, id);
    }

    /**
     * Obtiene la fecha de nacimiento del astronauta.
     * 
     * @return fecha de nacimiento
     */
    public String getFechadenacimiento() {
        return fechadenacimiento;
    }

    /**
     * Establece la fecha de nacimiento del astronauta.
     * 
     * @param fechadenacimiento fecha de nacimiento a asignar
     */
    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    /**
     * Devuelve una representación en cadena del objeto Astronauta.
     * 
     * @return cadena con la información del astronauta
     */
    @Override
    public String toString() {
        return "Astronauta{" +
    
                "fechadenacimiento='" + fechadenacimiento + '\'' +
                '}';
    }

    /**
     * Calcula el sueldo del astronauta sin incluir el costo del pasaje.
     * 
     * @return sueldo resultante después de restar el pasaje
     */
    @Override
    public int sueldoSinPasaje() {
        int sueldo = 5000000;
        int pasaje = 180000;
        int resultado = sueldo - pasaje; 
        return resultado;
    }

    
}