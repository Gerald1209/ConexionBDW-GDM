package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import ni.edu.uca.ConexionBD.models.Pelicula;

public interface PeliculaIRepository {
public List<Map<String, Object>> ListarRegistro();
	
	public int GuardarRegistro(Pelicula p);
	
	public int EditarRegistro(Pelicula p);
	
	public int EliminarRegistro(int id);
}
