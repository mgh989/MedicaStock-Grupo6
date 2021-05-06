package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
		em.persist(Usuario);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> list() {
		List<Usuario> lista=new ArrayList<Usuario>();
		Query q = em.createQuery("from Usuario u");
		lista = (List<Usuario>) q.getResultList();
		return lista;
	}
}