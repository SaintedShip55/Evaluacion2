/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_herencia;

/**
 *
 * @author cavil
 */
public class Estudiante {
    private String Nombre;
    private String apellido;
    private int edad;
    private String noControl;

    public Estudiante() {
    }

    public Estudiante(String Nombre, String apellido, int edad, String noControl) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.noControl = noControl;
    }

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
}
