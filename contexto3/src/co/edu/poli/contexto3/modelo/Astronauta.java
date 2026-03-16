package co.edu.poli.contexto3.modelo;

public class Astronauta extends Persona {

    private String fechadenacimiento;

    public Astronauta() {
    }

    public Astronauta(String nombre, String id) {
        super(nombre, id);
    }

    public String getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    @Override
    public String toString() {
        return "Astronauta{" +
                "fechadenacimiento='" + fechadenacimiento + '\'' +
                '}';
    }
}