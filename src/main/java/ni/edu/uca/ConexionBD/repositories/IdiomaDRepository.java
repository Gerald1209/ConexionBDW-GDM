package ni.edu.uca.ConexionBD.repositories;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ni.edu.uca.ConexionBD.models.Idioma;

@Repository
public class IdiomaDRepository implements IdiomaIRepository{
	
	@Autowired
	JdbcTemplate operacion;

	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> lista = operacion.queryForList("Select * from Idioma");
		return lista;
	}

	@Override
	public int GuardarRegistro(Idioma i) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Insert into Idioma(nombre, activo) values(?, ?)",
				new Object[] {i.getNombre(), i.isActivo()});
		return b;
	}

	@Override
	public int EditarRegistro(Idioma i) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Update Idioma set nombre = ?, activo = ? where idIdioma = ?",
				new Object[] {i.getNombre(), i.isActivo(), i.getIdIdioma()});
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Delete from Idioma where idIdioma = ?", id);
		return b;
	}

}
