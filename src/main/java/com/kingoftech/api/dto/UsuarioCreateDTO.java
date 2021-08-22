package com.kingoftech.api.dto;

import javax.validation.constraints.NotNull;

import com.kingoftech.api.enums.PerfilEnum;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class UsuarioCreateDTO {

	@NotNull(message = "nome não pode ser nulo")
	public String nome;
	@NotNull(message = "email não pode ser nulo")
	public String email;
	@NotNull(message = "senha não pode ser nulo")
	public String senha;
	@NotNull(message = "perfil não pode ser nulo")
	public PerfilEnum perfil;

}
