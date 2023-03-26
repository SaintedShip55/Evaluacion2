/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_1_uml;

import MisClases.Auto;
import MisClases.Persona;
import MisClases.Televisión;

/**
 *
 * @author cavil
 */
public class EVA2_1_UML {

    public static void main(String[] args) {
        Persona obj1 = new Persona();
        obj1.setEdad(40);
        obj1.setId("001");
        obj1.setNombre("Carlos");
        obj1.datospersona();
        System.out.println("");
        Televisión obj2 = new Televisión();
        obj2.setCanal(17);
        obj2.setVolumen(61);
        obj2.setPower("Encendido");
        obj2.datostele();
        System.out.println("");
        Auto obj3 = new Auto();
        obj3.setAño(2003);
        obj3.setMarca("VolskWagen");
        obj3.setModelo("Jetta");
        obj3.datosauto();
    }
}
