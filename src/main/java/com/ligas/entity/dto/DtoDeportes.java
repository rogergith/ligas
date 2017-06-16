package com.ligas.entity.dto;

import java.util.List;

import com.ligas.entity.Deporte;

public class DtoDeportes {
	
	private List<Deporte> deportes;

	public DtoDeportes(){}
	
	public DtoDeportes(int status, List<Deporte> deportes) {
		super();
		this.deportes = deportes;
	}


	public List<Deporte> getDeportes() {
		return deportes;
	}

	public void setDeportes(List<Deporte> deportes) {
		this.deportes = deportes;
	}

	@Override
	public String toString() {
		return "DtoDeportes [deportes=" + deportes + "]";
	}
	
	
}
