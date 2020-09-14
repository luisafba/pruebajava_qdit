package com.qdit.api.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qdit.api.v1.data.model.Universidad;

@Repository("universidadRepository")
public interface UniversidadRepository extends JpaRepository<Universidad, Integer> {

	
}