package com.codethales.modificadoresdeacesso.modificadorstatic.domainmodel.test;

import com.codethales.modificadoresdeacesso.modificadorstatic.domainmodel.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime2 = new Anime();
        Anime anime3 = new Anime();

        //A classe Anime foi criada com um bloco de inicialização static e o atributo episodes também é static,
        // então mesmo instanciando 3 objetos, o código que está dentro do bloco de inicialização estático
        // será executado apenas uma vez, e não 3.
        // Caso seja adicionado um bloco de inicialiação não estático, o bloco estático permanecerá sendo executado
        // apenas uma vez, mas o não estático será executado 3 vezes porque 3 objetos foram instanciados.
    }
}
