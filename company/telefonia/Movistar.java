package com.company.telefonia;

import com.company.cliente.Cliente;

import java.util.Map;

public class Movistar extends Telefonia {

    public Movistar(Map<Cliente, Double> gastoClientes) {
        super(gastoClientes);
    }

    @Override
    void costoLlamada(Cliente cliente, int duracionLlamada) {
        double gastoActual = gastoClientes.get(cliente);
        double gasto = duracionLlamada * 0.60;
        gastoClientes.put(cliente, gastoActual + gasto);
    }


}
