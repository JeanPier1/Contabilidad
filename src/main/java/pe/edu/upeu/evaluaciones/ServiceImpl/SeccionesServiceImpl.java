package pe.edu.upeu.evaluaciones.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upeu.evaluaciones.Dao.SeccionesDao;
import pe.edu.upeu.evaluaciones.Service.SeccionesService;
import pe.edu.upeu.evaluaciones.entities.Secciones;

@Service
@Transactional
public class SeccionesServiceImpl implements SeccionesService{
	
	@Autowired
	private SeccionesDao seccdao;

	@Override
	public Secciones registrar(Secciones as) {
		// TODO Auto-generated method stub
		return seccdao.save(as);
	}

	@Override
	public Secciones editar(Secciones as) {
		// TODO Auto-generated method stub
		return seccdao.save(as);
	}

	@Override
	public Boolean eliminar(Long id) {
		try {
			seccdao.deleteById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	@Override
	public Secciones buscarxId(Long id) {
		// TODO Auto-generated method stub
		return seccdao.findById(id).orElse(null);
	}

	@Override
	public List<Secciones> listar() {
		// TODO Auto-generated method stub
		return (List<Secciones>)seccdao.findAll();
	}

	@Override
	public List<Secciones> listarid(Long id) {
		// TODO Auto-generated method stub
		return seccdao.buscarid(id);
	}

}
