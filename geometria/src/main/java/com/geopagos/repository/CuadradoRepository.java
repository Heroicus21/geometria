/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.repository;

import com.geopagos.model.Circulo;
import com.geopagos.model.Cuadrado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author LucasRoman
 */

@Component
public interface CuadradoRepository extends JpaRepository<Cuadrado, Long>{
    
}
