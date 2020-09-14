package com.qdit.api.v1.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qdit.api.v1.data.dto.AuditDTO;
import com.qdit.api.v1.data.dto.ProgramaAcademicoDTO;
import com.qdit.api.v1.data.excepcion.MicroserviceException;
import com.qdit.api.v1.data.model.Sede;
import com.qdit.api.v1.data.model.Universidad;
import com.qdit.api.v1.repository.SedeRepository;
import com.qdit.api.v1.repository.UniversidadRepository;
import com.qdit.api.v1.service.ProgramaAcademicoService;

@Service
public class ProgramaAcademicoServiceImpl implements ProgramaAcademicoService {

	private static final long serialVersionUID = 1L;

	private final Logger logger = LoggerFactory.getLogger(ProgramaAcademicoServiceImpl.class);

	@Autowired
	private UniversidadRepository universidadRepository;

	@Autowired
	private SedeRepository sedeRepository;
	
	
	@Override
	public String crearProgramaAcademico(AuditDTO auditDTO, ProgramaAcademicoDTO programaAcademicoDTO)
			throws MicroserviceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Universidad> getUniversidades() {
		return universidadRepository.findAll();
	}

	@Override
	public List<Sede> getSedes(Integer idUniversidad) {
		return sedeRepository.findAllByIdUnivesidad(idUniversidad);
	}

	
}
