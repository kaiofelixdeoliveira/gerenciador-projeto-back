package com.kingoftech.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.kingoftech.api.dto.FaturamentosCreateDTO;
import com.kingoftech.api.dto.GestoresCreateDTO;
import com.kingoftech.api.dto.LancamentosFaturamentoCreateDTO;
import com.kingoftech.api.dto.LancamentosFaturamentoUpdateDTO;
import com.kingoftech.api.dto.LancamentosFaturamentoViewDTO;
import com.kingoftech.api.entities.Faturamentos;
import com.kingoftech.api.entities.Gestores;
import com.kingoftech.api.entities.LancamentosFaturamento;

@Mapper
public interface LancamentosFaturamentoMapper {

	LancamentosFaturamentoMapper INSTANCE = Mappers.getMapper(LancamentosFaturamentoMapper.class);

	//create
	LancamentosFaturamentoCreateDTO lancamentosFaturamentoToLancamentosFaturamentoDto(LancamentosFaturamento entity);
	LancamentosFaturamento lancamentosFaturamentoDtoToLancamentosFaturamento(LancamentosFaturamentoCreateDTO dto);
	//view
	LancamentosFaturamentoViewDTO lancamentosFaturamentoToLancamentosFaturamentoViewDto(LancamentosFaturamento entity);
	LancamentosFaturamento lancamentosFaturamentoViewDtoToLancamentosFaturamento(LancamentosFaturamentoViewDTO dto);
	//viewList
	List<LancamentosFaturamentoViewDTO> lancamentosFaturamentoListToLancamentosFaturamentoViewListDto(List<LancamentosFaturamento> entity);
	List<LancamentosFaturamento> lancamentosFaturamentoViewListDtoToLancamentosFaturamentoList(List<LancamentosFaturamentoViewDTO> dto);
	//update
	LancamentosFaturamentoUpdateDTO lancamentosFaturamentoToLancamentosFaturamentoUpdateDto(LancamentosFaturamento entity);
	LancamentosFaturamento lancamentosFaturamentoUpdateDtoToLancamentosFaturamento(LancamentosFaturamentoUpdateDTO dto);
}
