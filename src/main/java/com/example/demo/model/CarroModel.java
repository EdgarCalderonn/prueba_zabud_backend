package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import java.util.Date;
import java.sql.Timestamp;


@Entity
public class CarroModel {
	
	// Identificador
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	// Marca del vehículo
	private String marca;
	
	// Modelo del vehículo
	private String modelo;
	
	
	// Año del vehículo
	private Integer anio;
	
	// Última edición
	private long last_modify;
	
	
	private String last_modify_formated;
	
	
	
	public Integer getId()
	{
		return this.id;
	}
	
	public void setId(Integer ID)
	{
		this.id = ID;
	}
	
	
	public String getMarca()
	{
		return this.marca;
	}
	
	public void setMarca(String Marca)
	{
		this.marca = Marca;
	}
	
	
	public String getModelo()
	{
		return this.modelo;
	}
	
	
	public void setModelo(String Modelo)
	{
		this.modelo = Modelo;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public long getLast_modify() {
		return last_modify;
	}

	public void setLast_modify(long last_modify) {
		this.last_modify = last_modify;
	}

	public String getLast_modify_formated() {
		return last_modify_formated;
	}

	public void setLast_modify_formated(String last_modify_formated) {
		this.last_modify_formated = last_modify_formated;
	}
	
	
	

}