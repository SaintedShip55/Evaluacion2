/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_4_formatoapa;

/**
 *
 * @author cavil
 */
public class Sitioweb extends Base{
    private String nombreweb;
    private String url;

    public Sitioweb() {
    }

    public Sitioweb(String nombreweb, String url) {
        this.nombreweb = nombreweb;
        this.url = url;
    }

    public String getNombreweb() {
        return nombreweb;
    }

    public void setNombreweb(String nombreweb) {
        this.nombreweb = nombreweb;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}
