package com.kingoftech.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.kingoftech.api.dto.GestoresCreateDTO;
import com.kingoftech.api.dto.ProjectManagerCreateDTO;
import com.kingoftech.api.dto.ProjectManagerUpdateDTO;
import com.kingoftech.api.dto.ProjectManagerViewDTO;
import com.kingoftech.api.dto.ProjetosCreateDTO;
import com.kingoftech.api.entities.Gestores;
import com.kingoftech.api.entities.ProjectManagers;
import com.kingoftech.api.entities.Projetos;

@Mapper
public interface ProjectManagersMapper {

	ProjectManagersMapper INSTANCE = Mappers.getMapper(ProjectManagersMapper.class);

	// create
	ProjectManagerCreateDTO projectManagersToprojectManagersDto(ProjectManagers entity);
	ProjectManagers projectManagersDtoToprojectManagers(ProjectManagerCreateDTO dto);

	// view
	ProjectManagerViewDTO projectManagersToprojectManagersViewDto(ProjectManagers entity);
	ProjectManagers projectManagersViewDtoToprojectManagers(ProjectManagerViewDTO dto);

	// update
	ProjectManagerUpdateDTO projectManagersToprojectManagersUpdateDto(ProjectManagers entity);
	ProjectManagers projectManagersUpdateDtoToprojectManagers(ProjectManagerUpdateDTO dto);
}
