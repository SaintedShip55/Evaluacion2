/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_10_override;

/**
 *
 * @author cavil
 */
public class EVA2_10_Override {

    public static void main(String[] args) {
        Persona perso1 =new Persona();
        Persona perso2 =new Persona("Carlos",29);
        System.out.println(perso1);
        System.out.println(perso2);
    }
}
class Persona{
    private String nombre;
    private int edad;

    public Persona() {
        this.nombre="---";
        this.edad=-1;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString(){
        String cade="Datos \n" +
                    "Nombre: "+nombre+"\n"+
                    "Edad: "+edad;
        return cade;
    }
}
