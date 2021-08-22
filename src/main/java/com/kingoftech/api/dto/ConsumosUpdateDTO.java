package com.kingoftech.api.dto;

public class ConsumosUpdateDTO {

	private int horasConsultoria;
	private int horasAnalise;
	private int horasDesenvolvimento;
	private String descricao;
	private int totalHoras;

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

	@Override
	public String toString() {
		return "ConsumosUpdateDTO [horasConsultoria=" + horasConsultoria + ", horasAnalise=" + horasAnalise
				+ ", horasDesenvolvimento=" + horasDesenvolvimento + ", descricao=" + descricao + ", totalHoras="
				+ totalHoras + "]";
	}

}
