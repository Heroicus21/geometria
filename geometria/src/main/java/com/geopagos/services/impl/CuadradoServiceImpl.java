/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.services.impl;

import com.geopagos.dto.CirculoDTO;
import com.geopagos.dto.CuadradoDTO;
import com.geopagos.mapper.CirculoMapper;
import com.geopagos.mapper.CuadradoMapper;
import com.geopagos.model.Circulo;
import com.geopagos.model.Cuadrado;
import com.geopagos.repository.CirculoRepository;
import com.geopagos.repository.CuadradoRepository;
import com.geopagos.service.CirculoService;
import com.geopagos.service.CuadradoService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LucasRoman
 */
@Service
public class CuadradoServiceImpl implements CuadradoService{

    @Autowired
    public CuadradoMapper cuadradoMapper;
    
    @Autowired
    public CuadradoRepository cuadradoRepository;

    @Override
    public CuadradoDTO addCuadrado(CuadradoDTO source) throws Exception {
        
        try{
            Cuadrado cuadradoAdd= cuadradoMapper.toEntity(source);            
            Cuadrado result=cuadradoRepository.save(cuadradoAdd);
            return cuadradoMapper.toDTO(result);
        }catch(Exception ex){
            ex.printStackTrace();
        }        
        throw new Exception("No se realizo la accion");
        
    }

    @Override
    public CuadradoDTO editCuadrado(CuadradoDTO source) throws Exception {
        
         try{
            
            Cuadrado cuadradoFinded=cuadradoRepository.findOne(source.getId());            
            cuadradoFinded.setLado(source.getLado());
            cuadradoFinded.area();
            
            Cuadrado result=cuadradoRepository.save(cuadradoFinded);
            return cuadradoMapper.toDTO(result);
        }catch(Exception ex){
            ex.printStackTrace();
        }        
        throw new Exception("No se realizo la accion");
        
    }

    @Override
    public void eliminarCuadrado(CuadradoDTO source) throws Exception {
        
        Cuadrado cuadradoFinded=cuadradoRepository.findOne(source.getId());
        cuadradoRepository.delete(cuadradoFinded);
        
    }

    @Override
    public Collection<CuadradoDTO> list() throws Exception {
        Collection<Cuadrado> circuloList=cuadradoRepository.findAll();        
        return cuadradoMapper.toDTOS(circuloList);
    }
    
}
