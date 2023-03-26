/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_super2;

/**
 *
 * @author cavil
 */
public class Docente extends Persona {
    private String plaza;
    
    public Docente(){//constructor default
        super();//invocar constructor de la SUPERCLASE(Persona)
        this.plaza="----";
    }
    
    public Docente(String nombre, String apellido, int edad,String plaza) {
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }
    
    public String getPlaza() {
        return plaza;
    }
    
    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    @Override
    public void imprimirdatos(){
        super.imprimirdatos();
        System.out.println("Plaza: "+plaza);
}
}
