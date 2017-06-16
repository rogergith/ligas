package com.ligas.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ligas.entity.Deporte;
import com.ligas.entity.Equipo;
import com.ligas.entity.dto.DtoDeportes;
import com.ligas.service.DeporteService;

@RestController
@RequestMapping("/api/")
public class DeporteController {

	private static Log LOG = LogFactory.getLog(DeporteController.class);
	
	@Autowired
	@Qualifier("DeporteServiceImpl")
	private DeporteService deporteService;
	
	/*
	 * http://localhost:9011/api/ligas/deporte
	 * Metodo: POST
	 */
	@PostMapping("/deporte")
	public void almacenar(@RequestBody Deporte deporte){
		
		LOG.info("METODO 'almacenarddddd' "+deporte);
		deporteService.almacenar(deporte);
		
	}
	/*
	 * 
	 * http://localhost:9011/api/ligas/deportes
	 * Metodo: GET
	 */
	@GetMapping("/deportes")
	public DtoDeportes deportes(){
		
		LOG.info("METODO 'almacenar' ");
		
		return deporteService.deportes();
		
	}
	
	
}
