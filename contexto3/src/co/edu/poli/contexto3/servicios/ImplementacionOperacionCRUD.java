package co.edu.poli.contexto3.servicios;
import co.edu.poli.contexto3.modelo.Persona;
public class ImplementacionOperacionCRUD implements OperacionCRUD {

    private Persona[] personas = new Persona[2];

    // CREAR (inserta en primer null, si no hay espacio CRECE el arreglo)
    @Override
    public void crear(Persona p) {

        if (p == null) {
            System.out.println("No se puede agregar un objeto null");
            return;
        }

        // evitar duplicados por ID
        if (leer(p.getId()) != null) {
            System.out.println("Ya existe una persona con ese ID");
            return;
        }

        for (int i = 0; i < personas.length; i++) {
            if (personas[i] == null) {
                personas[i] = p;
                System.out.println("Persona agregada en posición " + i);
                return;
            }
        }

        // Si no hay espacio → crecer arreglo (agregación infinita)
        Persona[] nuevo = new Persona[personas.length + 1];

        for (int i = 0; i < personas.length; i++) {
            nuevo[i] = personas[i];
        }

        nuevo[personas.length] = p;
        personas = nuevo;

        System.out.println("Arreglo expandido. Persona agregada en posición " + (personas.length - 1));
    }

    // LEER por ID
    @Override
    public Persona leer(String id) {

        if (id == null) return null;

        for (Persona p : personas) {
            if (p != null && p.getId().equals(id)) {
                return p;
            }
        }

        return null;
    }

    // ACTUALIZAR por ID
    @Override
    public void actualizar(String id, Persona nueva) {

        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null && personas[i].getId().equals(id)) {
                personas[i] = nueva;
                System.out.println("Persona actualizada con ID: " + id);
                return;
            }
        }

        System.out.println("No se encontró persona con ID: " + id);
    }

    // ELIMINAR por ID
    @Override
    public void eliminar(String id) {

        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null && personas[i].getId().equals(id)) {
                personas[i] = null;
                System.out.println("Persona eliminada con ID: " + id);
                return;
            }
        }

        System.out.println("No se encontró persona con ID: " + id);
    }

    public void listar() {
    System.out.println("\n--- LISTADO DE PERSONAS ---");

    for (int i = 0; i < personas.length; i++) {
        if (personas[i] != null) {
            System.out.println("Posición " + i + ": " + personas[i]);
        } else {
            System.out.println("Posición " + i + ": vacío");
        }
    }
}
}


