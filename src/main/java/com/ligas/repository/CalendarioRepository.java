package com.ligas.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ligas.entity.Calendario;

@Repository("CalendarioRepository")
public interface CalendarioRepository extends JpaRepository<Calendario, Serializable> {

	
	
}
