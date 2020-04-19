package com.company.Telefonia;

import com.company.Celular.Celular;

public class Personal implements Telefonia{

    @Override
    public double costoLlamada(Celular celular, int duracionLlamada) {
        if (duracionLlamada < 10) {
            return celular.obtenerDuracionLlamada(duracionLlamada) * 0.70;
        } else {
            return celular.obtenerDuracionLlamada(duracionLlamada) * 0.40;
        }
    }
}
