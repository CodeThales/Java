package com.codethales.modificadoresdeacesso.modificadorstatic.domainmodel.test;

import com.codethales.modificadoresdeacesso.modificadorstatic.domainmodel.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        /* O atributo velLimite foi definido como static, por isso pode ser acessado diretamente através da classe
        * sendo dispensável a criação de uma variável de instância.
        * Isso acontece porque um atributo static pertence a classe, não a um objeto de instância. Ou seja,
        * se fizer c1.setVelLimite = 100, todas as outras instancias também receberão este mesmo valor,
        * pois o valor foi alterado na classe e não na instância.
        *Ex:
        */

        System.out.println(Carro.getVelLimite()); //retorna 250 pq está setado no atributo da classe
        Carro.setVelLimite(180);
        System.out.println(Carro.getVelLimite()); // retorna 180
    }
}
