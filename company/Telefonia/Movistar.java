package com.company.Telefonia;

import com.company.Celular.Celular;

public class Movistar implements Telefonia {

    @Override
    public double costoLlamada(Celular celular, int duracionLlamada) {
        return celular.obtenerDuracionLlamada(duracionLlamada) * 0.60;
    }

}
