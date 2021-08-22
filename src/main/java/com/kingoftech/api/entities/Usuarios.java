package com.kingoftech.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.kingoftech.api.audity.Auditable;
import com.kingoftech.api.audity.FileEntityListener;
import com.kingoftech.api.enums.PerfilEnum;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "app_usuario")
@ToString
@Getter
@Setter
@EntityListeners(FileEntityListener.class)
public class Usuarios extends Auditable<String> implements Serializable {

	private static final long serialVersionUID = 306411570471828345L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "senha", nullable = false)
	private String senha;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "perfil", nullable = false)
	private PerfilEnum perfil;


}
