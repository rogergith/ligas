package com.ligas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;

import com.ligas.entity.Deporte;
import com.ligas.entity.Equipo;
import com.ligas.entity.dto.DtoDeportes;
import com.ligas.repository.DeporteRepository;
import com.ligas.repository.EquipoRepository;
import com.ligas.service.DeporteService;

@Service("DeporteServiceImpl")
public class DeporteServiceImpl implements DeporteService {

	@Autowired
	@Qualifier("DeporteRepository")
	private DeporteRepository deporteRepository;

	@Override
	public void almacenar(Deporte deporte) {
		// TODO Auto-generated method stub
		deporteRepository.save(deporte);
		
		
	}

	@Override
	public DtoDeportes deportes() {
		// TODO Auto-generated method stub
		
		DtoDeportes deportes = new DtoDeportes();
		
		deportes.setDeportes(deporteRepository.findAll());
		
		return deportes;
		
		
	}


}
