/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.service;

import com.geopagos.dto.CirculoDTO;
import com.geopagos.dto.TrianguloDTO;
import com.geopagos.model.Circulo;
import java.util.Collection;

/**
 *
 * @author LucasRoman
 */
public interface TrianguloService {
    
    public TrianguloDTO addTriangulo(TrianguloDTO source) throws Exception;
    
    public TrianguloDTO editTriangulo(TrianguloDTO source) throws Exception;
    
    public Collection<TrianguloDTO> list() throws Exception;
    
    public void eliminarTriangulo(TrianguloDTO source) throws Exception;
    
}
