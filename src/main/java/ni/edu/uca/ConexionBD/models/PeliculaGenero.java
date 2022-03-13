package ni.edu.uca.ConexionBD.models;

public class PeliculaGenero {
	private int id;
	private int pelicula;
	private int genero;

	
	public PeliculaGenero(int id, int pelicula, int genero) {
		super();
		this.id = id;
		this.pelicula = pelicula;
		this.genero = genero;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPelicula() {
		return pelicula;
	}


	public void setPelicula(int pelicula) {
		this.pelicula = pelicula;
	}


	public int getGenero() {
		return genero;
	}


	public void setGenero(int genero) {
		this.genero = genero;
	}


	@Override
	public String toString() {
		return "PeliculaGenero [id=" + id + ", pelicula=" + pelicula + ", genero=" + genero + "]";
	}
	
	
}
