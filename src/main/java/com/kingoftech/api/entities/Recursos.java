package com.kingoftech.api.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.kingoftech.api.audity.Auditable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@Entity
@Table(name = "app_recursos")
@ToString
@Getter
@Setter
public class Recursos extends Auditable<String>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	@Column(name = "Nome", nullable = true)
	private String nome;
	
	@Column(name = "Ativo", nullable = true)
	private boolean ativo;

	// @JsonIgnore
	// @JsonBackReference(value="recursos")
	@ManyToMany(mappedBy = "recursos", fetch = FetchType.LAZY)
	private List<Projetos> projeto;

}
