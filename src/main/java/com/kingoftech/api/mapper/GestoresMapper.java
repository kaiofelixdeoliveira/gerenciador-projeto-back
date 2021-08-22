package com.kingoftech.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.kingoftech.api.dto.GestoresCreateDTO;
import com.kingoftech.api.dto.GestoresUpdateDTO;
import com.kingoftech.api.dto.GestoresViewDTO;
import com.kingoftech.api.entities.Gestores;

@Mapper
public interface GestoresMapper {

	GestoresMapper INSTANCE = Mappers.getMapper(GestoresMapper.class);

	//create
	GestoresCreateDTO gestoresToGestoresDto(Gestores entity);
	Gestores gestoresDtoToGestores(GestoresCreateDTO dto);
	
	//view
	GestoresViewDTO gestoresToGestoresViewDto(Gestores dto);
	Gestores gestoresViewDtoToGestores(GestoresViewDTO dto);
	
	//viewList
	List<GestoresViewDTO> gestoresListToGestoresViewListDto(List<Gestores> entity);
	List<Gestores> gestoresViewListDtoToGestores(List<GestoresViewDTO> entity);
	
	//update
	GestoresUpdateDTO gestoresToGestoresUpdateDto(Gestores entity);
	Gestores gestoresUpdateDtoToGestores(GestoresUpdateDTO dto);
}
