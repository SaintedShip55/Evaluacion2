/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author cavil
 */
public class Televisión {
    private int canal;
    private int volumen;
    private String power;
    public void setCanal(int valor){
        canal=valor;
    }
    public int getCanal(){
        System.out.println("El canal es: "+canal);
        return canal;
    }
    public void setVolumen(int valor){
        volumen=valor;
    }
    public int getVolumen(){
        System.out.println("El volumen es: "+volumen);
        return volumen;
    }
    public void setPower(String valor){
        power=valor;
    }
    public String getPower(){
        System.out.println(power);
        return power;
    }
    public void datostele(){
        getPower();
        getCanal();
        getVolumen();
    }
}
