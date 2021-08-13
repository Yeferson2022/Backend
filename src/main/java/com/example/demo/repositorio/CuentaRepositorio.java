package com.example.demo.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.modelo.Cuenta;

public interface CuentaRepositorio extends JpaRepository<Cuenta, Long>{

	
}

