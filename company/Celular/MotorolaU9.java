package com.company.Celular;

public class MotorolaU9 implements Celular {

    private static final int BATERIA_MAXIMA = 5;

    private double bateria = BATERIA_MAXIMA;

    public MotorolaU9() {
    }

    public double bateriaDescargada(int llamadas) {
        return llamadas * 0.25;
    }

    @Override
    public double llamar(int llamadas, int duracionLlamada){
        return bateria = bateria - bateriaDescargada(llamadas);

    }

    @Override
    public int obtenerDuracionLlamada(int duracionLlamada) {
        return duracionLlamada;
    }

    @Override
    public boolean estaApagado() {
        return bateria == 0;
    }

    @Override
    public double recargarCelular() {
        return (int) (bateria = 5);
    }

    @Override
    public String toString() {
        return "El celular de Juliana tiene " + bateria + " de bateria";
    }
}
