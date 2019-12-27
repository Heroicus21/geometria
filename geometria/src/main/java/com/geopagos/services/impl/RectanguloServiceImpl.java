/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.services.impl;

import com.geopagos.dto.CirculoDTO;
import com.geopagos.dto.RectanguloDTO;
import com.geopagos.mapper.CirculoMapper;
import com.geopagos.mapper.RectanguloMapper;
import com.geopagos.model.Circulo;
import com.geopagos.model.Rectangulo;
import com.geopagos.repository.CirculoRepository;
import com.geopagos.repository.RectanguloRepository;
import com.geopagos.service.CirculoService;
import com.geopagos.service.RectanguloService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LucasRoman
 */
@Service
public class RectanguloServiceImpl implements RectanguloService{

    @Autowired
    public RectanguloMapper rectanguloMapper;
    
    @Autowired
    public RectanguloRepository rectanguloRepository;

    @Override
    public Collection<RectanguloDTO> list() throws Exception {
        
        Collection<Rectangulo> circuloList=rectanguloRepository.findAll();        
        return rectanguloMapper.toDTOS(circuloList);
        
    }

    @Override
    public RectanguloDTO addRectangulo(RectanguloDTO source) throws Exception {
        try{
            Rectangulo circuloAdd= rectanguloMapper.toEntity(source);            
            Rectangulo result=rectanguloRepository.save(circuloAdd);
            return rectanguloMapper.toDTO(result);
        }catch(Exception ex){
            ex.printStackTrace();
        }        
        throw new Exception("No se realizo la accion");
        
        
    }

    @Override
    public RectanguloDTO editRectangulo(RectanguloDTO source) throws Exception {
        
        try{            
            Rectangulo rectanguloFinded=rectanguloRepository.findOne(source.getId());            
            rectanguloFinded.setAltura(source.getAltura());
            rectanguloFinded.setBase(source.getBase());
            rectanguloFinded.area();                  

            Rectangulo result=rectanguloRepository.save(rectanguloFinded);
            return rectanguloMapper.toDTO(result);
        }catch(Exception ex){
            ex.printStackTrace();
        }        
        throw new Exception("No se realizo la accion");
        
    }

    @Override
    public void eliminarRectangulo(RectanguloDTO source) throws Exception {
        Rectangulo rectanguloFinded=rectanguloRepository.findOne(source.getId());
        rectanguloRepository.delete(rectanguloFinded);

    }
    
}
