package ni.edu.uca.ConexionBD.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ni.edu.uca.ConexionBD.models.PeliculaIdioma;
import ni.edu.uca.ConexionBD.repositories.PeliculaIdiomaDRepository;
import ni.edu.uca.ConexionBD.repositories.PeliculaIdiomaIRepository;

@Service
public class PeliculaIdiomaService implements PeliculaIdiomaIRepository{
	
	@Autowired
	PeliculaIdiomaDRepository pelidio;

	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		return pelidio.ListarRegistro();
	}

	@Override
	public int GuardarRegistro(PeliculaIdioma pi) {
		// TODO Auto-generated method stub
		return pelidio.GuardarRegistro(pi);
	}

	@Override
	public int EditarRegistro(PeliculaIdioma pi) {
		// TODO Auto-generated method stub
		return pelidio.EditarRegistro(pi);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return pelidio.EliminarRegistro(id);
	}

}
