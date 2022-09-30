package com.estudos.polimorfismo;

public class Suco extends Bebida {

    public Suco(){
        super("Suco", false);
    }

    @Override
    public void preprarar() {
        System.out.println("Pegando o copo;");
        System.out.println("Colocando o pó no copo;");
        System.out.println("Adicionando água;");
    }
}
