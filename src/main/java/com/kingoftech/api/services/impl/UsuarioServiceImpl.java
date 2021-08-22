package com.kingoftech.api.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingoftech.api.entities.Usuarios;
import com.kingoftech.api.enums.PerfilEnum;
import com.kingoftech.api.exceptions.UsuarioException;
import com.kingoftech.api.repositories.UsuarioRepository;
import com.kingoftech.api.services.UsuarioService;
import com.kingoftech.api.util.SenhaUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Optional<Usuarios> buscarPorEmail(String email) {

		Optional<Usuarios> usuario = this.usuarioRepository.findByEmail(email);

		if (!usuario.isPresent()) {

			throw new UsuarioException("usuario não existe ");
		}

		return usuario;
	}

	@Override
	public Optional<Usuarios> buscarPorNome(String nome) {
		
		Optional<Usuarios> usuario = this.usuarioRepository.findByNome(nome);

		if (!usuario.isPresent()) {

			throw new UsuarioException("usuario não existe");
		}

		return usuario;
	}

	@Override
	public void createUser(Usuarios usuario) {

		if (!usuario.getPerfil().equals(PerfilEnum.ROLE_ADMIN)
				&& !usuario.getPerfil().equals(PerfilEnum.ROLE_USUARIO)) {

			throw new UsuarioException("Perfil de usuario não existe");
		}

		LOG.info("encriptando senha...");
		usuario.setSenha(SenhaUtils.gerarBCrypt(usuario.getSenha()));

		LOG.info("salvando usuario...");
		this.usuarioRepository.save(usuario);

	}

	@Override
	public Optional<Usuarios> buscarPorId(Long id) {

		Optional<Usuarios> usuario = this.usuarioRepository.findById(id);

		if (!usuario.isPresent()) {

			throw new UsuarioException("usuario não existe ");
		}

		return usuario;
	}

	@Override
	public void editUser(Long id, Usuarios editUsuario) {

		Optional<Usuarios> usuario = this.usuarioRepository.findById(id);

		if (!usuario.isPresent()) {

			throw new UsuarioException("usuario não presente ");
		}

		if (!editUsuario.getPerfil().equals(PerfilEnum.ROLE_ADMIN)
				&& !editUsuario.getPerfil().equals(PerfilEnum.ROLE_USUARIO)) {

			throw new UsuarioException("Perfil de usuario não existe");
		}
		usuario.get().setNome(editUsuario.getNome());
		usuario.get().setEmail(editUsuario.getEmail());
		usuario.get().setPerfil(editUsuario.getPerfil());
		usuario.get().setSenha(editUsuario.getSenha());

		LOG.info("atualizando usuario...");
		this.usuarioRepository.save(usuario.get());

	}

	@Override
	public void deleteUser(Long id) {

		Optional<Usuarios> usuario = this.usuarioRepository.findById(id);

		if (!usuario.isPresent()) {

			throw new UsuarioException("usuario não existe ");
		}

		this.usuarioRepository.delete(usuario.get());
	}

	@Override
	public List<Usuarios> AllUsers() {

		return this.usuarioRepository.findAll();

	}
}
