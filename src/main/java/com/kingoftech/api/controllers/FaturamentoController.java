/**
 * 
 */
package com.kingoftech.api.controllers;

import java.util.List;
import java.util.Optional;

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

import com.kingoftech.api.dto.FaturamentosCreateDTO;
import com.kingoftech.api.dto.GestoresCreateDTO;
import com.kingoftech.api.entities.Faturamentos;
import com.kingoftech.api.entities.Gestores;
import com.kingoftech.api.mapper.FaturamentosMapper;
import com.kingoftech.api.mapper.GestoresMapper;
import com.kingoftech.api.repositories.FaturamentoRepository;
import com.kingoftech.api.repositories.GestorRepository;

/**
 * @author Kaio
 *
 */

@RestController
@RequestMapping("/api/faturamento")
public class FaturamentoController {

	@Autowired
	private final FaturamentoRepository faturamentoRepository;

	FaturamentoController(FaturamentoRepository faturamentoRepository) {
		this.faturamentoRepository = faturamentoRepository;
	}

	@GetMapping
	public @ResponseBody List<Faturamentos> getAllFaturamentos() {

		return faturamentoRepository.findAll();
	}

	@PostMapping
	public Faturamentos novoFaturamento(@RequestBody FaturamentosCreateDTO faturamentoDto) {

		Faturamentos faturamento = FaturamentosMapper.INSTANCE.faturamentosDtoToFaturamentos(faturamentoDto);

		return faturamentoRepository.save(faturamento);

	}

	@GetMapping("id/{id}")
	public Optional<Faturamentos> faturamentoById(@PathVariable Long id) {

		return faturamentoRepository.findById(id);

	}

	/*@PutMapping("{id}")
	public Gestores atualizaGestor(@RequestBody Gestores gestor, @PathVariable Long id) {

		return faturamentoRepository.findById(id).map(faturamentos -> {
			gestor.setNome(gestor.getNome());
			return gestorRepository.save(gestores);
		}).orElseGet(() -> {
			gestor.setId(id);
			return gestorRepository.save(gestor);
		});
	}*/

	@DeleteMapping("{id}")
	void deleteFaturamento(@PathVariable Long id) {
		faturamentoRepository.deleteById(id);

	}
}