/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geopagos.dto;

/**
 *
 * @author LucasRoman
 */
public class CirculoDTO {
    private Long id;    
    private double radio;
    private double areaRadio;
    static final double pi = 3.1415;   

    public CirculoDTO() {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
