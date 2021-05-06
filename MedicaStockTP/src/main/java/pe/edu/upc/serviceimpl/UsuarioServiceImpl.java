package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IUsuarioService;


@Named
@RequestScoped
public class UsuarioServiceImpl implements IUsuarioService {
	
	@Inject
	private IUsuarioDao uD; 

	@Override
	public void insert(Usuario u) {
		uD.insert(u);		
	}

	@Override
	public List<Usuario> list() {
		return uD.list();
	}
}