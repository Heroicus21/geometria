/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.model;

import com.geopagos.interfaces.FiguraGeometrica;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;

/**
 *
 * @author LucasRoman
 */
public class Rectangulo implements FiguraGeometrica{
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    
    private double base;
    private double altura;
    private double areaRectangulo;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAreaRectangulo() {
        return areaRectangulo;
    }

    public void setAreaRectangulo(double areaRectangulo) {
        this.areaRectangulo = areaRectangulo;
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
     * Metodo que devuelve el area de la figura del Rectangulo
     * @return Double 
     */
    @Override
    public double area() {
        this.areaRectangulo=base*altura;                
        return this.areaRectangulo; 
    }
    
}
