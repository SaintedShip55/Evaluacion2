package org.example.Problema2;

public class Jefe extends Empleados{
    private String nombre;
    private String apellido;
    private int edad;
    private double salarioBase;

    public Jefe() {
        super();
        this.nombre = "";
        this.apellido = "";
        this.edad = -1;
        this.salarioBase = 5000;
    }

    public Jefe(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salarioBase = 5000;
    }

    public double calcularSalario(double salarioBase){
        return salarioBase;
    }
    @Override
    public String toString(){
        String chain = "Datos del empleado: " + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nSalario: " + calcularSalario(salarioBase);
        return chain;
    }

}
