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
public class Cuadrado implements FiguraGeometrica{
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    
    private double lado;
    private double areaCuadrado;

    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    
    public double getLado() 
    {
        return lado;
    }

    public void setLado(double lado) 
    {
        this.lado = lado;
    }

    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAreaCuadrado() {
        return areaCuadrado;
    }

    public void setAreaCuadrado(double areaCuadrado) {
        this.areaCuadrado = areaCuadrado;
    }

    
    
    /**
     * Params(null)
     * 
     * Metodo que devuelve el area de la figura del Cuadrado
     * @return Double 
     */
    @Override
    public double area() {
        areaCuadrado = lado * lado;
        return areaCuadrado;
    }

}
