package pe.edu.upeu.evaluaciones.Service;

import java.util.List;

import pe.edu.upeu.evaluaciones.entities.Alternativas;

public interface AlternativasService {
	
	Alternativas registrar(Alternativas as);
	Alternativas editar(Alternativas as);
	Boolean eliminar(Long id);
	Alternativas buscarxId(Long id);
	List<Alternativas> listar();
}
