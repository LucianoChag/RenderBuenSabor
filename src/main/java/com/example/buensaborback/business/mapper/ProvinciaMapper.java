package com.example.buensaborback.business.mapper;

import com.example.buensaborback.domain.dtos.ProvinciaDto;
import com.example.buensaborback.domain.entities.Provincia;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProvinciaMapper extends BaseMapper<Provincia, ProvinciaDto>{

}
