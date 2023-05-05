package org.example.Problema1;

public class Formula_1 extends Movimiento{
    private double velocidadInicial;
    private double velocidadFinal;
    private double aceleracion;
    private double tiempo;
    private double distancia;

    public Formula_1(double velocidadInicial, double velocidadFinal, double aceleracion, double tiempo) {
        super(velocidadInicial, velocidadFinal, aceleracion, tiempo);
        this.velocidadInicial = velocidadInicial;
        this.velocidadFinal = velocidadFinal;
        this.aceleracion = aceleracion;
        this.tiempo = tiempo;
    }

    @Override
    public void CalcularDistancia() {
        System.out.println("Formula No.1: (velocidadInicial * tiempo) + (aceleracion * Math.pow(tiempo,2)/2)" );
        distancia =(velocidadInicial * tiempo) + ((aceleracion * Math.pow(tiempo,2))/2);
        System.out.print("La distancia es de: " + distancia);
    }
}
