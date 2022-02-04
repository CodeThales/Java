package com.codethales.associacao.test;

import com.codethales.associacao.domainmodel.Jogador;
import com.codethales.associacao.domainmodel.Time;

public class JogadorTest {
    public static void main(String[] args) {

        Time time1 = new Time("Seleção Brasileira");
        Time time2 = new Time("Seleção da Alemanha");
        Time time3 = new Time("Seleção da França");
        Time time4 = new Time("Seleção da Inglaterra");


        Jogador jogador1 = new Jogador("Pelé");
        jogador1.setTime(time1);

        Jogador jogador2 = new Jogador("Romário");

        Jogador jogador3 = new Jogador("Cafú");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador i : jogadores) {
            i.imprimir();
        }





    }


}
