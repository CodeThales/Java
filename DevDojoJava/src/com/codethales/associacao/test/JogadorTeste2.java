package com.codethales.associacao.test;

import com.codethales.associacao.domainmodel.Jogador;
import com.codethales.associacao.domainmodel.Time;

public class JogadorTeste2 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Cafú");
        Time time = new Time("Seleção brasileira");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        System.out.println("--- Jogadores ---");
        jogador.imprimir();
        jogador2.imprimir();

        System.out.println("--- Time ---");
        time.setJogadores(jogadores);
        time.imprimir();
    }


}
