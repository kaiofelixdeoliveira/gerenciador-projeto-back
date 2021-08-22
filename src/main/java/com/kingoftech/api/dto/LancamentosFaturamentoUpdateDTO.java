package com.kingoftech.api.dto;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.kingoftech.api.entities.Faturamentos;

public class LancamentosFaturamentoUpdateDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8710936151939913787L;
	
	private int parcela;
	private Calendar data;
	private int horasConsultoria;
	private int horasAnalise;
	private int horasDesenvolvimento;
	private String notaFiscal;

	public int getParcela() {
		return parcela;
	}

	public void setParcela(int parcela) {
		this.parcela = parcela;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public int getHorasConsultoria() {
		return horasConsultoria;
	}

	public void setHorasConsultoria(int horasConsultoria) {
		this.horasConsultoria = horasConsultoria;
	}

	public int getHorasAnalise() {
		return horasAnalise;
	}

	public void setHorasAnalise(int horasAnalise) {
		this.horasAnalise = horasAnalise;
	}

	public int getHorasDesenvolvimento() {
		return horasDesenvolvimento;
	}

	public void setHorasDesenvolvimento(int horasDesenvolvimento) {
		this.horasDesenvolvimento = horasDesenvolvimento;
	}

	public String getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(String notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	@Override
	public String toString() {
		return "LancamentosFaturamentoUpdateDTO [parcela=" + parcela + ", data=" + data + ", horasConsultoria="
				+ horasConsultoria + ", horasAnalise=" + horasAnalise + ", horasDesenvolvimento=" + horasDesenvolvimento
				+ ", notaFiscal=" + notaFiscal + "]";
	}

}
