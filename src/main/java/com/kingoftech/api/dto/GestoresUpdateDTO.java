package com.kingoftech.api.dto;

import java.util.Date;
import java.util.List;

import com.kingoftech.api.entities.Projetos;

public class GestoresUpdateDTO {

	private long createdBy;
	private long updatedBy;
	private Date updatedDate;
	private Date createdDate;
	private String nome;
	private boolean ativo=true;
	
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
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	@Override
	public String toString() {
		return "GestoresCreateDTO [createdBy=" + createdBy + ", updatedBy=" + updatedBy + ", updatedDate=" + updatedDate
				+ ", createdDate=" + createdDate + ", nome=" + nome + ", ativo=" + ativo + "]";
	}

	

}
