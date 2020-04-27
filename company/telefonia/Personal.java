package com.company.telefonia;

import com.company.cliente.Cliente;

import java.util.Map;

public class Personal extends Telefonia {

    public Personal(Map<Cliente, Double> gastoClientes) {
        super(gastoClientes);
    }

    @Override
    void costoLlamada(Cliente cliente, int duracionLlamada) {
        double gastoActual = gastoClientes.get(cliente);
        double gasto;
        if (duracionLlamada < 10) {
            gasto = duracionLlamada * 0.70;
        } else {
            gasto = duracionLlamada * 0.40;
        }
        gastoClientes.put(cliente, gastoActual + gasto);
    }
}
