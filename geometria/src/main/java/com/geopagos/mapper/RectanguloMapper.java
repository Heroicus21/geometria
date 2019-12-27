/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.mapper;

import com.geopagos.dto.CirculoDTO;
import com.geopagos.dto.RectanguloDTO;
import com.geopagos.model.Circulo;
import com.geopagos.model.Rectangulo;
import java.util.Collection;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.Mapping;

/**
 *
 * @author LucasRoman
 */

@Mapper
public interface  RectanguloMapper {
    RectanguloMapper INSTANCE = Mappers.getMapper(RectanguloMapper.class );
    
    Rectangulo toEntity(RectanguloDTO source);    
    Collection<Rectangulo> toEntityes(Collection<RectanguloDTO> source);    
    RectanguloDTO toDTO(Rectangulo source);    
    Collection<RectanguloDTO> toDTOS(Collection<Rectangulo> source);

}
