package com.kingoftech.api.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.kingoftech.api.audity.Auditable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "app_faturamentos")
@ToString
@Getter
@Setter
public class Faturamentos extends Auditable<String> implements Serializable {

	private static final long serialVersionUID = 4264293859180786460L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "QuantidadeParcelas", nullable = true)
	private int quantidadeParcelas;

	@JsonBackReference(value = "faturamentos")
	@ManyToOne
	// @JsonIgnore
	@JoinColumn(name = "ProjetoId", nullable = true)
	private Projetos projeto;

	// @JsonManagedReference(value="lancamentosFaturamento")
	@OneToMany(mappedBy = "faturamentos")
	private List<LancamentosFaturamento> lancamentosFaturamento;

}
