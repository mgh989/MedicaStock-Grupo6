package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IRepartidorDao;
import pe.edu.upc.entity.Repartidor;

public class RepartidorDaoImpl implements IRepartidorDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="a")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Repartidor repartidor) {
		em.persist(repartidor);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Repartidor> listar() {
		List<Repartidor> lista = new ArrayList<Repartidor>();
		Query q = em.createQuery("select r from Repartidor r");
		lista = (List<Repartidor>) q.getResultList();
		return lista;
	}
}