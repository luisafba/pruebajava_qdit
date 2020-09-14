package com.qdit.api.v1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qdit.api.v1.data.model.Sede;

@Repository("sedeRepository")
public interface SedeRepository extends JpaRepository<Sede, Integer> {

	List<Sede> findAllByIdUnivesidad(Integer idUniversidad);

	
}