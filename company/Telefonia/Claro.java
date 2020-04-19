package com.company.Telefonia;

import com.company.Celular.Celular;

public class Claro implements Telefonia{

    @Override
    public double costoLlamada(Celular celular, int duracionLlamada) {
        return (celular.obtenerDuracionLlamada(duracionLlamada) * 0.50) * (21/100);
    }

}
