/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.service;

import com.geopagos.dto.CirculoDTO;
import com.geopagos.dto.CuadradoDTO;
import com.geopagos.model.Circulo;
import com.geopagos.model.Cuadrado;
import java.util.Collection;

/**
 *
 * @author LucasRoman
 */
public interface CuadradoService {
    
    public CuadradoDTO addCuadrado(CuadradoDTO source) throws Exception;
    
    public CuadradoDTO editCuadrado(CuadradoDTO source) throws Exception;
    
    public Collection<CuadradoDTO> list() throws Exception;
    
    public void eliminarCuadrado(CuadradoDTO source) throws Exception;
    
}
