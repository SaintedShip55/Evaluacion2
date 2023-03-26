/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_8_super;

/**
 *
 * @author cavil
 */
public class EVA2_8_Super {

    public static void main(String[] args) {
        ANIMAL animal = new ANIMAL(100); 
        MAMIFERO ma = new MAMIFERO();
        PERROS perros = new PERROS();
    }
}
class ANIMAL{     
        private int peso;

        public int getPeso() {
            return peso;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }
        
          public ANIMAL(int peso) {
            this.peso = peso;
            System.out.println("estoy vivo; CONSTRUCTOR 2");
            
        }
        public ANIMAL(){
            System.out.println("estoy vivo");
        }
        
        public void respirar(){
            System.out.println("estoy respirando");
            
        }
        public void comer(){
            System.out.println("estoy comiendo");
        }

    }
        class MAMIFERO extends ANIMAL{
        
        public MAMIFERO(){
            super(); // llamada al constructor de la super clase 
            // en nuestro caso esta llamando a animal()
            // siempre debemos llamar primero al constructor de la superclase 
            System.out.println("soy un mamifero");
        }

        public MAMIFERO(int peso) {
           
            super(peso);
        }

        public MAMIFERO(String colorPelo, int peso) {
            super(peso);
            this.colorPelo = colorPelo;
            System.out.println("soy un mamifero, CONSTRUCTOR 2");
        }
         private String colorPelo;

        public String getColorPelo() {
            return colorPelo;
        }

        public void setColorPelo(String colorPelo) {
            this.colorPelo = colorPelo;
        }
        
        
    }
class PERROS extends MAMIFERO{
            public PERROS(){
                //siempre hay que invocar al constructor 
                super();
                System.out.println("soy moly y soy un perro");
            }
        }

