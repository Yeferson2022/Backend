package com.example.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;


@Entity
@Table (name = "Pais")
public class Pais {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	@NotNull
	private String Nombre;
	
	public Pais() {
	}
	
	
	public Pais(String nombre) {
		super();
		Nombre = nombre;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	
}
