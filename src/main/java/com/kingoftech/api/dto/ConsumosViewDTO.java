package com.kingoftech.api.dto;

import com.kingoftech.api.entities.Projetos;

public class ConsumosViewDTO {

	private Long id;
	private int horasConsultoria;
	private int horasAnalise;
	private int horasDesenvolvimento;
	private String descricao;
	private int totalHoras;
	private Projetos projeto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getTotalHoras() {
		return totalHoras;
	}

	public void setTotalHoras(int totalHoras) {
		this.totalHoras = totalHoras;
	}

	public Projetos getProjeto() {
		return projeto;
	}

	public void setProjeto(Projetos projeto) {
		this.projeto = projeto;
	}

	@Override
	public String toString() {
		return "ConsumosViewDTO [id=" + id + ", horasConsultoria=" + horasConsultoria + ", horasAnalise=" + horasAnalise
				+ ", horasDesenvolvimento=" + horasDesenvolvimento + ", descricao=" + descricao + ", totalHoras="
				+ totalHoras + ", projeto=" + projeto + "]";
	}

}
