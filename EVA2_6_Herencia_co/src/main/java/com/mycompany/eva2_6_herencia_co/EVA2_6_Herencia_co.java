/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_6_herencia_co;

/**
 *
 * @author cavil
 */
public class EVA2_6_Herencia_co {

    public static void main(String[] args) {
        System.out.println("Clase animal");
        Animal animal=new Animal();
        animal.comer();
        animal.respirar();
        System.out.println("Clase mamífero");
        Mamifero mamifero=new Mamifero();
        mamifero.comer();
        mamifero.respirar();
        mamifero.tenerpelaje();
    }
}
