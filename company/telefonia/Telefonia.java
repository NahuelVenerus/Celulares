package com.company.telefonia;

import com.company.cliente.Cliente;

import java.util.Map;

public abstract class Telefonia {

    public Map<Cliente, Double> gastoClientes;

    public Telefonia(Map<Cliente, Double> gastoClientes) {
        this.gastoClientes = gastoClientes;
    }

    abstract void costoLlamada(Cliente cliente, int duracionLlamada);
}
