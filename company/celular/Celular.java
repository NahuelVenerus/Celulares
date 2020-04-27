package com.company.celular;

public abstract class Celular {

    static final int BATERIA_MAXIMA = 5;

    private double bateria = BATERIA_MAXIMA;

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    public abstract void llamar(int duracionLlamada);

    public boolean estaApagado() {
        return getBateria() <= 0;
    }

    public void recargarCelular() {
        bateria = BATERIA_MAXIMA;
    }

    @Override
    public String toString() {
        return "El celular de Cliente tiene " + getBateria() + " de bateria";
    }
}