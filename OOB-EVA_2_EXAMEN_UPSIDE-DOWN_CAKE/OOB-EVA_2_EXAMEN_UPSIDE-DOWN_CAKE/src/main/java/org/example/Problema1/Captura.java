package org.example.Problema1;

public interface Captura {
    double velocidadInicial = 0;
    double velocidadFinal = 0;
    double aceleracion = 0;
    double tiempo = 0;

    //Getters y Setters
    void setVelocidadInicial(double velocidadInicial);
    double getVelocidadInicial();
    void setVelocidadFinal(double velocidadFinal);
    double getVelocidadFinal();
    void setAceleracion(double aceleracion);
    double getAceleracion();
    void setTiempo(double tiempo);
    double getTiempo();
}
