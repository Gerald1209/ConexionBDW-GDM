package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ni.edu.uca.ConexionBD.models.Nacionalidad;

@Repository
public class NacionalidadDRepository implements NacionalidadIRepository{
	@Autowired
	JdbcTemplate operacion;

	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> lista = operacion.queryForList("Select * from Nacionalidad");
		return lista;
	}

	@Override
	public int GuardarRegistro(Nacionalidad n) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Insert into Nacionalidad(nombre, activo) values(?, ?)",
				new Object[] {n.getNombre(), n.isActivo()});
		return b;
	}

	@Override
	public int EditarRegistro(Nacionalidad n) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Update Nacionalidad set nombre = ?, activo = ? where idNacionalidad = ?",
				new Object[] {n.getNombre(), n.isActivo(), n.getIdNacionalidad()});
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Delete from Nacionalidad where idNacionalidad = ?", id);
		return b;
	}
	

}
