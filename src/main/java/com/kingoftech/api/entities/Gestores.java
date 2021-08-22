package com.kingoftech.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.kingoftech.api.audity.Auditable;
import com.kingoftech.api.audity.FileEntityListener;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
@Entity
@Table(name = "app_gestores")
@ToString
@Getter
@Setter
@EntityListeners(FileEntityListener.class)
public class Gestores extends Auditable<String> implements Serializable {
	private static final long serialVersionUID = 4458992728060861875L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "Nome", nullable = true)
	private String nome;
	
	@Column(name = "Ativo", nullable = true)
	private boolean ativo;
	

	/*
	 * //@JsonManagedReference(value="gestor")
	 * 
	 * @OneToMany(mappedBy = "gestor",fetch = FetchType.LAZY) private List<Projetos>
	 * projeto;
	 */

}
