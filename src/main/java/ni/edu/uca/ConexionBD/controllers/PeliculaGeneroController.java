package ni.edu.uca.ConexionBD.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ni.edu.uca.ConexionBD.models.PeliculaGenero;
import ni.edu.uca.ConexionBD.services.PeliculaGeneroService;


@RestController
@RequestMapping(path = "/peliculagenero")
public class PeliculaGeneroController {
	@Autowired
	PeliculaGeneroService servicio;
	
	@RequestMapping("/listar")
	public List<Map<String, Object>> listar(){
		return servicio.ListarRegistro();
	}
	
	@PostMapping("/agregar")
	public String AgregarPelGen(@RequestBody PeliculaGenero pg) {
		String msg = "Error al guardar registro...";
		int b = servicio.GuardarRegistro(pg);
		if(b==1) msg = "Registro guardado satisfactoriamente...";
		return msg;
	}
	
	@PutMapping("/actualizar/{id}")
	public String EditarPelGen(@RequestBody PeliculaGenero pg, @PathVariable int id, Model model) {
		String msg = "Error al editar registro...";
		//g.setIdGenero(id);
		int b = servicio.EditarRegistro(pg);
		if(b == 1) msg ="Registro editado satisfactoriamente...";
		return msg;
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String EliminarPelGen(@PathVariable int id, Model model) {
		String msg = "Error al eliminar registro...";
		int b = servicio.EliminarRegistro(id);
		if (b == 1 ) msg = "Registro Eliminado satisfactoriamente...";
		return msg;
	}
	
}