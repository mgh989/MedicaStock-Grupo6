package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	
	@Column(name="nombreCompleto", nullable=false, length=50)
	private String nombreCompleto;
	
	@Column(name="DNI", nullable=false, length=8)
	private int dni;
	
	@Column(name="Correo", nullable=false, length=50)
	private String correo;
	
	@Column(name="Contraseña", nullable=false, length=30)
	private String contraseña;
	
	
	
	
}