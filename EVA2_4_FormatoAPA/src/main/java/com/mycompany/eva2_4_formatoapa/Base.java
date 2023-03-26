/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_4_formatoapa;

/**
 *
 * @author cavil
 */
public class Base {
    private String autor;
    private String titulo;
    private String mes;
    private String ciudad;
    private int año;
    private int dia;

    public Base() {
    }
    
    public Base(String sutor, String titulo, String mes, String ciudad, int año, int dia) {
        this.autor = sutor;
        this.titulo = titulo;
        this.mes = mes;
        this.ciudad = ciudad;
        this.año = año;
        this.dia = dia;
    }

    public String getSutor() {
        return autor;
    }

    public void setSutor(String sutor) {
        this.autor = sutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
}
