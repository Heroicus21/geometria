/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.endpoint.controller;

import com.geopagos.dto.CirculoDTO;
import com.geopagos.dto.TrianguloDTO;
import com.geopagos.service.CirculoService;
import com.geopagos.service.TrianguloService;
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
@RequestMapping("/triuangulo")
public class TrianguloController {
    
    @Autowired
    public TrianguloService trianguloService;
    
    @GetMapping(value = "/")
    public Collection<TrianguloDTO> list() throws Exception{    
        return trianguloService.list();        
    }
    
    @PostMapping(value = "/")
    public TrianguloDTO add(@RequestBody(required = true) TrianguloDTO trianguloDTO) throws Exception{            
        return trianguloService.addTriangulo(trianguloDTO);        
    }
    
    @PutMapping(value = "/")
    public TrianguloDTO edit(@RequestBody(required = true) TrianguloDTO trianguloDTO) throws Exception{            
        return trianguloService.editTriangulo(trianguloDTO);        
    }
    
    @DeleteMapping(value = "/")
    public void delete(@RequestBody(required = true) TrianguloDTO trianguloDTO) throws Exception{            
         trianguloService.eliminarTriangulo(trianguloDTO);        
    }
    
}
