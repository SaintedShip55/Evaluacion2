package org.example.Problema3;

public class EmpleadoTiempoParcial extends Empleados{
    double pagoPorHora;
    double horasTrabajadas;

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public EmpleadoTiempoParcial() {
    }

    public EmpleadoTiempoParcial(int id, String nombre, double salario, double pagoPorHora, double horasTrabajadas) {
        super(id, nombre, salario);
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        salario = pagoPorHora * horasTrabajadas;
        return salario;
    }
}
