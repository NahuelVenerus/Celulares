package com.company.celular;

public class Iphone extends Celular {

    private static final int BATERIA_MAXIMA = 5;


    public Iphone() {
    }

    public double bateriaDescargada(double duracionLlamada) {
        return duracionLlamada / 100;
    }

    @Override
    public void llamar(int duracionLlamada) {
        double bateria = getBateria() - bateriaDescargada(duracionLlamada);
        setBateria(Math.max(bateria, 0));
    }
}
