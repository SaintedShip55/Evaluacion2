package org.example.Problema1;

public class Formula_3 extends Movimiento{
    private double velocidadInicial;
    private double velocidadFinal;
    private double aceleracion;
    private double tiempo;
    private double distancia;

    public Formula_3(double velocidadInicial, double velocidadFinal, double aceleracion, double tiempo) {
        super(velocidadInicial, velocidadFinal, aceleracion, tiempo);
        this.velocidadInicial = velocidadInicial;
        this.velocidadFinal = velocidadFinal;
        this.aceleracion = aceleracion;
        this.tiempo = tiempo;
    }

    @Override
    public void CalcularDistancia() {
        System.out.println("Formula No.3: (velocidadFinal-velocidadInicial)/(2*aceleracion)" );
        distancia = (velocidadFinal-velocidadInicial)/(2*aceleracion);
        System.out.print("La distancia es de: " + distancia);
    }
}
