package com.kingoftech.api.dto;

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


public class LancamentosFaturamentoViewDTO {

	private Long id;
	private int parcela;
	private Calendar data;
	private int horasConsultoria;
	private int horasAnalise;
	private int horasDesenvolvimento;
	private String notaFiscal;
	private Faturamentos faturamentos;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public Faturamentos getFaturamentos() {
		return faturamentos;
	}
	public void setFaturamentos(Faturamentos faturamentos) {
		this.faturamentos = faturamentos;
	}
	@Override
	public String toString() {
		return "LancamentosFaturamentoViewDTO [id=" + id + ", parcela=" + parcela + ", data=" + data
				+ ", horasConsultoria=" + horasConsultoria + ", horasAnalise=" + horasAnalise
				+ ", horasDesenvolvimento=" + horasDesenvolvimento + ", notaFiscal=" + notaFiscal + ", faturamentos="
				+ faturamentos + "]";
	}
	
	
	
}
