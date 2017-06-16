package com.ligas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "deporte")
public class Deporte {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cod_deporte")
	private int id;
	
	@Column(name = "deporte", nullable = true)
	private String deporte;
	
	
	public Deporte(){}

	public Deporte(int id, String deporte) {
		super();
		this.id = id;
		this.deporte = deporte;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	@Override
	public String toString() {
		return "Deporte [id=" + id + ", deporte=" + deporte + "]";
	}
	
	
	
}
