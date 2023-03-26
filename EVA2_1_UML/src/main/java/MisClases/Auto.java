/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author cavil
 */
public class Auto {
    private String marca;
    private String modelo;
    private int año;
    public void setMarca(String valor){
        marca=valor;
    }
    public String getMarca(){
        System.out.println("La marca es: "+marca);
        return marca;
    }
    public void setModelo(String valor){
        modelo=valor;
    }
    public String getModelo(){
        System.out.println("El modelo es: "+modelo);
        return modelo;
    }
    public void setAño(int valor){
        año=valor;
    }
    public int getAño(){
        System.out.println("El año es: "+año);
        return año;
    }
    public void datosauto(){
        getMarca();
        getModelo();
        getAño();
    }
}
