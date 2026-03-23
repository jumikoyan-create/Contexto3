package co.edu.poli.contexto3.servicios;
import co.edu.poli.contexto3.modelo.Persona;

public interface OperacionCRUD {

    void crear(Persona p);

    Persona leer(String id);

    void actualizar(String id, Persona p);

    void eliminar(String id);

}


