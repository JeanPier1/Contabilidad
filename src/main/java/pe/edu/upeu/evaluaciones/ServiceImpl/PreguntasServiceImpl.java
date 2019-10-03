package pe.edu.upeu.evaluaciones.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upeu.evaluaciones.Dao.PreguntasDao;
import pe.edu.upeu.evaluaciones.Service.PreguntasService;
import pe.edu.upeu.evaluaciones.entities.Preguntas;

@Service
@Transactional
public class PreguntasServiceImpl implements PreguntasService{
	
	@Autowired
	private PreguntasDao pregdao;

	@Override
	public Preguntas registrar(Preguntas as) {
		// TODO Auto-generated method stub
		return pregdao.save(as);
	}

	@Override
	public Preguntas editar(Preguntas as) {
		// TODO Auto-generated method stub
		return pregdao.save(as);
	}

	@Override
	public Boolean eliminar(Long id) {
		try {
			pregdao.deleteById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public Preguntas buscarxId(Long id) {
		// TODO Auto-generated method stub
		return pregdao.findById(id).orElse(null);
	}

	@Override
	public List<Preguntas> listar() {
		// TODO Auto-generated method stub
		return (List<Preguntas>) pregdao.findAll();
	}

	@Override
	public List<Preguntas> listarbyid(Long id) {
		// TODO Auto-generated method stub
		return pregdao.buscarid(id);
	}

}
