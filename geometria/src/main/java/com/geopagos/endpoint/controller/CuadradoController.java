/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.endpoint.controller;

import com.geopagos.dto.CirculoDTO;
import com.geopagos.dto.CuadradoDTO;
import com.geopagos.service.CirculoService;
import com.geopagos.service.CuadradoService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LucasRoman
 */
@RestController
@RequestMapping("/cuadrado")
public class CuadradoController {
    
    @Autowired
    public CuadradoService cuadradoService;
    
    @GetMapping(value = "/")
    public Collection<CuadradoDTO> list() throws Exception{    
        return cuadradoService.list();        
    }
    
    @PostMapping(value = "/")
    public CuadradoDTO add(@RequestBody(required = true) CuadradoDTO cuadradoDTO) throws Exception{            
        return cuadradoService.addCuadrado(cuadradoDTO);        
    }
    
    @PutMapping(value = "/")
    public CuadradoDTO edit(@RequestBody(required = true) CuadradoDTO cuadradoDTO) throws Exception{            
        return cuadradoService.editCuadrado(cuadradoDTO);        
    }
    
    @DeleteMapping(value = "/")
    public void delete(@RequestBody(required = true) CuadradoDTO cuadradoDTO) throws Exception{            
         cuadradoService.eliminarCuadrado(cuadradoDTO);        
    }
    
}
