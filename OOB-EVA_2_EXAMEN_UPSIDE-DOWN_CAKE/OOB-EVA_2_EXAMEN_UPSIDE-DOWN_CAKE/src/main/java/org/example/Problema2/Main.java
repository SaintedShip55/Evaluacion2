package org.example.Problema2;

public class Main {
    public static void main(String[] args){
        Manufactura manufactura = new Manufactura("Raul","Fernandez", 18, 40 );
        System.out.println(manufactura);
        System.out.println("");
        Apoyo apoyo = new Apoyo("Carlos", "Villa", 20, 40);
        System.out.println(apoyo);
        System.out.println("");
        Jefe jefe = new Jefe("Ruben", "Hernandez", 35);
        System.out.println(jefe);
    }
}
