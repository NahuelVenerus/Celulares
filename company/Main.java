package com.company;

import com.company.Celular.Iphone;
import com.company.Celular.MotorolaU9;

public class Main {

    public static void main(String[] args) {

        MotorolaU9 celularJuliana = new MotorolaU9();
        System.out.println(celularJuliana);
        celularJuliana.llamar(5, 50);
        System.out.println(celularJuliana);
        System.out.println(celularJuliana.estaApagado());
        celularJuliana.recargarCelular();
        System.out.println(celularJuliana);

        Iphone celularCatalina = new Iphone();
        System.out.println(celularCatalina);
        celularCatalina.llamar(0, 500);
        System.out.println(celularCatalina);
        System.out.println(celularCatalina.estaApagado());
        celularCatalina.recargarCelular();
        System.out.println(celularCatalina);



    }
}
