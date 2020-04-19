package com.company.Celular;

import com.company.Telefonia.Movistar;
import com.company.Telefonia.Telefonia;

public class Iphone implements Celular {

    Telefonia movistar = new Movistar();

    private static final int BATERIA_MAXIMA = 5;

    private double bateria = BATERIA_MAXIMA;

    public Iphone() {
    }

    public double bateriaDescargada(double duracionLlamada){
        return (duracionLlamada)/100;
    }

    @Override
    public double llamar(int llamadas, int duracionLlamada) {
        return  bateria = bateria - bateriaDescargada(duracionLlamada);
    }

    public int obtenerDuracionLlamada(int duracionLlamada){
        return (int) (bateriaDescargada(duracionLlamada)*100);
    }

    @Override
    public boolean estaApagado() {
        return bateria == 0;
    }

    @Override
    public double recargarCelular() {
        return bateria = 5;
    }

    @Override
    public String toString() {
        return "El celular de Catalina tiene " + bateria + " de bateria, y gastó ";
    }
}
