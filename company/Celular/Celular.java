package com.company.Celular;

public interface Celular {

    static final int BATERIA_MAXIMA = 5;

    double llamar(int llamadas, int duracionLlamada);

    int obtenerDuracionLlamada(int duracionLlamada);

    boolean estaApagado();

    double recargarCelular();
}
