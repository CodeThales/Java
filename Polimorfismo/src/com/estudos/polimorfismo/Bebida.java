package com.estudos.polimorfismo;

public class Bebida {

    private String name;

    private boolean isAquecida;

    public Bebida(String name, boolean isAquecida) {
        this.name = name;
        this.isAquecida = isAquecida;
    }

    public String getName() {
        return name;
    }

    public boolean isAquecida() {
        return isAquecida;
    }

    public void preprarar(){
//        System.out.println("Preparando uma bebida GENÉRICA.");
    }
}
