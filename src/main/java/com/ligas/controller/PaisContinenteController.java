package com.ligas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ligas.service.PaisContinenteService;

import com.ligas.entity.PaisContinente;

@RestController
@RequestMapping("/pc")
public class PaisContinenteController {

	@Autowired
	@Qualifier("PaisContinenteServiceImpl")
	private PaisContinenteService pcs;
	
	/*
	 * http://localhost:9011/pc/
	 */
	@GetMapping("/")
	public List<PaisContinente> paises(){
		
		return pcs.paises();
		
	}
	
}
