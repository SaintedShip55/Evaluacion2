package org.example.Problema3;

public class Administrador extends EmpleadoTiempoCompleto implements ElegibleParaBono{
    double porcentajeDelBono;

    public double getPorcentajeDelBono() {
        return porcentajeDelBono;
    }

    public void setPorcentajeDelBono(double porcentajeDelBono) {
        this.porcentajeDelBono = porcentajeDelBono;
    }

    public Administrador() {
    }

    public Administrador(int id, String nombre, double salario, double porcentajeDelBono) {
        super(id, nombre, salario);
        this.porcentajeDelBono = porcentajeDelBono;
    }

    @Override
    public double calcularSalario() {
        double salarioYbono = salario + porcentajeDelBono;
        return salarioYbono;
    }

    @Override
    public void calcularBono() {
       porcentajeDelBono = salario * 0.10; //Ingresar porcentaje del bono cantidad del bono
    }
}
