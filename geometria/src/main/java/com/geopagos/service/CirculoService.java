/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.service;

import com.geopagos.dto.CirculoDTO;
import com.geopagos.model.Circulo;
import java.util.Collection;

/**
 *
 * @author LucasRoman
 */
public interface CirculoService {
    
    public CirculoDTO addCirculo(CirculoDTO source) throws Exception;
    
    public CirculoDTO editCirculo(CirculoDTO source) throws Exception;
    
    public Collection<CirculoDTO> list() throws Exception;
    
    public void eliminarCirculo(CirculoDTO source) throws Exception;
    
}
