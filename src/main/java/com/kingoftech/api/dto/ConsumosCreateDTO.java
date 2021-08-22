package com.kingoftech.api.dto;

import java.io.Serializable;

import com.kingoftech.api.entities.Projetos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter @Setter
public class ConsumosCreateDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7434479781277643230L;
	
	private int horasConsultoria;
	private int horasAnalise;
	private int horasDesenvolvimento;
	private String descricao;
	private int totalHoras;
	private Projetos projeto;

	

}
