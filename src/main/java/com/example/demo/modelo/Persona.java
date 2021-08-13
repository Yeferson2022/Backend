package com.example.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;

import com.sun.istack.NotNull;




@Entity
@Table (name = "Persona")


public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int Documento;
	@NotNull
	private String Nombre;
	@NotNull
	private String Apellido;
	@NotNull
	
	private String Correo;
	
	@ManyToOne
	@JoinColumn (name="id_pais")
	private Pais pais;
	
	@OneToOne(mappedBy="idpersona_idcuenta")
	private Cuenta cuenta;
	
	public Persona() {
		
	}
	public Persona(int documento, String nombre, String apellido, String correo, Pais pais, Cuenta cuenta) {
		super();
		Documento = documento;
		Nombre = nombre;
		Apellido = apellido;
		Correo = correo;
		this.pais = pais;
	    this.cuenta = cuenta;
	}

	public int getDocumento() {
		return Documento;
	}

	public void setDocumento(int documento) {
		Documento = documento;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public Pais getPais() {
		return pais;
	}

	public void set(Pais pais) {
		this.pais = pais;
	}
	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	
}
