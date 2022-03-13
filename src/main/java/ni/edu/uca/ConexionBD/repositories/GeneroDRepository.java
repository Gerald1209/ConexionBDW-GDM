package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ni.edu.uca.ConexionBD.models.Genero;

@Repository
public class GeneroDRepository implements GeneroIRepository{
	@Autowired
	JdbcTemplate operacion;
	
	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> lista = operacion.queryForList("Select * from Genero");
		return lista;
	}

	@Override
	public int GuardarRegistro(Genero g) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Insert into Genero(nombre, activo) values(?, ?)",
				new Object[] {g.getNombre(), g.isActivo()});
		return b;
	}

	@Override
	public int EditarRegistro(Genero g) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Update Genero set nombre = ?, activo = ? where idGenero = ?",
				new Object[] {g.getNombre(), g.isActivo(), g.getIdGenero()});
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Delete from Genero where idGenero = ?", id);
		return b;
	}	
}
