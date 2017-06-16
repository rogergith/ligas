package com.ligas.service;

import java.util.List;

import com.ligas.entity.Deporte;
import com.ligas.entity.Equipo;
import com.ligas.entity.dto.DtoDeportes;

public interface DeporteService {

	public void almacenar(Deporte deporte);
	
	public DtoDeportes deportes();
}
