/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_4_formatoapa;

/**
 *
 * @author cavil
 */
public class Informe extends Base {
    private String editorial;
    private String ciudad;

    public Informe() {
    }

    public Informe(String editorial, String ciudad) {
        this.editorial = editorial;
        this.ciudad = ciudad;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
