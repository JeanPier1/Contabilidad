package pe.edu.upeu.evaluaciones.Service;

import java.util.List;

import pe.edu.upeu.evaluaciones.entities.Secciones;

public interface SeccionesService {
	Secciones registrar(Secciones as);
	Secciones editar(Secciones as);
	Boolean eliminar(Long id);
	Secciones buscarxId(Long id);
	List<Secciones> listar();
	List<Secciones> listarid(Long id);

}
