package com.company.telefonia;

import com.company.cliente.Cliente;

import java.util.Map;

public class Claro extends Telefonia {

    public Claro(Map<Cliente, Double> gastoClientes) {
        super(gastoClientes);
    }

    @Override
    public void costoLlamada(Cliente cliente, int duracionLlamada) {
        double gastoActual = gastoClientes.get(cliente);
        double gasto = (duracionLlamada * 0.50) * (21 / 100);
        gastoClientes.put(cliente, gastoActual + gasto);
    }

}