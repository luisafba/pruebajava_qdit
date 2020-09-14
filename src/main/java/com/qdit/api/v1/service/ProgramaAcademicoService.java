package com.qdit.api.v1.service;

import java.util.List;

import com.qdit.api.v1.data.dto.AuditDTO;
import com.qdit.api.v1.data.dto.ProgramaAcademicoDTO;
import com.qdit.api.v1.data.excepcion.MicroserviceException;
import com.qdit.api.v1.data.model.Sede;
import com.qdit.api.v1.data.model.Sede;
import com.qdit.api.v1.data.model.Universidad;

public interface ProgramaAcademicoService {

	String crearProgramaAcademico(AuditDTO auditDTO, ProgramaAcademicoDTO programaAcademicoDTO) throws MicroserviceException;

	List<Universidad> getUniversidades();

	List<Sede> getSedes(Integer idUniversidad);
	
}
