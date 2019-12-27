/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.services.impl;

import com.geopagos.dto.CirculoDTO;
import com.geopagos.mapper.CirculoMapper;
import com.geopagos.model.Circulo;
import com.geopagos.repository.CirculoRepository;
import com.geopagos.service.CirculoService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LucasRoman
 */
@Service
public class CirculoServiceImpl implements CirculoService{

    @Autowired
    public CirculoMapper circuloMapper;
    
    @Autowired
    public CirculoRepository circuloRepository;
    
    @Override
    public CirculoDTO addCirculo(CirculoDTO source) throws Exception {
                
        try{
            Circulo circuloAdd= circuloMapper.toEntity(source);            
            Circulo result=circuloRepository.save(circuloAdd);
            return circuloMapper.toDTO(result);
        }catch(Exception ex){
            ex.printStackTrace();
        }        
        throw new Exception("No se realizo la accion");
    }

    @Override
    public CirculoDTO editCirculo(CirculoDTO source) throws Exception {
        
        try{
            
            Circulo circuloFinded=circuloRepository.findOne(source.getId());
            
            circuloFinded.setRadio(source.getRadio());
            circuloFinded.area();

            Circulo result=circuloRepository.save(circuloFinded);
            return circuloMapper.toDTO(result);
        }catch(Exception ex){
            ex.printStackTrace();
        }        
        throw new Exception("No se realizo la accion");
    }

    @Override
    public Collection<CirculoDTO> list() throws Exception {
        
        Collection<Circulo> circuloList=circuloRepository.findAll();        
        return circuloMapper.toDTOS(circuloList);
        
    }

    @Override
    public void eliminarCirculo(CirculoDTO source) throws Exception {
        
        Circulo circuloFinded=circuloRepository.findOne(source.getId());
        circuloRepository.delete(circuloFinded);
                
    }
    
}
