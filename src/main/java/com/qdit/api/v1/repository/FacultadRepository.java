package com.qdit.api.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qdit.api.v1.data.model.Facultad;

@Repository("facultadRepository")
public interface FacultadRepository extends JpaRepository<Facultad, Integer> {

	
}