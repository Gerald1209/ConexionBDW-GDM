package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import ni.edu.uca.ConexionBD.models.PeliculaIdioma;

public interface PeliculaIdiomaIRepository {
public List<Map<String, Object>> ListarRegistro();
	
	public int GuardarRegistro(PeliculaIdioma pi);
	
	public int EditarRegistro(PeliculaIdioma pi);
	
	public int EliminarRegistro(int id);
}
