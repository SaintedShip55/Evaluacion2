/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_3_extends;

/**
 *
 * @author cavil
 */
public class Docente extends Persona {
    private String plaza;
    
    public Docente() {
    }
    
    public Docente(String plaza) {
        this.plaza = plaza;
    }
    
    public String getPlaza() {
        return plaza;
    }
    
    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    
}
