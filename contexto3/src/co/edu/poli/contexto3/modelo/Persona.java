package co.edu.poli.contexto3.modelo;

public class Persona {

    private String nombre;
    private final String id;
    private double peso;
    private String especialidad;
    private String empresa;
    private String experiencia;
    private String fechainiciotrabajo;
    private String fechanacimiento;

    public Persona() {
        this.id = "";
    }

    public Persona(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public final void mostrarTipo() {
        System.out.println("Soy una persona del sistema");
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getFechainiciotrabajo() {
        return fechainiciotrabajo;
    }

    public void setFechainiciotrabajo(String fechainiciotrabajo) {
        this.fechainiciotrabajo = fechainiciotrabajo;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public int operacion(int i) {
        return i;
    }
}