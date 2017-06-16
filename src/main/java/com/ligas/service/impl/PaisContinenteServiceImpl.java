package com.ligas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ligas.entity.PaisContinente;
import com.ligas.repository.PaisContinenteRepository;
import com.ligas.service.PaisContinenteService;

@Service("PaisContinenteServiceImpl")
public class PaisContinenteServiceImpl implements PaisContinenteService{

	@Autowired
	@Qualifier("PaisContinenteRepository")
	private PaisContinenteRepository pcRepository;
	
	@Override
	public List<PaisContinente> paises() {
		// TODO Auto-generated method stub
		return pcRepository.findAll();
	
	}

}
