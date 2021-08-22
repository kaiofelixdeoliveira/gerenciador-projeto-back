package com.kingoftech.api.services;

import java.util.List;
import java.util.Optional;

import com.kingoftech.api.entities.Usuarios;

public interface UsuarioService {

	Optional<Usuarios> buscarPorEmail(String email);

	Optional<Usuarios> buscarPorNome(String nome);

	Optional<Usuarios> buscarPorId(Long id);
	
	List<Usuarios> AllUsers();

	void createUser(Usuarios usuario);

	void editUser(Long id, Usuarios editUsuario);

	void deleteUser(Long id);

}
