package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Repartidor;
import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IRepartidorService;
import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped
public class RepartidorController implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private IUsuarioService uS;
	
	@Inject
	private IRepartidorService rS;
	
	private Usuario usuario;
	private Repartidor repartidor;
	List<Usuario> listaUsuarios;
	List<Repartidor> listaRepartidores;
	
	@PostConstruct
	public void init() {
		usuario = new Usuario();
		repartidor = new Repartidor();
		
		listaUsuarios = new ArrayList<Usuario>();
		listaRepartidores = new ArrayList<Repartidor>();
		
		this.listar();
		this.listRepartidor();
	}
	
	public String nuevoRepartidor() {
		this.setRepartidor(new Repartidor());
		return "repartidor.xhtml";
	}
	
	public void insertar() {
		rS.insertar(repartidor);
		this.listRepartidor();
	}
	
	public void listar() {
		listaUsuarios = uS.list();
	}
	
	public void listRepartidor() {
		listaRepartidores = rS.listar();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Repartidor getRepartidor() {
		return repartidor;
	}

	public void setRepartidor(Repartidor repartidor) {
		this.repartidor = repartidor;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Repartidor> getListaRepartidores() {
		return listaRepartidores;
	}

	public void setListaRepartidores(List<Repartidor> listaRepartidores) {
		this.listaRepartidores = listaRepartidores;
	}
	
}
