package com.kingoftech.api.dto;

import java.util.Date;
import java.util.List;

import com.kingoftech.api.entities.Projetos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GestoresViewDTO {

	private Long id;
	private String createdBy;
	private String updatedBy;
	private Date updatedDate;
	private Date createdDate;
	private String nome;
	private boolean ativo;
	private List<Projetos> projeto;
	

}
