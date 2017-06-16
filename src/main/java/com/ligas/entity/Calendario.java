package com.ligas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "calendario")
public class Calendario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cod_calendario")
	private int id;
	
	@Column(name = "home")
	private String home;
	
	@Column(name = "visitante")
	private String visitante;
	
	@Column(name = "fecha")
	private String fecha;
	
	public Calendario(){}
	
	public Calendario(int id, String home, String visitante, String fecha) {
		super();
		this.id = id;
		this.home = home;
		this.visitante = visitante;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getVisitante() {
		return visitante;
	}

	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Calendario [id=" + id + ", home=" + home + ", visitante=" + visitante + ", fecha=" + fecha + "]";
	}
	
		
}
