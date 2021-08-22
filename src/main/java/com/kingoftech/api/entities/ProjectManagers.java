package com.kingoftech.api.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.kingoftech.api.audity.Auditable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "app_projectManagers")
@ToString
@Getter
@Setter
public class ProjectManagers extends Auditable<String> implements Serializable {


	private static final long serialVersionUID = 5119012461132625722L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "Nome", nullable = true)
	private String nome;
	@Column(name = "Ativo", nullable = true)
	private boolean ativo;

	/*
	 * //@JsonBackReference(value="projectManagers")
	 * 
	 * @OneToMany(mappedBy = "projectManagers",fetch = FetchType.LAZY) private
	 * List<Projetos> projeto;
	 */

	

}
