package com.ligas.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "torneo")
public class Torneo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cod_torneo")
	private int id;
	
	@Column(name = "torneo")
	private String  torneo;
	
	@Column(name = "temporada")
	private String  temporada;
	
	@ManyToMany
	@JoinTable(
            name = "torneo_equipo",         
            joinColumns = {
            	@JoinColumn(name = "cod_torneo", referencedColumnName = "cod_torneo")
            	
            },
            inverseJoinColumns = {
            	@JoinColumn(name = "cod_equipo", referencedColumnName = "cod_equipo")
            }
    )
	private List<Equipo> equipos;
	
	@ManyToOne
	@JoinColumn(name = "cod_deporte")
	private Deporte deporte; 
	
	@ManyToOne
	@JoinColumn(name = "cod_paiscontinente")
	private PaisContinente pais;
	
	public Torneo(){}

	public Torneo(int id, String torneo, String temporada, Deporte deporte) {
		super();
		this.id = id;
		this.torneo = torneo;
		this.temporada = temporada;
		this.deporte = deporte;
	}
	
	

	public Torneo(int id, String torneo, String temporada, List<Equipo> equipos, Deporte deporte, PaisContinente pais) {
		super();
		this.id = id;
		this.torneo = torneo;
		this.temporada = temporada;
		this.equipos = equipos;
		this.deporte = deporte;
		this.pais = pais;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTorneo() {
		return torneo;
	}

	public void setTorneo(String torneo) {
		this.torneo = torneo;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	@Override
	public String toString() {
		return "Torneo [id=" + id + ", torneo=" + torneo + ", temporada=" + temporada + ", equipos=" + equipos
				+ ", deporte=" + deporte + ", pais=" + pais + "]";
	}

	
		
}
