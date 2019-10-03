package pe.edu.upeu.evaluaciones.Service;

import java.util.List;

import pe.edu.upeu.evaluaciones.entities.Respuestas;

public interface RespuestasService {

	Respuestas registrar(Respuestas as);
	Respuestas editar(Respuestas as);
	Boolean eliminar(Long id);
	Respuestas buscarxId(Long id);
	List<Respuestas> listar();
}
