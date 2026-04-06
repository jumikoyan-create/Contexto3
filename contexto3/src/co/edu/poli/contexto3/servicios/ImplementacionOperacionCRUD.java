package co.edu.poli.contexto3.servicios;

import co.edu.poli.contexto3.modelo.Persona;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.*;

/**
 * Clase que implementa operaciones CRUD y manejo de archivos
 * para objetos de tipo Persona.
 */
public class ImplementacionOperacionCRUD implements OperacionCRUD, OperacionArchivo {

    /**
     * Arreglo de personas almacenadas en memoria.
     */
    private Persona[] personaa = new Persona[2];
/**
 * Obtiene el arreglo de personas almacenadas en el sistema.
 *
 * @return un arreglo de objetos Persona con los datos actuales
 */
    public Persona[] getPersonas() {
    return this.personaa;
}

    /**
     * Crea una nueva persona en el arreglo.
     * 
     * @param p objeto Persona a agregar
     */
    @Override
    public void crear(Persona p) {

        if (p == null) {
            System.out.println("No se puede agregar un objeto null");
            return;
        }
        if (leer(p.getId()) != null) {
            System.out.println("Ya existe una persona con ese ID");
            return;
        }

        for (int i = 0; i < personaa.length; i++) {
            if (personaa[i] == null) {
                personaa[i] = p;
                System.out.println("Persona agregada en posición " + i);
                return;
            }
        }

        Persona[] nuevo = new Persona[personaa.length + 1];

        for (int i = 0; i < personaa.length; i++) {
            nuevo[i] = personaa[i];
        }

        nuevo[personaa.length] = p;
        personaa = nuevo;

        System.out.println("Arreglo expandido. Persona agregada en posición " + (personaa.length - 1));
    }

    /**
     * Busca una persona por su ID.
     * 
     * @param id identificador de la persona
     * @return objeto Persona encontrado o null si no existe
     */
    @Override
    public Persona leer(String id) {

        if (id == null) return null;

        for (Persona p : personaa) {
            if (p != null && p.getId().equals(id)) {
                return p;
            }
        }

        return null;
    }

    /**
     * Actualiza una persona existente.
     * 
     * @param id identificador de la persona a actualizar
     * @param nueva nueva información de la persona
     */
    @Override
    public void actualizar(String id, Persona nueva) {

        for (int i = 0; i < personaa.length; i++) {
            if (personaa[i] != null && personaa[i].getId().equals(id)) {
                personaa[i] = nueva;
                System.out.println("Persona actualizada con ID: " + id);
                return;
            }
        }

        System.out.println("No se encontró persona con ID: " + id);
    }

    /**
     * Elimina una persona por su ID.
     * 
     * @param id identificador de la persona a eliminar
     */
    @Override
    public void eliminar(String id) {

        for (int i = 0; i < personaa.length; i++) {
            if (personaa[i] != null && personaa[i].getId().equals(id)) {
                personaa[i] = null;
                System.out.println("Persona eliminada con ID: " + id);
                return;
            }
        }

        System.out.println("No se encontró persona con ID: " + id);
    }

    /**
     * Lista todas las personas almacenadas en el arreglo.
     */
    public void listar() {
        System.out.println("\n--- LISTADO DE PERSONAS ---");

        for (int i = 0; i < personaa.length; i++) {
            if (personaa[i] != null) {
                System.out.println("Posición " + i + ": " + personaa[i]);
            } else {
                System.out.println("Posición " + i + ": vacío");
            }
        }
    }

    /**
     * Serializa un arreglo de personas y lo guarda en un archivo.
     * 
     * @param personas arreglo de personas a guardar
     * @param path ruta donde se guardará el archivo
     * @param name nombre del archivo
     * @return mensaje indicando el resultado de la operación
     */
    @Override
    public String serializar(Persona[] personas, String path, String name) {
        try (java.io.FileOutputStream fos = new java.io.FileOutputStream(path + name);
             java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos)) { 
            oos.writeObject(personas);
            return "Archivo creado correctamente";
        } catch (java.io.IOException e) {
            return "error al guardar: " + e.getMessage();
        }
    }

    /**
     * Deserializa un archivo y recupera un arreglo de personas.
     * 
     * @param path ruta del archivo
     * @param name nombre del archivo
     * @return arreglo de personas recuperado o null en caso de error
     */
    @Override
    public Persona[] deserializar(String path, String name) {
        Persona[] personas = null;
        try (java.io.FileInputStream fis = new java.io.FileInputStream(path + name);
             java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis)) {
            personas = (Persona[]) ois.readObject();
        } catch (java.io.IOException e) {
            System.out.println("Error IO: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("clase no encontrada : " + e.getMessage());
        }
        return personas;
    }

    /**
     * Establece el arreglo de personas.
     * 
     * @param personas nuevo arreglo de personas
     */
    public void setPersonas(Persona[] personas) {
        this.personaa = personas;
    }
}