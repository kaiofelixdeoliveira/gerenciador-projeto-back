package com.kingoftech.api.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kingoftech.api.dto.UsuarioCreateDTO;
import com.kingoftech.api.dto.UsuarioUpdateDTO;
import com.kingoftech.api.dto.UsuarioViewDTO;
import com.kingoftech.api.entities.Usuarios;
import com.kingoftech.api.mapper.UsuariosMapper;
import com.kingoftech.api.repositories.SimiosRepository;
import com.kingoftech.api.services.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	UsuarioController(SimiosRepository projetoRepository, UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@GetMapping
	public @ResponseBody List<UsuarioViewDTO> getAllUsers() {

		List<Usuarios> listUsuarios = usuarioService.AllUsers();

		List<UsuarioViewDTO> usuarioListaDto = UsuariosMapper.INSTANCE.usuarioListToUsuariosViewListDto(listUsuarios);

		return usuarioListaDto;

	}

	@GetMapping("{id}")
	public @ResponseBody UsuarioViewDTO listToId(@PathVariable("id") Long id) {

		Optional<Usuarios> usuario = usuarioService.buscarPorId(id);

		UsuarioViewDTO usuariodto = UsuariosMapper.INSTANCE.usuarioToUsuariosViewDto(usuario.get());

		return usuariodto;

	}

	@PostMapping
	public ResponseEntity<String> novoUsuario(@Valid @RequestBody UsuarioCreateDTO usuariosDto) {

		Usuarios usuario = UsuariosMapper.INSTANCE.usuariosDtoToUsuarios(usuariosDto);

		usuarioService.createUser(usuario);

		return new ResponseEntity<>(HttpStatus.OK);

	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteUsuario(@PathVariable("id") Long id) {

		usuarioService.deleteUser(id);

		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("{id}")
	public void edit(@PathVariable("id") Long id, @Valid @RequestBody UsuarioUpdateDTO editUsuario) {

		Usuarios usuario = UsuariosMapper.INSTANCE.usuariosUpdateDtoToUsuarios(editUsuario);

		usuarioService.editUser(id, usuario);

	}

	/*
	 * @GetMapping(value = "/{nome}")
	 * 
	 * @PreAuthorize("hasAnyRole('ADMIN')") public String
	 * exemplo(@PathVariable("nome") String nome) { return "Olá " + nome; }
	 */
}
