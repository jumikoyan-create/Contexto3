package co.edu.poli.contexto3.servicios;
import co.edu.poli.contexto3.modelo.Persona;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.*;
public class ImplementacionOperacionCRUD implements OperacionCRUD, OperacionArchivo {

    private Persona[] personaa = new Persona[2];

    
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
    @Override
    public String serializar(Persona [] personas, String path, String name) {
    	try (java.io.FileOutputStream fos = new java.io.FileOutputStream(path + name);
    			java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos)) { 
    		oos.writeObject(personas);
    		return "Archivo creado correctamente";
    	}catch(java.io.IOException e) {
    		return "error al guardar: " + e.getMessage();
    	}
    }
    
    @Override
    public Persona[] deserializar(String path, String name) {
    	Persona [] personas = null;
    	try(java.io.FileInputStream fis = new java.io.FileInputStream(path + name);
    			java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis)) {
    		personas = (Persona[]) ois.readObject();
    	} catch (java.io.IOException e) {
    		System.out.println("Error IO: " + e.getMessage());
    	}catch (ClassNotFoundException e) {
    		System.out.println("clase no encontrada : " + e.getMessage());
    	}
    	return personas;
    	}
    
    public void setPersonas(Persona[]personas) {
    	this.personaa = personas;
    }
    }
    
    		
    		



