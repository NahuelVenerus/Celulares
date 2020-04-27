package com.company;

import com.company.celular.Iphone;
import com.company.celular.MotorolaU9;
import com.company.cliente.Cliente;
import com.company.telefonia.Claro;
import com.company.telefonia.Movistar;
import com.company.telefonia.Personal;
import com.company.telefonia.Telefonia;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        MotorolaU9 motorolaU9 = new MotorolaU9();

        Map clientesMovistar = new HashMap();
        Telefonia movistar = new Movistar(clientesMovistar);
        Map clientesPersonal = new HashMap();
        Telefonia personal = new Personal(clientesPersonal);
        Map clientesClaro = new HashMap();
        Telefonia claro = new Claro(clientesClaro);

        Cliente juliana = new Cliente(motorolaU9, personal);
        Cliente catalina = new Cliente(iphone, movistar);


        System.out.println(juliana.getCelular().getBateria());
        System.out.println(catalina.getCelular().getBateria());
        juliana.llamar(catalina, 15);
        juliana.llamar(catalina, 15);
        catalina.llamar(juliana, 300);
        System.out.println(juliana.getCelular().getBateria());
        System.out.println(catalina.getCelular().getBateria());
        juliana.llamar(catalina, 150);
        juliana.llamar(catalina, 150);
        juliana.llamar(catalina, 150);
        juliana.llamar(catalina, 150);
        juliana.llamar(catalina, 150);
        juliana.llamar(catalina, 150);
        juliana.llamar(catalina, 150);
        juliana.llamar(catalina, 150);
        juliana.llamar(catalina, 150);
        juliana.llamar(catalina, 150);
        juliana.llamar(catalina, 150);
        juliana.llamar(catalina, 150);
        juliana.llamar(catalina, 150);
        juliana.llamar(catalina, 150);
        juliana.llamar(catalina, 150);
        juliana.llamar(catalina, 150);
        juliana.llamar(catalina, 150);
        juliana.llamar(catalina, 150);
        juliana.llamar(catalina, 150);
        juliana.llamar(catalina, 150);
        catalina.llamar(juliana, 450);
        System.out.println(juliana.getCelular().getBateria());
        System.out.println(catalina.getCelular().getBateria());
        System.out.println(iphone.estaApagado());
        System.out.println(motorolaU9.estaApagado());

        catalina.getCelular().recargarCelular();
        juliana.getCelular().recargarCelular();

        System.out.println(catalina.getCelular().estaApagado());
        System.out.println(juliana.getCelular().estaApagado());
    }
}
