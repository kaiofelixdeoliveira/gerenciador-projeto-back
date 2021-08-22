package com.kingoftech.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.kingoftech.api.dto.ConsumosCreateDTO;
import com.kingoftech.api.dto.ConsumosUpdateDTO;
import com.kingoftech.api.dto.ConsumosViewDTO;
import com.kingoftech.api.entities.Consumos;

@Mapper
public interface ConsumosMapper {

	ConsumosMapper INSTANCE = Mappers.getMapper(ConsumosMapper.class);

	//create
	ConsumosCreateDTO consumosToConsumosDto(Consumos entity);
	Consumos consumosDtoToConsumos(ConsumosCreateDTO dto);
	//view
	List<ConsumosViewDTO> consumosToConsumosViewDto(List<Consumos> entity);
	Consumos consumosViewDtoToConsumos(ConsumosViewDTO dto);
	//update
	//ConsumosUpdateDTO consumosToConsumosUpdateDto(Consumos entity);
	//Consumos consumosUpdateDtoToConsumos(ConsumosUpdateDTO dto);
}
