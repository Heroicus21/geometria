/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.model;

import com.geopagos.interfaces.FiguraGeometrica;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author LucasRoman
 */

@Entity
@Table(name = "circulo")
public class Circulo implements FiguraGeometrica{
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    
    private double radio;
    private double areaRadio;
    static final double pi = 3.1415;   
    

    public Circulo(double radio) {
        this.radio = radio;
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAreaRadio() {
        return areaRadio;
    }

    public void setAreaRadio(double areaRadio) {
        this.areaRadio = areaRadio;
    }

    public static double getPi() {
        return pi;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * Params(null)
     * 
     * Metodo que devuelve el area de la figura del Circulo
     * @return Double 
     */
    @Override
    public double area(){          
        this.areaRadio=pi*(radio*radio);
        return this.areaRadio;
    }    
}
