package pe.edu.upeu.evaluaciones.Service;

import java.util.List;

import pe.edu.upeu.evaluaciones.entities.Instrumentos;

public interface InstrumentosService {
	
	Instrumentos registrar(Instrumentos as);
	Instrumentos editar(Instrumentos as);
	Boolean eliminar(Long id);
	Instrumentos buscarxId(Long id);
	List<Instrumentos> listar();

}
