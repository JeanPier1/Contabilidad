package pe.edu.upeu.evaluaciones.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upeu.evaluaciones.Dao.InstrumentosDao;
import pe.edu.upeu.evaluaciones.Service.InstrumentosService;
import pe.edu.upeu.evaluaciones.entities.Instrumentos;

@Service
@Transactional
public class InstrumentosServiceImpl implements InstrumentosService{

	@Autowired
	private InstrumentosDao instdao;
	
	@Override
	public Instrumentos registrar(Instrumentos as) {
		// TODO Auto-generated method stub
		return instdao.save(as);
	}

	@Override
	public Instrumentos editar(Instrumentos as) {
		// TODO Auto-generated method stub
		return instdao.save(as);
	}

	@Override
	public Boolean eliminar(Long id) {
		try {
			instdao.deleteById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public Instrumentos buscarxId(Long id) {
		// TODO Auto-generated method stub
		return instdao.findById(id).orElse(null);	
	}

	@Override
	public List<Instrumentos> listar() {
		// TODO Auto-generated method stub
		return (List<Instrumentos>)instdao.findAll();
	}

	

}
