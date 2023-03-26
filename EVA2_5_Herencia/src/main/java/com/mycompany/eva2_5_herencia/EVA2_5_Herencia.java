/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_5_herencia;

/**
 *
 * @author cavil
 */
public class EVA2_5_Herencia {

    public static void main(String[] args) {
        SubClase obj1 = new SubClase();
        obj1.mensaje();
    }
}
    class SuperClase{
    public void mensaje(){
        System.out.println("HOLA PRRO");
    }
    }
    class SubClase extends SuperClase{
        
    }
