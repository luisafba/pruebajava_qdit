package com.qdit.api.v1.data.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "univ_universidad")
public class Universidad implements Serializable{
	private static final long serialVersionUID = 1L;

	@GenericGenerator(name = "universidadGenerator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "universidad_pk_seq"), })
	@Id
	@GeneratedValue(generator = "universidadGenerator")
	@JsonIgnore
	@Column(name = "univ_id", nullable = false)
	private Integer id;

    @Column(name = "univ_descripcion", nullable = true)
    private String descripcion;
    
    @Column(name = "univ_estado", nullable = false)
    private String estado;
}
