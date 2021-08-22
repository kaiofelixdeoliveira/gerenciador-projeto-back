package com.kingoftech.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.kingoftech.api.dto.GestoresCreateDTO;
import com.kingoftech.api.dto.ProjetosCreateDTO;
import com.kingoftech.api.dto.RecursoCreateDTO;
import com.kingoftech.api.dto.RecursoUpdateDTO;
import com.kingoftech.api.dto.RecursoViewDTO;
import com.kingoftech.api.dto.UsuarioViewDTO;
import com.kingoftech.api.entities.Gestores;
import com.kingoftech.api.entities.Projetos;
import com.kingoftech.api.entities.Recursos;
import com.kingoftech.api.entities.Usuarios;

@Mapper
public interface RecursosMapper {

	RecursosMapper INSTANCE = Mappers.getMapper(RecursosMapper.class);

	// create
	RecursoCreateDTO recursosToRecursosDto(Recursos entity);
	Recursos recursosDtoToRecursos(RecursoCreateDTO dto);

	// view
	RecursoViewDTO recursosToRecursosViewDto(Recursos entity);
	Recursos recursosViewDtoToRecursos(RecursoViewDTO dto);

	// viewList
	List<RecursoViewDTO> recursoListToRecursosViewListDto(List<Recursos> entity);
	List<Recursos> recursosViewListDtoToRecursosList(List<RecursoViewDTO> dto);

	// update
	RecursoUpdateDTO recursosToRecursosUpdateDto(Recursos entity);
	Recursos recursosUpdateDtoToRecursos(RecursoUpdateDTO dto);
}
