package org.example.Problema2;

public interface Capturando {
    String nombre = "";
    String apellido = "";
    int edad = 0;
    double salarioBase = 0;

    //Metodos Getters y Setters
    void setNombre(String nombre);
    String getNombre();
    void setApellido(String apellido);
    String getApellido();
    void setEdad(int edad);
    int getEdad();
    void setSalarioBase(int salarioBase);
    double getSalarioBase();
}
