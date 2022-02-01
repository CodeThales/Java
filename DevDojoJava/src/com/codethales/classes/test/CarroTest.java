package com.codethales.classes.test;

import com.codethales.classes.domainmodel.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.name = "VW";
        carro.modelo = "GOL";
        carro.ano = 1998;

        carro.getDados();

        System.out.println("**************************");

        Carro carro2 = new Carro();
        carro2.name = "Mustang";
        carro2.modelo = "GT500";
        carro2.ano = 1968;

        carro2.getDados();
    }
}
