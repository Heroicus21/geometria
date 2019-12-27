/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.endpoint.controller;

import com.geopagos.dto.CirculoDTO;
import com.geopagos.service.CirculoService;
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
@RequestMapping("/circulo")
public class CirculoController {
    
    @Autowired
    public CirculoService circuloService;
    
    @GetMapping(value = "/")
    public Collection<CirculoDTO> list() throws Exception{    
        return circuloService.list();        
    }
    
    @PostMapping(value = "/")
    public CirculoDTO add(@RequestBody(required = true) CirculoDTO circuloDTO) throws Exception{            
        return circuloService.addCirculo(circuloDTO);        
    }
    
    @PutMapping(value = "/")
    public CirculoDTO edit(@RequestBody(required = true) CirculoDTO circuloDTO) throws Exception{            
        return circuloService.editCirculo(circuloDTO);        
    }
    
    @DeleteMapping(value = "/")
    public void delete(@RequestBody(required = true) CirculoDTO circuloDTO) throws Exception{            
         circuloService.eliminarCirculo(circuloDTO);        
    }
    
}
