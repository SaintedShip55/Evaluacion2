package org.example.Problema2;

public abstract class Empleados implements Capturando{
 private String nombre;
 private String apellido;
 private int edad;
 private double salarioBase;

    public Empleados(String nombre, String apellido, int edad) {
    }

    public Empleados() {

    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }
}

