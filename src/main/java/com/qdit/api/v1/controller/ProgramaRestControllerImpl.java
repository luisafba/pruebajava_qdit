package com.qdit.api.v1.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qdit.api.v1.data.dto.AuditDTO;
import com.qdit.api.v1.data.dto.ProgramaAcademicoDTO;
import com.qdit.api.v1.data.model.Sede;
import com.qdit.api.v1.data.model.Universidad;
import com.qdit.api.v1.service.ProgramaAcademicoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@Api(tags = { "Programa academico" })
@SwaggerDefinition(tags = { @Tag(name = "Programa academico", description = "Api programa academico") })
@RestController
@RequestMapping(ProgramaRestControllerImpl.PATH_BASE)
public class ProgramaRestControllerImpl {
	public static final String PATH_BASE = "/api/v1";

	private final Logger logger = LoggerFactory.getLogger(ProgramaRestControllerImpl.class);

	@Autowired
	private ProgramaAcademicoService programaAcademicoService;
	
	
	@PostMapping("/programaacademico")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Programa academico"),
			@ApiResponse(code = 401, message = "401 Unauthorized"), @ApiResponse(code = 403, message = "403 Forbbiden"),
			@ApiResponse(code = 404, message = "404 No found") })
	public ResponseEntity<String> crearProgramaAcademico(Map<String, String> headers,
			ProgramaAcademicoDTO programaAcademicoDTO) throws Exception {
		logger.info("Init crearProgramaAcademico programaAcademicoDTO={}", programaAcademicoDTO);
		
		AuditDTO auditDTO = new AuditDTO();
		return new ResponseEntity<String>(programaAcademicoService.crearProgramaAcademico(auditDTO, programaAcademicoDTO),
				HttpStatus.CREATED );
	}
	@GetMapping("/programaacademico")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "User was create"),
			@ApiResponse(code = 401, message = "401 Unauthorized"), @ApiResponse(code = 403, message = "403 Forbbiden"),
			@ApiResponse(code = 404, message = "404 No found") })
	public ResponseEntity<String>  getPrograma() throws Exception{
		return new ResponseEntity<String>("Obtener",HttpStatus.OK);
	}
	
	@GetMapping("/universidades")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "User was create"),
			@ApiResponse(code = 401, message = "401 Unauthorized"), @ApiResponse(code = 403, message = "403 Forbbiden"),
			@ApiResponse(code = 404, message = "404 No found") })
	public ResponseEntity<List<Universidad>>  getUniversidades() throws Exception{
		return new ResponseEntity<List<Universidad>>(programaAcademicoService.getUniversidades(),HttpStatus.OK);
	}
	
	@GetMapping("/universidad/{id}/sedes")
	public ResponseEntity<List<Sede>>  getSedes(@PathVariable("id") Integer idUniversidad) throws Exception{
		return new ResponseEntity<List<Sede>>(programaAcademicoService.getSedes(idUniversidad),HttpStatus.OK);
	}


}
