/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.mapper;

import com.geopagos.dto.CirculoDTO;
import com.geopagos.model.Circulo;
import java.util.Collection;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.Mapping;

/**
 *
 * @author LucasRoman
 */

@Mapper
public interface  CirculoMapper {
    CirculoMapper INSTANCE = Mappers.getMapper( CirculoMapper.class );
    
    Circulo toEntity(CirculoDTO source);    
    Collection<Circulo> toEntityes(Collection<CirculoDTO> source);    
    CirculoDTO toDTO(Circulo source);    
    Collection<CirculoDTO> toDTOS(Collection<Circulo> source);

}
