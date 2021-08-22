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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kingoftech.api.dto.ConsumosCreateDTO;
import com.kingoftech.api.dto.FaturamentosCreateDTO;
import com.kingoftech.api.entities.Consumos;
import com.kingoftech.api.entities.Faturamentos;
import com.kingoftech.api.mapper.ConsumosMapper;
import com.kingoftech.api.mapper.FaturamentosMapper;
import com.kingoftech.api.repositories.ConsumoRepository;

/**
 * @author Kaio
 *
 */

@RestController
@RequestMapping("/api/consumo")
public class ConsumoController {

	@Autowired
	private final ConsumoRepository consumoRepository;

	ConsumoController(ConsumoRepository consumoRepository) {
		this.consumoRepository = consumoRepository;
	}

	@GetMapping
	public @ResponseBody List<Consumos> getAllConsumos() {

		return consumoRepository.findAll();
	}

	@PostMapping
	public Consumos novoConsumo(@RequestBody ConsumosCreateDTO consumoDto) {

		Consumos consumos = ConsumosMapper.INSTANCE.consumosDtoToConsumos(consumoDto);

		return consumoRepository.save(consumos);

	}

	@GetMapping("id/{id}")
	public Optional<Consumos> consumoById(@PathVariable Long id) {

		return consumoRepository.findById(id);

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
	void deleteConsumo(@PathVariable Long id) {
		consumoRepository.deleteById(id);

	}
}