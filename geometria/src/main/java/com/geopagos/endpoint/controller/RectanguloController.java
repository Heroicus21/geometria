/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.endpoint.controller;

import com.geopagos.dto.CirculoDTO;
import com.geopagos.dto.RectanguloDTO;
import com.geopagos.service.CirculoService;
import com.geopagos.service.RectanguloService;
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
@RequestMapping("/rectangulo")
public class RectanguloController {
    
    @Autowired
    public RectanguloService rectanguloService;
    
    @GetMapping(value = "/")
    public Collection<RectanguloDTO> list() throws Exception{    
        return rectanguloService.list();        
    }
    
    @PostMapping(value = "/")
    public RectanguloDTO add(@RequestBody(required = true) RectanguloDTO rectanguloDTO) throws Exception{            
        return rectanguloService.addRectangulo(rectanguloDTO);        
    }
    
    @PutMapping(value = "/")
    public RectanguloDTO edit(@RequestBody(required = true) RectanguloDTO rectanguloDTO) throws Exception{            
        return rectanguloService.editRectangulo(rectanguloDTO);        
    }
    
    @DeleteMapping(value = "/")
    public void delete(@RequestBody(required = true) RectanguloDTO rectanguloDTO) throws Exception{            
         rectanguloService.eliminarRectangulo(rectanguloDTO);        
    }
    
}
