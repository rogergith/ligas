package com.ligas.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ligas.entity.PaisContinente;

@Repository("PaisContinenteRepository")
public interface PaisContinenteRepository extends JpaRepository<PaisContinente, Serializable>  {

	
	
}
