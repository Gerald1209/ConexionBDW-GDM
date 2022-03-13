package ni.edu.uca.ConexionBD.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ni.edu.uca.ConexionBD.models.PeliculaIdioma;

@Repository
public class PeliculaIdiomaDRepository implements PeliculaIdiomaIRepository{
	@Autowired
	JdbcTemplate operacion;

	@Override
	public List<Map<String, Object>> ListarRegistro() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> lista = operacion.queryForList("Select pi.id, p.titulo as 'pelicula', i.nombre as 'idioma', pi.descripcion from PeliculaIdioma pi"
				+ " inner join Pelicula p on  pi.pelicula = p.idPelicula"
				+ " inner join Idioma i on  pi.idioma = i.idIdioma");
		return lista;
	}

	@Override
	public int GuardarRegistro(PeliculaIdioma pi) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Insert into PeliculaIdioma(pelicula, idioma, descripcion) values(?, ?, ?)",
				new Object[] {pi.getPelicula(), pi.getIdioma(), pi.getDescripcion()});
		return b;
	}

	@Override
	public int EditarRegistro(PeliculaIdioma pi) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Update PeliculaIdioma set pelicula = ? , idioma = ? , descripcion = ? where id = ?",
				new Object[] {pi.getPelicula(), pi.getIdioma(), pi.getDescripcion(), pi.getId()});
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		int b = 0;
		b = operacion.update("Delete from PeliculaIdioma where id = ?", id);
		return b;
	}

}
