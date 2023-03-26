/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_11_figuras;

/**
 *
 * @author cavil
 */
public class Figura {
    public double area;
    public double perimetro;
    public Figura() {
        this.area = -1;
        this.perimetro = -1;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public Figura(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public void imprimirDatos(){
        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+perimetro);
    }

    @Override
    public String toString(){
        area = getArea();
        perimetro = getPerimetro();
        System.out.println("Resultados triangulo: \n");
        String chain = "Area: "+area+"\n"+"Perimetro: "+perimetro+"\n";
        return chain;
    }   
} 
