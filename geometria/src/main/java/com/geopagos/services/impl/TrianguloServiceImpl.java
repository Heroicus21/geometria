/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.services.impl;

import com.geopagos.dto.CirculoDTO;
import com.geopagos.dto.TrianguloDTO;
import com.geopagos.mapper.CirculoMapper;
import com.geopagos.mapper.TrianguloMapper;
import com.geopagos.model.Circulo;
import com.geopagos.model.Triangulo;
import com.geopagos.repository.CirculoRepository;
import com.geopagos.repository.TrianguloRepository;
import com.geopagos.service.CirculoService;
import com.geopagos.service.TrianguloService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LucasRoman
 */
@Service
public class TrianguloServiceImpl implements TrianguloService{

    @Autowired
    public TrianguloMapper circuloMapper;
    
    @Autowired
    public TrianguloRepository circuloRepository;
    
    @Override
    public Collection<TrianguloDTO> list() throws Exception {
        
        Collection<Triangulo> trianguloList=circuloRepository.findAll();        
        return circuloMapper.toDTOS(trianguloList);
        
    }

    @Override
    public TrianguloDTO addTriangulo(TrianguloDTO source) throws Exception {
        
        try{
            Triangulo trianguloAdd= circuloMapper.toEntity(source);            
            Triangulo result=circuloRepository.save(trianguloAdd);
            return circuloMapper.toDTO(result);
        }catch(Exception ex){
            ex.printStackTrace();
        }        
        throw new Exception("No se realizo la accion");
  
    }

    @Override
    public TrianguloDTO editTriangulo(TrianguloDTO source) throws Exception {
        try{
            
            Triangulo trianguloFinded=circuloRepository.findOne(source.getId());
            
            trianguloFinded.setAltura(source.getAltura());
            trianguloFinded.setBase(source.getBase());            
            trianguloFinded.area();

            Triangulo result=circuloRepository.save(trianguloFinded);
            return circuloMapper.toDTO(result);
        }catch(Exception ex){
            ex.printStackTrace();
        }        
        throw new Exception("No se realizo la accion");

    }

    @Override
    public void eliminarTriangulo(TrianguloDTO source) throws Exception {
        Triangulo trianguloFinded=circuloRepository.findOne(source.getId());
        circuloRepository.delete(trianguloFinded);
    }
    
}
