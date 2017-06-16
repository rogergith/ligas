package com.ligas.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "equipo")
public class Equipo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cod_equipo")
	private int id;
	
	@Column(name = "equipo")
	private String equipo;
	
	@ManyToMany(mappedBy = "equipos")
	private List<Torneo> torneos;
	
	@ManyToOne
	@JoinColumn(name = "cod_paiscontinente")
	private PaisContinente pais;
	
	
	public Equipo(){}

	public Equipo(int id, String equipo) {
		super();
		this.id = id;
		this.equipo = equipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Equipo [id=" + id + ", equipo=" + equipo + "]";
	}
	

}
