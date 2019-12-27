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
public class Triangulo implements FiguraGeometrica{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private double base;
    private double altura;
    private double areaTriangulo;
    
    public Triangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() 
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

    public double getareaTriangulo() 
    {
        return areaTriangulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAreaTriangulo() {
        return areaTriangulo;
    }

    public void setAreaTriangulo(double areaTriangulo) {
        this.areaTriangulo = areaTriangulo;
    }
 
    
    
    /**
     * Params(null)
     * 
     * Metodo que devuelve el area de la figura del Triangulo
     * @return Double 
     */
    @Override
    public double area() {        
         this.areaTriangulo = base * altura / 2;
         return this.areaTriangulo;        
    }
    
}
