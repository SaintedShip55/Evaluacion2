package org.example.Problema3;

public class EmpleadoTiempoCompleto extends Empleados{

    public EmpleadoTiempoCompleto() {
    }

    public EmpleadoTiempoCompleto(int id, String nombre, double salario) {
        super(id, nombre, salario);
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}
