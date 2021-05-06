package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entity.Usuario;

public class UsuarioDaoImpl implements Serializable, IUsuarioDao {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Usuario Usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(int idUsuario) {
		// TODO Auto-generated method stub
		
	}
	
	

}
