package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Cliente;
import pe.edu.upc.entity.Usuario;
import pe.edu.upc.service.IClienteService;
import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped
public class ClienteController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IUsuarioService uS;
	@Inject
	private IClienteService cS;
	
	private Usuario usuario;
	private Cliente cliente;
	List<Usuario> listaUsuarios;
	List<Cliente> listaClientes;
	
	@PostConstruct
	public void init() {
		usuario = new Usuario();
		cliente = new Cliente();
		
		listaUsuarios = new ArrayList<Usuario>();
		listaClientes = new ArrayList<Cliente>();
		
		this.listar();
		this.listCliente();
	}
	
	public String nuevoCliente() {
		this.setCliente(new Cliente());
		return "cliente.xhtml";
	}
	
	public void insertar() {
		cS.insertar(cliente);
		this.listCliente();
	}
	
	public void listar() {
		listaUsuarios = uS.list();
	}
	
	public void listCliente() {
		listaClientes = cS.listar();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}	
}