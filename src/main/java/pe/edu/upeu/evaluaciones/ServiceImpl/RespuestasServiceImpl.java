package pe.edu.upeu.evaluaciones.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upeu.evaluaciones.Dao.RespuestasDao;
import pe.edu.upeu.evaluaciones.Service.RespuestasService;
import pe.edu.upeu.evaluaciones.entities.Respuestas;

@Service
@Transactional
public class RespuestasServiceImpl implements RespuestasService{

	@Autowired
	private RespuestasDao respdao;
	
	@Override
	public Respuestas registrar(Respuestas as) {
		// TODO Auto-generated method stub
		return respdao.save(as);
	}

	@Override
	public Respuestas editar(Respuestas as) {
		// TODO Auto-generated method stub
		return respdao.save(as);
	}

	@Override
	public Boolean eliminar(Long id) {
		try {
			respdao.deleteById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public Respuestas buscarxId(Long id) {
		// TODO Auto-generated method stub
		return respdao.findById(id).orElse(null);
	}

	@Override
	public List<Respuestas> listar() {
		// TODO Auto-generated method stub
		return (List<Respuestas>) respdao.findAll();
	}
	
}
