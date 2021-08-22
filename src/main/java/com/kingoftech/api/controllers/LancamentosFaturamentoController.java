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
import com.kingoftech.api.dto.LancamentosFaturamentoCreateDTO;
import com.kingoftech.api.entities.Faturamentos;
import com.kingoftech.api.entities.Gestores;
import com.kingoftech.api.entities.LancamentosFaturamento;
import com.kingoftech.api.mapper.FaturamentosMapper;
import com.kingoftech.api.mapper.GestoresMapper;
import com.kingoftech.api.mapper.LancamentosFaturamentoMapper;
import com.kingoftech.api.repositories.FaturamentoRepository;
import com.kingoftech.api.repositories.GestorRepository;
import com.kingoftech.api.repositories.LancamentosFaturamentoRepository;

/**
 * @author Kaio
 *
 */

@RestController
@RequestMapping("/api/lancamentosfaturamento")
public class LancamentosFaturamentoController {

	@Autowired
	private final LancamentosFaturamentoRepository lancamentosfaturamentoRepository;

	LancamentosFaturamentoController(LancamentosFaturamentoRepository lancamentosfaturamentoRepository) {
		this.lancamentosfaturamentoRepository = lancamentosfaturamentoRepository;
	}

	@GetMapping
	public @ResponseBody List<LancamentosFaturamento> getAllLancamentosFaturamento() {

		return lancamentosfaturamentoRepository.findAll();
	}

	@PostMapping
	public LancamentosFaturamento novoLancamentosFaturamento(@RequestBody LancamentosFaturamentoCreateDTO lancamentosFaturamentoDto) {

		LancamentosFaturamento lancamentosFaturamento = LancamentosFaturamentoMapper.INSTANCE.lancamentosFaturamentoDtoToLancamentosFaturamento(lancamentosFaturamentoDto);

		return lancamentosfaturamentoRepository.save(lancamentosFaturamento);

	}

	@GetMapping("id/{id}")
	public Optional<LancamentosFaturamento> lancamentosFaturamentoById(@PathVariable Long id) {

		return lancamentosfaturamentoRepository.findById(id);

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
	void deleteLancamentosFaturamento(@PathVariable Long id) {
		lancamentosfaturamentoRepository.deleteById(id);

	}
}