/**
 * 
 */
package com.kingoftech.api.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kingoftech.api.audity.File;
import com.kingoftech.api.audity.FileHistoryRepository;
import com.kingoftech.api.audity.FileRepository;
import com.kingoftech.api.dto.GestoresCreateDTO;
import com.kingoftech.api.dto.GestoresViewDTO;
import com.kingoftech.api.entities.Gestores;
import com.kingoftech.api.mapper.GestoresMapper;
import com.kingoftech.api.repositories.GestorRepository;

/**
 * @author Kaio
 *
 */

@RestController
@RequestMapping("/api/gestor")
public class GestorController {

	private static final Logger LOG = LoggerFactory.getLogger(GestorController.class);
	
	@Autowired
	private final GestorRepository gestorRepository;

	@Autowired
	private final FileRepository fileRepository;
	
	@Autowired
	private final FileHistoryRepository fileHistoryRepository;
	
	
	
	
	
	GestorController(GestorRepository gestorRepository,FileRepository fileRepository, FileHistoryRepository fileHistoryRepository ) {
		this.gestorRepository = gestorRepository;
		this.fileRepository = fileRepository;
		this.fileHistoryRepository = fileHistoryRepository;
		
		
	}

	@GetMapping
	public @ResponseBody List<GestoresViewDTO> getAllGestores() {

		List<GestoresViewDTO> gestorDto = GestoresMapper.INSTANCE.gestoresListToGestoresViewListDto(gestorRepository.findAll());
		
		return gestorDto;
	}

	@PostMapping
	public Gestores novoGestor(@RequestBody GestoresCreateDTO gestorDto) {

		Gestores gestor = GestoresMapper.INSTANCE.gestoresDtoToGestores(gestorDto);

		//auditing...
		/*File file = new File("Gestor Notes", gestor.toString());
        file.setName("Gestor Notes");
        fileRepository.saveAndFlush(file);*/
        
		return gestorRepository.saveAndFlush(gestor);

	}

	@GetMapping("id/{id}")
	public Optional<Gestores> gestorById(@PathVariable Long id) {

		//auditing...
		
		/*File file = new File("Gestor Notes", id.toString());
        file.setName("Gestor Notes");
        
        fileRepository.saveAndFlush(file);*/
        
		return gestorRepository.findById(id);

	}

	@PutMapping("{id}")
	public Gestores atualizaGestor(@RequestBody Gestores gestor, @PathVariable Long id) {

		return gestorRepository.findById(id).map(gestores -> {
			gestor.setNome(gestor.getNome());
			return gestorRepository.save(gestores);
		}).orElseGet(() -> {
			gestor.setId(id);
			return gestorRepository.save(gestor);
		});
	}

	@DeleteMapping("{id}")
	void deleteGestor(@PathVariable Long id) {
		
		//File file = new File("Gestor Notes", id.toString());
        //file.setName("Gestor Notes");
        
		/*LOG.info("Apagando FileHistory...");
        fileHistoryRepository.deleteById(32);*/
        
		gestorRepository.deleteById(id);
		
		

	}
}