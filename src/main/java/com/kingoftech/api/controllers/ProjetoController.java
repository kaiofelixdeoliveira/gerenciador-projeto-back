/**
 * 
 */
package com.kingoftech.api.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kingoftech.api.dto.ProjetosCreateDTO;
import com.kingoftech.api.dto.ProjetosUpdateDTO;
import com.kingoftech.api.dto.ProjetosViewDTO;
import com.kingoftech.api.entities.Projetos;
import com.kingoftech.api.mapper.ProjetoMapper;
import com.kingoftech.api.repositories.SimiosRepository;
import com.kingoftech.api.services.ProjetoService;

/**
 * @author Kaio
 *
 */

@RestController
@RequestMapping("/api/projeto")
public class ProjetoController {

	@Autowired
	private final SimiosRepository projetoRepository;

	@Autowired
	private ProjetoService projetoService;

	ProjetoController(SimiosRepository projetoRepository, ProjetoService projetoService) {
		this.projetoRepository = projetoRepository;
		this.projetoService = projetoService;
	}

	@GetMapping
	public @ResponseBody List<ProjetosViewDTO> getAllProjetos() {

		List<ProjetosViewDTO> projetos = ProjetoMapper.INSTANCE
				.projetosListToProjetosViewListDto(projetoRepository.findAll());
		return projetos;

	}

	@PostMapping
	public Projetos newProjeto(@Valid @RequestBody ProjetosCreateDTO projetoDto) {

		Projetos projeto = ProjetoMapper.INSTANCE.projetosDtoToProjetos(projetoDto);

		return projetoRepository.save(projeto);

	}

	@GetMapping("id/{id}")
	public @ResponseBody ResponseEntity<Optional<Projetos>> projetoById(@PathVariable Long id) {


		Optional<Projetos> projetoFound = projetoService.projetoById(id);

		return ResponseEntity.ok().body(projetoFound);
	}

	@PutMapping("{id}")
	public @ResponseBody ResponseEntity<Projetos> atualizaProjeto(@RequestBody ProjetosUpdateDTO projetoDto, @PathVariable Long id) {

		Projetos projeto = ProjetoMapper.INSTANCE.projetosUpdateDtoToProjetos(projetoDto);

		Projetos projetoUpdated = projetoService.updateProjeto(id, projeto);

		return ResponseEntity.ok().body(projetoUpdated);
	
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteProjeto(@PathVariable Long id) {
		
		projetoService.deleteProjeto(id);
	
		return new ResponseEntity<>(HttpStatus.OK);

	}

	// faz paginação
	@GetMapping(value = "/page")
	public ResponseEntity<Page<ProjetosViewDTO>> findPage(
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPage", defaultValue = "24") Integer linesPage,
			@RequestParam(value = "orderBy", defaultValue = "dataContratacao") String orderBy,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction) {

		Page<Projetos> listProjetos = projetoService.findPage(page, linesPage, orderBy, direction);

		Page<ProjetosViewDTO> projeto = listProjetos.map(obj -> new ProjetosViewDTO(obj));
		return ResponseEntity.ok().body(projeto);

	}

}