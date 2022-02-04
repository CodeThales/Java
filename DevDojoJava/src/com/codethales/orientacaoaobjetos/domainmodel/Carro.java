package com.codethales.orientacaoaobjetos.domainmodel;

public class Carro {
    public String name;
    public String modelo;
    public int ano;

    public void getDados(){
        System.out.println("Nome: " + name);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
