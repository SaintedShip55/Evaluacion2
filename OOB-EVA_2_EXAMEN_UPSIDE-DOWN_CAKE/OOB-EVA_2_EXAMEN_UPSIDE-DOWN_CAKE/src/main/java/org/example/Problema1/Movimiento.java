package org.example.Problema1;

public abstract class Movimiento implements Captura {
    private double velocidadInicial;
    private double velocidadFinal;
    private double aceleracion;
    private double tiempo;

    public Movimiento() {
    }

    public Movimiento(double velocidadInicial, double velocidadFinal, double aceleracion, double tiempo) {
        this.velocidadInicial = velocidadInicial;
        this.velocidadFinal = velocidadFinal;
        this.aceleracion = aceleracion;
        this.tiempo = tiempo;
    }

    @Override
    public double getVelocidadInicial() {
        return velocidadInicial;
    }

    @Override
    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    @Override
    public double getVelocidadFinal() {
        return velocidadFinal;
    }

    @Override
    public void setVelocidadFinal(double velocidadFinal) {
        this.velocidadFinal = velocidadFinal;
    }

    @Override
    public double getAceleracion() {
        return aceleracion;
    }

    @Override
    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    @Override
    public double getTiempo() {
        return tiempo;
    }

    @Override
    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public abstract void CalcularDistancia();
}
