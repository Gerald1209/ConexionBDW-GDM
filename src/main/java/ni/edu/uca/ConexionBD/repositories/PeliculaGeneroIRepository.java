package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import ni.edu.uca.ConexionBD.models.PeliculaGenero;

public interface PeliculaGeneroIRepository {
public List<Map<String, Object>> ListarRegistro();
	
	public int GuardarRegistro(PeliculaGenero pg);
	
	public int EditarRegistro(PeliculaGenero pg);
	
	public int EliminarRegistro(int id);
}


