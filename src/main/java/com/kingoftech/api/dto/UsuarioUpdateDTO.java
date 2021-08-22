package com.kingoftech.api.dto;

import javax.validation.constraints.NotNull;

import com.kingoftech.api.enums.PerfilEnum;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter @Setter
public class UsuarioUpdateDTO {

	private String nome;
	private String email;
	private String senha;
	private PerfilEnum perfil;
	
	
}
