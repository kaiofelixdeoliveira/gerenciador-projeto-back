package com.kingoftech.api.dto;

import java.util.Calendar;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.kingoftech.api.entities.Consumos;
import com.kingoftech.api.entities.Faturamentos;
import com.kingoftech.api.entities.Gestores;
import com.kingoftech.api.entities.ProjectManagers;
import com.kingoftech.api.entities.Projetos;
import com.kingoftech.api.entities.Recursos;


public class ProjetosViewDTO {

	private Long id;
	private String codigo;
	private String proposta;
	private String descricao;
	private int quantidadeHoras;
	private Calendar dataContratacao;
	private String observacao;
	private boolean ativo;
	private Gestores gestor;
	private ProjectManagers projectManagers;
	private List<Faturamentos> faturamentos;
	private List<Recursos> recursos;
	private List<Consumos> consumos;
	
	public ProjetosViewDTO() {
		
	}
	

	public ProjetosViewDTO(Projetos obj) {
		this.id = obj.getId();
		this.codigo = obj.getCodigo();
		this.proposta = obj.getProposta();
		this.descricao = obj.getDescricao();
		this.quantidadeHoras = obj.getQuantidadeHoras();
		this.dataContratacao = obj.getDataContratacao();
		this.observacao = obj.getObservacao();
		this.ativo = obj.isAtivo();
		this.gestor = obj.getGestor();
		this.projectManagers = obj.getProjectManagers();
		this.faturamentos = obj.getFaturamentos();
		this.recursos = obj.getRecursos();
		this.consumos = obj.getConsumos();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getProposta() {
		return proposta;
	}


	public void setProposta(String proposta) {
		this.proposta = proposta;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getQuantidadeHoras() {
		return quantidadeHoras;
	}


	public void setQuantidadeHoras(int quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}


	public Calendar getDataContratacao() {
		return dataContratacao;
	}


	public void setDataContratacao(Calendar dataContratacao) {
		this.dataContratacao = dataContratacao;
	}


	public String getObservacao() {
		return observacao;
	}


	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	public boolean isAtivo() {
		return ativo;
	}


	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}


	public Gestores getGestor() {
		return gestor;
	}


	public void setGestor(Gestores gestor) {
		this.gestor = gestor;
	}


	public ProjectManagers getProjectManagers() {
		return projectManagers;
	}


	public void setProjectManagers(ProjectManagers projectManagers) {
		this.projectManagers = projectManagers;
	}


	public List<Faturamentos> getFaturamentos() {
		return faturamentos;
	}


	public void setFaturamentos(List<Faturamentos> faturamentos) {
		this.faturamentos = faturamentos;
	}


	public List<Recursos> getRecursos() {
		return recursos;
	}


	public void setRecursos(List<Recursos> recursos) {
		this.recursos = recursos;
	}


	public List<Consumos> getConsumos() {
		return consumos;
	}


	public void setConsumos(List<Consumos> consumos) {
		this.consumos = consumos;
	}


	@Override
	public String toString() {
		return "ProjetosViewDTO [id=" + id + ", codigo=" + codigo + ", proposta=" + proposta + ", descricao="
				+ descricao + ", quantidadeHoras=" + quantidadeHoras + ", dataContratacao=" + dataContratacao
				+ ", observacao=" + observacao + ", ativo=" + ativo + ", gestor=" + gestor + ", projectManagers="
				+ projectManagers + ", faturamentos=" + faturamentos + ", recursos=" + recursos + ", consumos="
				+ consumos + "]";
	}
	

}
