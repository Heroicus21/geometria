/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geometria.test.repository;

import com.geopagos.model.Circulo;
import com.geopagos.repository.CirculoRepository;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author LucasRoman
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CirculoRepositoryTest {
    
    @Autowired
    public CirculoRepository circuloRepositoryTest;
    
    @Test
    public void listCirculosIsNull() {            
            Collection<Circulo> circulo=circuloRepositoryTest.findAll();
            Assert.assertNull(circulo);            
	}
    @Test
    public void addCirculoTest() {
            Circulo circulo= new Circulo(12f);            
            circulo.area();
            Collection<Circulo> circulos= new ArrayList<Circulo>();
            Circulo result= circuloRepositoryTest.save(circulo);
            Assert.assertNull(circulo);            
	}
    
    @Test
    public void editCirculoTest() {                        
            Circulo circulo=circuloRepositoryTest.findOne(1L);            
            circulo.area();
            Collection<Circulo> circulos= new ArrayList<Circulo>();
            Circulo result= circuloRepositoryTest.save(circulo);
            Assert.assertNull(result);            
	}
    
}
