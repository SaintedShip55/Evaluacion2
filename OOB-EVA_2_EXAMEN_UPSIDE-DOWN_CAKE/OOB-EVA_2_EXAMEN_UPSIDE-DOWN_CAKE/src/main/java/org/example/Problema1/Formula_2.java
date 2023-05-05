package org.example.Problema1;

public class Formula_2 extends Movimiento{
    private double velocidadInicial;
    private double velocidadFinal;
    private double aceleracion;
    private double tiempo;
    private double distancia;

    public Formula_2(double velocidadInicial, double velocidadFinal, double aceleracion, double tiempo) {
        super(velocidadInicial, velocidadFinal, aceleracion, tiempo);
        this.velocidadInicial = velocidadInicial;
        this.velocidadFinal = velocidadFinal;
        this.aceleracion = aceleracion;
        this.tiempo = tiempo;
    }

    @Override
    public void CalcularDistancia() {
        System.out.println("Formula No.2: ((velocidadInicial + velocidadFinal)/2)*(tiempo)" );
        distancia = ((velocidadInicial + velocidadFinal)/2)*(tiempo);
        System.out.print("La distancia es de: " + distancia);
    }
}

