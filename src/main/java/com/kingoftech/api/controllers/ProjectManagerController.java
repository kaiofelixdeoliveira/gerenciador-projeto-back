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

import com.kingoftech.api.dto.ProjectManagerCreateDTO;
import com.kingoftech.api.entities.ProjectManagers;
import com.kingoftech.api.mapper.ProjectManagersMapper;
import com.kingoftech.api.repositories.ProjectManagerRepository;

/**
 * @author Kaio
 *
 */

@RestController
@RequestMapping("/api/projectmanager")
public class ProjectManagerController {

	@Autowired
	private final ProjectManagerRepository projectManagerRepository;

	ProjectManagerController(ProjectManagerRepository projectManagerRepository) {
		this.projectManagerRepository = projectManagerRepository;
	}

	@GetMapping
	public @ResponseBody List<ProjectManagers> getAllProjectManager() {

		return projectManagerRepository.findAll();
	}

	@PostMapping
	public ProjectManagers novoProjectManager(@RequestBody ProjectManagerCreateDTO projectManagerDto) {

		ProjectManagers projectManager = ProjectManagersMapper.INSTANCE
				.projectManagersDtoToprojectManagers(projectManagerDto);

		return projectManagerRepository.save(projectManager);

	}

	@GetMapping("id/{id}")
	public Optional<ProjectManagers> projectManagerById(@PathVariable Long id) {

		return projectManagerRepository.findById(id);

	}

	@PutMapping("{id}")
	public ProjectManagers atualizaProjectManager(@RequestBody ProjectManagers projectManager, @PathVariable Long id) {

		return projectManagerRepository.findById(id).map(projectManagers -> {
			projectManager.setNome(projectManager.getNome());
			return projectManagerRepository.save(projectManagers);
		}).orElseGet(() -> {
			projectManager.setId(id);
			return projectManagerRepository.save(projectManager);
		});
	}

	@DeleteMapping("{id}")
	void deleteProjectManager(@PathVariable Long id) {
		projectManagerRepository.deleteById(id);

	}
}