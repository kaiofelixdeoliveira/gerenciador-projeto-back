package com.kingoftech.api.dto;

import java.util.Date;
import java.util.List;

import com.kingoftech.api.audity.Auditable;
import com.kingoftech.api.entities.Projetos;
import com.kingoftech.api.enums.PerfilEnum;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter @Setter
public class UsuarioViewDTO {
	
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private PerfilEnum perfil;
	private List<Projetos> projeto;

	
}
