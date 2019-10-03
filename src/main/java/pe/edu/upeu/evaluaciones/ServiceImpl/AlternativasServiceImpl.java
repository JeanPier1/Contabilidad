package pe.edu.upeu.evaluaciones.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upeu.evaluaciones.Dao.AlternativasDao;
import pe.edu.upeu.evaluaciones.Service.AlternativasService;
import pe.edu.upeu.evaluaciones.entities.Alternativas;

@Service
@Transactional
public class AlternativasServiceImpl implements AlternativasService{

	@Autowired
	private AlternativasDao us;

	@Override
	public Alternativas registrar(Alternativas as) {
		// TODO Auto-generated method stub
		return us.save(as);
	}

	@Override
	public Alternativas editar(Alternativas as) {
		// TODO Auto-generated method stub
		return us.save(as);
	}
	@Override
	public Alternativas buscarxId(Long id) {
		// TODO Auto-generated method stub
		return us.findById(id).orElse(null);
	}

	@Override
	public List<Alternativas> listar() {
		// TODO Auto-generated method stub
		return (List<Alternativas>) us.findAll();
	}

	@Override
	public Boolean eliminar(Long id) {
		try {
			us.deleteById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
}
