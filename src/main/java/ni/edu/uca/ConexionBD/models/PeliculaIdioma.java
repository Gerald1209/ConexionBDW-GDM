package ni.edu.uca.ConexionBD.models;

public class PeliculaIdioma {
	private int id;
	private int pelicula;
	private int idioma;
	private String descripcion;
	
	
	public PeliculaIdioma(int id, int pelicula, int idioma, String descripcion) {
		super();
		this.id = id;
		this.pelicula = pelicula;
		this.idioma = idioma;
		this.descripcion = descripcion;
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


	public int getIdioma() {
		return idioma;
	}


	public void setIdioma(int idioma) {
		this.idioma = idioma;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "PeliculaIdioma [id=" + id + ", pelicula=" + pelicula + ", idioma=" + idioma + ", descripcion="
				+ descripcion + "]";
	}
	
	
}
