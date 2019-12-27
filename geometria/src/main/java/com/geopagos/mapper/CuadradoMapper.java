/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.mapper;

import com.geopagos.dto.CirculoDTO;
import com.geopagos.dto.CuadradoDTO;
import com.geopagos.model.Circulo;
import com.geopagos.model.Cuadrado;
import java.util.Collection;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.Mapping;

/**
 *
 * @author LucasRoman
 */

@Mapper
public interface  CuadradoMapper {
    CuadradoMapper INSTANCE = Mappers.getMapper(CuadradoMapper.class );
    
    Cuadrado toEntity(CuadradoDTO source);    
    Collection<Cuadrado> toEntityes(Collection<CuadradoDTO> source);    
    CuadradoDTO toDTO(Cuadrado source);    
    Collection<CuadradoDTO> toDTOS(Collection<Cuadrado> source);

}
