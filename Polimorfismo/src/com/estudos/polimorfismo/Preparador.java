package com.estudos.polimorfismo;


public class Preparador {

    public void prepararBebida(Bebida bebida){

        System.out.println("Preparando " + bebida.getName());

        bebida.preprarar();

        if(bebida.isAquecida()){
            System.out.println("Aquecendo a " + bebida.getName());
        }

        System.out.println("Sua bebida já está pronta");
    }
}
