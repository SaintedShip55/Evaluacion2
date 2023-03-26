/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_9_super2;

/**
 *
 * @author cavil
 */
public class EVA2_9_Super2 {

    public static void main(String[] args) {
        Estudiante estudiante= new Estudiante("Carlos","Villa", 19,"22550306");
        estudiante.imprimirdatos();
        //System.out.println("Número de control: "+estudiante.getNoControl());
        
        Docente docente=new Docente("Carlos","Villa",22,"Chihuahua");
        docente.imprimirdatos();
        //System.out.println("Plaza es: "+docente.getPlaza());
    }
}
