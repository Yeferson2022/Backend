package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cuenta;
import com.example.demo.modelo.Persona;
import com.example.demo.repositorio.CuentaRepositorio;
import com.example.demo.repositorio.PersonaRepositorio;

@Service
public class PersonaService implements PersonaRepositorio {

	@Autowired
	private PersonaRepositorio personaRepositorio;
	@Autowired
	private CuentaRepositorio cuentaRepositorio;
	
	
	
	

	@Override
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return  personaRepositorio.findAll();
	}

	@Override
	public List<Persona> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Persona> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Persona> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Persona> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Persona> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Persona getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Persona> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Persona> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Persona> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Persona> S save(S entity) {
		Cuenta cuenta = new Cuenta();
		Cuenta cuentacreada = cuentaRepositorio.save(cuenta);
		entity.setCuenta(cuentacreada);
		return personaRepositorio.save(entity);
		
	}
	
		
	
	
	
	
	
	

	@Override
	public Optional<Persona> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
       personaRepositorio.deleteById(id);		
	}

	@Override
	public void delete(Persona entity) {
       personaRepositorio.delete(entity);		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Persona> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Persona> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Persona> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Persona> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Persona> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
	


}
