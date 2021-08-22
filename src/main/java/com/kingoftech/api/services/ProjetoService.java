package com.kingoftech.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.kingoftech.api.entities.Projetos;
import com.kingoftech.api.entities.Usuarios;

public interface ProjetoService {
	
	
	public Page<Projetos> findPage(Integer page, Integer linesPage, String orderBy, String direction);
	
	Optional<Projetos> projetoById(Long id);
	
	List<Projetos> AllProjetos();

	void createProjeto(Projetos projeto);

	Projetos updateProjeto(Long id, Projetos projeto);

	void deleteProjeto(Long id);

}
