package com.company.celular;

public class MotorolaU9 extends Celular {

    private static final int BATERIA_MAXIMA = 5;

    public MotorolaU9() {
    }

    @Override
    public void llamar(int duracionLlamada) {
        double bateria = getBateria() - 0.25;
        setBateria(Math.max(bateria, 0));
    }

    @Override
    public void recargarCelular() {
        setBateria(5);
    }
}
