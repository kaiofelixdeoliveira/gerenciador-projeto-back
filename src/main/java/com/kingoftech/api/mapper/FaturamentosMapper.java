package com.kingoftech.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.kingoftech.api.dto.FaturamentosCreateDTO;
import com.kingoftech.api.dto.FaturamentosUpdateDTO;
import com.kingoftech.api.dto.FaturamentosViewDTO;
import com.kingoftech.api.dto.GestoresCreateDTO;
import com.kingoftech.api.entities.Faturamentos;
import com.kingoftech.api.entities.Gestores;

@Mapper
public interface FaturamentosMapper {

	FaturamentosMapper INSTANCE = Mappers.getMapper(FaturamentosMapper.class);

	//create
	FaturamentosCreateDTO faturamentosToFaturamentosDto(Faturamentos entity);
	Faturamentos faturamentosDtoToFaturamentos(FaturamentosCreateDTO dto);
	//view
	List<FaturamentosViewDTO> faturamentosToFaturamentosViewDto(List<Faturamentos> entity);
	Faturamentos faturamentosViewDtoToFaturamentos(FaturamentosViewDTO dto);
	//update
	//FaturamentosUpdateDTO faturamentosToFaturamentosUpdateDto(Faturamentos entity);
	//Faturamentos faturamentosUpdateDtoToFaturamentos(FaturamentosUpdateDTO dto);
}
