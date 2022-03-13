package ni.edu.uca.ConexionBD.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ni.edu.uca.ConexionBD.models.PeliculaGenero;
import ni.edu.uca.ConexionBD.repositories.PeliculaGeneroDRepository;
import ni.edu.uca.ConexionBD.repositories.PeliculaGeneroIRepository;

@Service
public class PeliculaGeneroService implements PeliculaGeneroIRepository{
	
	@Autowired
	PeliculaGeneroDRepository pelgen;

	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		return pelgen.ListarRegistro();
	}

	@Override
	public int GuardarRegistro(PeliculaGenero pg) {
		// TODO Auto-generated method stub
		return pelgen.GuardarRegistro(pg);
	}

	@Override
	public int EditarRegistro(PeliculaGenero pg) {
		// TODO Auto-generated method stub
		return pelgen.EditarRegistro(pg);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return pelgen.EliminarRegistro(id);
	}

}
