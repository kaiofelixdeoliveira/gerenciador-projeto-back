package com.kingoftech.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.kingoftech.api.dto.UsuarioCreateDTO;
import com.kingoftech.api.dto.UsuarioUpdateDTO;
import com.kingoftech.api.dto.UsuarioViewDTO;
import com.kingoftech.api.entities.Usuarios;

@Mapper
public interface UsuariosMapper {

	UsuariosMapper INSTANCE = Mappers.getMapper(UsuariosMapper.class);

	// create
	UsuarioCreateDTO usuarioToUsuariosDto(Usuarios entity);
	Usuarios usuariosDtoToUsuarios(UsuarioCreateDTO dto);

	// view
	UsuarioViewDTO usuarioToUsuariosViewDto(Usuarios entity);
	Usuarios usuariosViewDtoToUsuarios(UsuarioViewDTO dto);

	// viewList
	List<UsuarioViewDTO> usuarioListToUsuariosViewListDto(List<Usuarios> entity);
	List<Usuarios> usuariosViewListDtoToUsuariosList(List<UsuarioViewDTO> dto);

	// update
	UsuarioUpdateDTO usuariosToUsuariosUpdateDto(Usuarios entity);
	Usuarios usuariosUpdateDtoToUsuarios(UsuarioUpdateDTO dto);
}
