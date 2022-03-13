package ni.edu.uca.ConexionBD.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ni.edu.uca.ConexionBD.models.Genero;
import ni.edu.uca.ConexionBD.repositories.GeneroDRepository;
import ni.edu.uca.ConexionBD.repositories.GeneroIRepository;

@Service
public class GeneroService implements GeneroIRepository{

	@Autowired
	GeneroDRepository gen;
	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		return gen.ListarRegistro();
	}

	@Override
	public int GuardarRegistro(Genero g) {
		// TODO Auto-generated method stub
		return gen.GuardarRegistro(g);
	}

	@Override
	public int EditarRegistro(Genero g) {
		// TODO Auto-generated method stub
		return gen.EditarRegistro(g);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return gen.EliminarRegistro(id);
	}
	
}
