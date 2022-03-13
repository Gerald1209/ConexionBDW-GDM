package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ni.edu.uca.ConexionBD.models.PeliculaGenero;

@Repository
public class PeliculaGeneroDRepository implements PeliculaGeneroIRepository {
	@Autowired
	JdbcTemplate operacion;

	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> lista = operacion.queryForList("Select pg.id, p.titulo as 'pelicula', g.nombre as 'genero' from PeliculaGenero pg"
				+ " inner join Pelicula p on  pg.pelicula = p.idPelicula"
				+ " inner join Genero g on  pg.genero = g.idGenero");
		return lista;
	}

	@Override
	public int GuardarRegistro(PeliculaGenero pg) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Insert into PeliculaGenero(pelicula, genero) values(?, ?)",
				new Object[] {pg.getPelicula(), pg.getGenero()});
		return b;
	}

	@Override
	public int EditarRegistro(PeliculaGenero pg) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Update PeliculaGenero set pelicula = ? , genero = ? where id = ?",
				new Object[] {pg.getPelicula(), pg.getGenero(), pg.getId()});
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Delete from PeliculaGenero where id = ?", id);
		return b;
	}

}
