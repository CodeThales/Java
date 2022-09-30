package com.estudos.polimorfismo;

public class LeiteQuente extends Bebida {

    public LeiteQuente(){
        super("Leite Quente", true);
    }

    @Override
    public void preprarar() {
        System.out.println("Pegando o leite;");
        System.out.println("Colocando o leite no copo;");
        System.out.println("Adoçando o leite;");
    }
}
