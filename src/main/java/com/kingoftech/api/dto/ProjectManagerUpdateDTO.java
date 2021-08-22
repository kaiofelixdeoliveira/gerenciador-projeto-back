package com.kingoftech.api.dto;

import java.util.Date;
import java.util.List;

import com.kingoftech.api.entities.Projetos;

public class ProjectManagerUpdateDTO {

	
	private String nome;
	private boolean ativo;
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
		return "ProjectManagerUpdateDTO [nome=" + nome + ", ativo=" + ativo + "]";
	}
	
	

	
}
