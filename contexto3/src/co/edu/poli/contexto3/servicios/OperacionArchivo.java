package co.edu.poli.contexto3.servicios;
import co.edu.poli.contexto3.modelo.Persona;

public interface OperacionArchivo {
	public String serializar(Persona[] personas, String path, String name);
	public Persona[] deserializar(String path, String name);
}
