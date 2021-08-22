package com.kingoftech.api.dto;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.kingoftech.api.entities.Projetos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@ToString
@Getter @Setter
public class RecursoCreateDTO {

	@NotNull(message="nome não pode ser nulo")
	private String nome;
	private boolean ativo=true;
	
	//private List<Projetos> projeto;
	
}
