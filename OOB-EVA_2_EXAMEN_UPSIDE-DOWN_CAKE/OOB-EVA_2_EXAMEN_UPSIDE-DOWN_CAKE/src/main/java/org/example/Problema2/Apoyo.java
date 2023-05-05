package org.example.Problema2;

public class Apoyo extends Empleados{
    private String nombre;
    private String apellido;
    private int edad;
    private double salarioBase;
    private double horasTrabajadas;

    public Apoyo() {
        super();
        this.nombre = "";
        this.apellido = "";
        this.edad = -1;
        this.salarioBase = 50;
    }

    public Apoyo(String nombre, String apellido, int edad, double horasTrabajadas) {
        super(nombre, apellido, edad);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salarioBase = 50;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalario(double salarioBase){
        double salario = salarioBase * horasTrabajadas;
        double salarioconbono = (salario*.50) + salario;
        return salarioconbono;
    }
    @Override
    public String toString(){
        String chain = "Datos del empleado: " + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nSalario: " + calcularSalario(salarioBase);
        return chain;
    }

}
