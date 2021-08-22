package com.kingoftech.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.kingoftech.api.audity.Auditable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "app_consumos")
@ToString
@Getter @Setter
public class Consumos extends Auditable<String> implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 2581785191111289883L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "HorasConsultoria", nullable = false)
	private int horasConsultoria;
	
	@Column(name = "HorasAnalise", nullable = false)
	private int horasAnalise;
	
	@Column(name = "HorasDesenvolvimento", nullable = false)
	private int horasDesenvolvimento;
	
	@Column(name = "Descricao", nullable = true)
	private String descricao;
	
	@Column(name = "TotalHoras", nullable = false)
	private int totalHoras;

	@JsonBackReference(value="consumos")
	@ManyToOne
	//@JsonIgnore
	@JoinColumn(name = "ProjetoId")
	private Projetos projeto;


	
}
