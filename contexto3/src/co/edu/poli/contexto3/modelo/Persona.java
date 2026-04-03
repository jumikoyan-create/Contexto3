package co.edu.poli.contexto3.modelo;
import java.io.Serializable;
/**
 * Clase abstracta que representa una persona dentro del sistema.
 * 
 * Contiene información general como nombre, identificación,
 * experiencia, empresa y fechas importantes.
 * 
 * Implementa Serializable para permitir guardar y recuperar
 * objetos desde archivos.
 * 
 * @author Saray
 */

public abstract class Persona implements Serializable {
	  /**
     * Identificador de versión para la serialización
     */
	private static final long serialVersionUID =1L;

    private String nombre;
    private final String id;
    private double peso;
    private String especialidad;
    private String empresa;
    private String experiencia;
    private String fechainiciotrabajo;
    private String fechanacimiento;
    
    /**
     * Constructor por defecto
     */
    public Persona() {
        this.id = "";
    }
    /**
     * Constructor con parámetros
     * 
     * @param nombre nombre de la persona
     * @param id identificador único
     */
    public Persona(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    /**
     * Muestra el tipo de persona en el sistema
     */
    public final void mostrarTipo() {
        System.out.println("Soy una persona del sistema");
    }
    /**
     * Obtiene el nombre
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Asigna el nombre
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene el ID
     * @return identificador
     */
    public String getId() {
        return id;
    }
    
    /**
     * Obtiene el peso
     * @return peso de la persona
     */
    public double getPeso() {
        return peso;
    }
    
    /**
     * Asigna el peso
     * @param peso nuevo peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Obtiene la especialidad
     * @return especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Asigna la especialidad
     * @param especialidad nueva especialidad
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    /**
     * Obtiene la empresa
     * @return empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Asigna la empresa
     * @param empresa nueva empresa
     */

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * Obtiene la experiencia
     * @return experiencia laboral
     */
    public String getExperiencia() {
        return experiencia;
    }

    /**
     * Asigna la experiencia
     * @param experiencia nueva experiencia
     */
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    /**
     * Obtiene la fecha de inicio de trabajo
     * @return fecha de inicio
     */
    public String getFechainiciotrabajo() {
        return fechainiciotrabajo;
    }

    /**
     * Asigna la fecha de inicio de trabajo
     * @param fechainiciotrabajo nueva fecha
     */
    public void setFechainiciotrabajo(String fechainiciotrabajo) {
        this.fechainiciotrabajo = fechainiciotrabajo;
    }

    /**
     * Obtiene la fecha de nacimiento
     * @return fecha de nacimiento
     */
    public String getFechanacimiento() {
        return fechanacimiento;
    }

    /**
     * Asigna la fecha de nacimiento
     * @param fechanacimiento nueva fecha
     */
    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    /**
     * Representación en texto de la persona
     * @return información básica de la persona
     */
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
    

    /**
     * Realiza una operación básica
     * @param i valor de entrada
     * @return resultado de la operación
     */
    public int operacion(int i) {
        return i;
    }

    /**
     * Método abstracto que calcula el sueldo sin pasaje
     * @return sueldo calculado
     */
    public abstract int sueldoSinPasaje();
}