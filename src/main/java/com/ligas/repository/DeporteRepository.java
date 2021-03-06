package com.ligas.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ligas.entity.Deporte;

@Repository("DeporteRepository")
public interface DeporteRepository extends JpaRepository<Deporte, Serializable> {

	
	
}
