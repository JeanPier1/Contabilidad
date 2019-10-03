package pe.edu.upeu.evaluaciones.Service;

import java.util.List;

import pe.edu.upeu.evaluaciones.entities.Preguntas;

public interface PreguntasService {

	Preguntas registrar(Preguntas as);
	Preguntas editar(Preguntas as);
	Boolean eliminar(Long id);
	Preguntas buscarxId(Long id);
	List<Preguntas> listar();
	
	List<Preguntas> listarbyid(Long id);
}
