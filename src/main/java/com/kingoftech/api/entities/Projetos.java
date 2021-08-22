package com.kingoftech.api.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.kingoftech.api.audity.Auditable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "app_projetos")
@ToString
@Getter
@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Projetos extends Auditable<String> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "Codigo", nullable = true)
	private String codigo;
	
	@Column(name = "Proposta", nullable = true)
	private String proposta;
	
	@Column(name = "Descricao", nullable = true)
	private String descricao;
	
	@Column(name = "QuantidadeHoras", nullable = true)
	private int quantidadeHoras;
	
	@Column(name = "DataContratacao", nullable = true)
	private Calendar dataContratacao;
	
	@Column(name = "Obeservacao", nullable = true)
	private String observacao;
	
	@Column(name = "Ativo", nullable = true)
	private boolean ativo;

	// @JsonBackReference(value="gestor")
	@ManyToOne
	@JoinColumn(name = "GestorId")
	private Gestores gestor;

	// @JsonManagedReference(value="projectManagers")
	@ManyToOne
	@JoinColumn(name = "projectManagersId")
	// @JsonIgnore
	private ProjectManagers projectManagers;

	// @JsonManagedReference(value="faturamentos")
	
	@OneToMany(mappedBy = "projeto")
	// @JsonIgnore
	
	private List<Faturamentos> faturamentos;

	// @JsonManagedReference(value="consumos")
	// @JsonIgnore
	@OneToMany(mappedBy = "projeto")
	private List<Consumos> consumos;

	// @JsonIgnore
	// @JsonManagedReference(value="recursos")
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "app_ProjetoRecurso", joinColumns = {
			@JoinColumn(name = "ProjetoId", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "RecursoId", referencedColumnName = "id") })
	private List<Recursos> recursos;

}
