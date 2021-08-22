package com.kingoftech.api.dto;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.OneToMany;

import com.kingoftech.api.entities.LancamentosFaturamento;
import com.kingoftech.api.entities.Projetos;

public class FaturamentosViewDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3663448654283433403L;
	
	private Long id;
	private long createdBy;
	private long updatedBy;
	private Calendar updatedDate;
	private Calendar createdDate;
	private int quantidadeParcelas;
	private Projetos projeto;
	private List<LancamentosFaturamento> lancamentosFaturamento;
	
	public long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}
	public long getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(long updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Calendar getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Calendar updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Calendar getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Calendar createdDate) {
		this.createdDate = createdDate;
	}
	public int getQuantidadeParcelas() {
		return quantidadeParcelas;
	}
	public void setQuantidadeParcelas(int quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}
	public Projetos getProjeto() {
		return projeto;
	}
	public void setProjeto(Projetos projeto) {
		this.projeto = projeto;
	}
	public List<LancamentosFaturamento> getLancamentosFaturamento() {
		return lancamentosFaturamento;
	}
	public void setLancamentosFaturamento(List<LancamentosFaturamento> lancamentosFaturamento) {
		this.lancamentosFaturamento = lancamentosFaturamento;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "FaturamentosViewDTO [id=" + id + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + ", createdDate=" + createdDate + ", quantidadeParcelas="
				+ quantidadeParcelas + ", projeto=" + projeto + ", lancamentosFaturamento=" + lancamentosFaturamento
				+ "]";
	}
	
	
	
	
	
	
}
