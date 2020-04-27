package com.company.cliente;

import com.company.celular.Celular;
import com.company.telefonia.Telefonia;

public class Cliente {

    private Celular celular;
    private Telefonia telefonia;

    public Cliente(Celular celular, Telefonia telefonia) {
        this.celular = celular;
        this.telefonia = telefonia;
    }

    public Celular getCelular() {
        return celular;
    }

    public Telefonia getTelefonia() {
        return telefonia;
    }

    public void llamar(Cliente cliente, int duracionLlamada) {
        celular.llamar(duracionLlamada);
    }
}