package ni.edu.uca.ConexionBD.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ni.edu.uca.ConexionBD.models.Idioma;
import ni.edu.uca.ConexionBD.repositories.IdiomaDRepository;
import ni.edu.uca.ConexionBD.repositories.IdiomaIRepository;

@Service
public class IdiomaService implements IdiomaIRepository {

	@Autowired
	IdiomaDRepository idio;
	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		return idio.ListarRegistro();
	}

	@Override
	public int GuardarRegistro(Idioma i) {
		// TODO Auto-generated method stub
		return idio.GuardarRegistro(i);
	}

	@Override
	public int EditarRegistro(Idioma i) {
		// TODO Auto-generated method stub
		return idio.EditarRegistro(i);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return idio.EliminarRegistro(id);
	}

}
