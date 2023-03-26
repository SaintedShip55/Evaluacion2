/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author cavil
 */
public class Persona {
    private String id;
    private int edad;
    private String nombre;
    public void setId(String valor){
        id=valor;
    }
    public String getId(){
        System.out.println("El ID es: "+id);
        return id;
    }
    public void setNombre(String valor){
        nombre=valor;
    }
    public String getNombre(){
        System.out.println("El nombre es: "+nombre);
        return nombre;
    }
    public void setEdad(int valor){
        edad=valor;
    }
    public int getEdad(){
        System.out.println("La edad es: "+edad);
        return edad;
    }
    public void datospersona(){
        getNombre();
        getEdad();
        getId();
    }
}



