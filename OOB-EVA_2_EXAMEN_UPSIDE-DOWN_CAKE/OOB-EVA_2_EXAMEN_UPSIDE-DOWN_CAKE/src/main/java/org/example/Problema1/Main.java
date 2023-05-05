package org.example.Problema1;

public class Main {
    public static void main(String[] args){
        Formula_1 formula1 = new Formula_1(20,50,1.8,10);
        formula1.CalcularDistancia();
        System.out.println("\n");
        Formula_2 formula2 = new Formula_2(20,50,1.8,10);
        formula2.CalcularDistancia();
        System.out.println("\n");
        Formula_3 formula3 = new Formula_3(20,50,1.8,10);
        formula3.CalcularDistancia();
    }
}
