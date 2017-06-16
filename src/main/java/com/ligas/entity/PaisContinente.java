package com.ligas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paiscontinente")
public class PaisContinente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cod_paiscontinente")
	private int id;
	
	@Column(name = "pais")
	private String pais;
	
	public PaisContinente(){}

	public PaisContinente(int id, String pais) {
		super();
		this.id = id;
		this.pais = pais;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "PaisContinente [id=" + id + ", pais=" + pais + "]";
	}
		
}
