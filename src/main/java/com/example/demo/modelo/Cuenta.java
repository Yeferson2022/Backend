package com.example.demo.modelo;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name = "Cuenta")
public class Cuenta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	private int NCuenta = (int)(Math.random()*10+1); //(int)(Math.random()(*999 - 000+1)+000);
	
	
//  @Column(name="VCuenta", columnDefinition="Decimal() default '100.000.000'")
	
	@Column(name="VCuenta")
    private int VCuenta = 1000000;
	
	public Cuenta() {
	}
		
	public Cuenta(int nCuenta, int vCuenta) {
		super();
		NCuenta = nCuenta;
		VCuenta = vCuenta;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getNCuenta() {
		return NCuenta;
	}
	public void setNCuenta(int nCuenta) {
		NCuenta = nCuenta;
	}
	public double getVCuenta() {
		return VCuenta;
	}
	public void setVCuenta(int vCuenta) {
		VCuenta = vCuenta;
	}
	
}
