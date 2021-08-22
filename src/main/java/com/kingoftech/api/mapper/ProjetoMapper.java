package com.kingoftech.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;

import com.kingoftech.api.dto.ProjetosCreateDTO;
import com.kingoftech.api.dto.ProjetosUpdateDTO;
import com.kingoftech.api.dto.ProjetosViewDTO;
import com.kingoftech.api.entities.Projetos;

@Mapper
public interface ProjetoMapper {

	ProjetoMapper INSTANCE = Mappers.getMapper(ProjetoMapper.class);

	// create
	ProjetosCreateDTO projetosToProjetosDto(Projetos entity);
	Projetos projetosDtoToProjetos(ProjetosCreateDTO dto);

	// view
	
	Projetos projetosViewDtoToProjetos(ProjetosViewDTO dto);
	ProjetosViewDTO projetosToProjetosViewDto(Projetos entity);


	// list
	List<ProjetosViewDTO> projetosListToProjetosViewListDto(List<Projetos> entity);
	List<Projetos> ProjetosViewListDtoToprojetosList(List<ProjetosViewDTO> entity);
	
	// update
	ProjetosUpdateDTO projetosToProjetosUpdateDto(Projetos entity);
	Projetos projetosUpdateDtoToProjetos(ProjetosUpdateDTO dto);
}
