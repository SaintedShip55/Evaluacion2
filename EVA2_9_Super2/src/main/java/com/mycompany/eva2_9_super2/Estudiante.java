/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_super2;

/**
 *
 * @author cavil
 */
    //Clase derivada extends Clase Base
    //Clase Hijo extends Clase Padre
    //Subclase extends Superclase
public class Estudiante extends Persona{
    private String noControl;
    
    public Estudiante(){//constructor default
        super();//invocar constructor de la SUPERCLASE(Persona)
        this.noControl="----";
    }

    public Estudiante(String nombre, String apellido, int edad,String noControl) {
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }
    
            
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    @Override //Reemplazar el metod que se llame igual
    public void imprimirdatos(){
        super.imprimirdatos();
        System.out.println("Número de control: "+noControl);
}
}
