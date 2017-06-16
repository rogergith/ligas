package com.ligas.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ligas.entity.Torneo;

@Repository("TorneoRepository")
public interface TorneoRepository extends JpaRepository<Torneo, Serializable> {

	
	
}
