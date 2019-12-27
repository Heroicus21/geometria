/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.service;

import com.geopagos.dto.CirculoDTO;
import com.geopagos.dto.RectanguloDTO;
import com.geopagos.model.Circulo;
import java.util.Collection;

/**
 *
 * @author LucasRoman
 */
public interface RectanguloService {
    
    public RectanguloDTO addRectangulo(RectanguloDTO source) throws Exception;
    
    public RectanguloDTO editRectangulo(RectanguloDTO source) throws Exception;
    
    public Collection<RectanguloDTO> list() throws Exception;
    
    public void eliminarRectangulo(RectanguloDTO source) throws Exception;
    
}
