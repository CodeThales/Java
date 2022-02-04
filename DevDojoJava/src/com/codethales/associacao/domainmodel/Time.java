package com.codethales.associacao.domainmodel;

public class Time {
    private String name;
    private Jogador[] jogadores; // Aqui estou fazendo uma assiciação/relação entre time e jogadores.
    //A regra aqui é que um time pode ter vários jogadores, por isso o atributo jogadores é um array.

    public Time(String name) {
        this.name = name;
    }

    public Time(String name, Jogador[] jogadores) {
        this.name = name;
        this.jogadores = jogadores;
    }

    public void imprimir(){
        System.out.println(this.name);
        if(jogadores == null) return;
        for (Jogador jogador : jogadores) {
            System.out.println("Jogador: " + jogador.getName());
        }
        System.out.println();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
