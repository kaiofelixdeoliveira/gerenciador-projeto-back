/**
 * 
 */
package com.kingoftech.api.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kingoftech.api.dto.RecursoCreateDTO;
import com.kingoftech.api.entities.Recursos;
import com.kingoftech.api.mapper.RecursosMapper;
import com.kingoftech.api.repositories.RecursoRepository;

/**
 * @author Kaio
 *
 */

@RestController
@RequestMapping("/api/recurso")
public class RecursoController {

	@Autowired
	private final RecursoRepository recursoRepository;

	RecursoController(RecursoRepository recursoRepository) {
		this.recursoRepository = recursoRepository;
	}

	@GetMapping
	public @ResponseBody List<Recursos> getAllRecursos() {
		// This returns a JSON or XML with the users
		return recursoRepository.findAll();
	}

	@PostMapping
	public Recursos novoRecurso(@Valid @RequestBody RecursoCreateDTO recursoDto) {

		Recursos recurso = RecursosMapper.INSTANCE.recursosDtoToRecursos(recursoDto);

		return recursoRepository.save(recurso);

	}

	@GetMapping("id/{id}")
	public Optional<Recursos> recursoById(@PathVariable Long id) {

		return recursoRepository.findById(id);
		// .orElseThrow(() -> new ProjetoNotFoundException(id));
	}

	@PutMapping("{id}")
	public Recursos atualizaRecurso(@RequestBody Recursos recurso, @PathVariable Long id) {

		return recursoRepository.findById(id).map(recursos -> {
			recurso.setNome(recurso.getNome());
			return recursoRepository.save(recursos);
		}).orElseGet(() -> {
			recurso.setId(id);
			return recursoRepository.save(recurso);
		});
	}

	@DeleteMapping("{id}")
	void deleteRecurso(@PathVariable Long id) {
		recursoRepository.deleteById(id);

	}
}