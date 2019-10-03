package pe.edu.upeu.evaluaciones.Dao;


import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upeu.evaluaciones.entities.Instrumentos;

public interface InstrumentosDao extends JpaRepository<Instrumentos, Long>{

	
}
