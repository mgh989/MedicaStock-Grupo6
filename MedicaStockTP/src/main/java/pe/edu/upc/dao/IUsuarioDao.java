package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Usuario;

public interface IUsuarioDao {
	public void insert(Usuario Usuario);
	public List<Usuario> list();
	public void eliminar(int idUsuario);
}