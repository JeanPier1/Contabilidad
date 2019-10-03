package pe.edu.upeu.evaluaciones.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.edu.upeu.evaluaciones.entities.Preguntas;

public interface PreguntasDao extends JpaRepository<Preguntas, Long>{

	@Query(value="select * from preguntas WHERE id_secciones=:id", nativeQuery = true)
	 List<Preguntas> buscarid(@Param("id")long id);
}
