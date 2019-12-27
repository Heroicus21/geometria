/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.mapper;

import com.geopagos.dto.CirculoDTO;
import com.geopagos.dto.TrianguloDTO;
import com.geopagos.model.Circulo;
import com.geopagos.model.Triangulo;
import java.util.Collection;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.Mapping;

/**
 *
 * @author LucasRoman
 */

@Mapper
public interface  TrianguloMapper {
    TrianguloMapper INSTANCE = Mappers.getMapper(TrianguloMapper.class );
    
    Triangulo toEntity(TrianguloDTO source);    
    Collection<Triangulo> toEntityes(Collection<TrianguloDTO> source);    
    TrianguloDTO toDTO(Triangulo source);    
    Collection<TrianguloDTO> toDTOS(Collection<Triangulo> source);

}
