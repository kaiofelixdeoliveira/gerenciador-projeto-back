package com.kingoftech.api.dto;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.OneToMany;

import com.kingoftech.api.entities.LancamentosFaturamento;
import com.kingoftech.api.entities.Projetos;

public class FaturamentosUpdateDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3663448654283433403L;
	
	
	private int quantidadeParcelas;
	private List<LancamentosFaturamento> lancamentosFaturamento;
	public int getQuantidadeParcelas() {
		return quantidadeParcelas;
	}
	public void setQuantidadeParcelas(int quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}
	public List<LancamentosFaturamento> getLancamentosFaturamento() {
		return lancamentosFaturamento;
	}
	public void setLancamentosFaturamento(List<LancamentosFaturamento> lancamentosFaturamento) {
		this.lancamentosFaturamento = lancamentosFaturamento;
	}
	@Override
	public String toString() {
		return "FaturamentosUpdateDTO [quantidadeParcelas=" + quantidadeParcelas + ", lancamentosFaturamento="
				+ lancamentosFaturamento + "]";
	}
	
	
	
}
