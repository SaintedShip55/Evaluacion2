/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_11_figuras;

/**
 *
 * @author cavil
 */
public class EVA2_11_Figuras {

    public static void main(String[] args) {
        Circulo c = new Circulo(5);
        Triangulo t = new Triangulo(10,10);
        Figura f = new Figura();

        System.out.println(c);
        System.out.println(t);
        System.out.println(f);
    }
}
