package com.kingoftech.api.dto;

import java.io.Serializable;
import java.util.Calendar;

import com.kingoftech.api.entities.Faturamentos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class LancamentosFaturamentoCreateDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1497896277680831975L;

	@Getter @Setter
	private int parcela;
	@Getter @Setter
	private Calendar data;
	@Getter @Setter
	private int horasConsultoria;
	@Getter @Setter
	private int horasAnalise;
	@Getter @Setter
	private int horasDesenvolvimento;
	@Getter @Setter
	private String notaFiscal;
	@Getter @Setter
	private Faturamentos faturamentos;

	
}
