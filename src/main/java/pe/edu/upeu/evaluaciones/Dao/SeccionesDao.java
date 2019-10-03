package pe.edu.upeu.evaluaciones.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.edu.upeu.evaluaciones.entities.Secciones;

public interface SeccionesDao extends JpaRepository<Secciones, Long> {

	@Query(value="select * from secciones WHERE id_instrumentos=:id", nativeQuery = true)
	 List<Secciones> buscarid(@Param("id")long id);
	
}
