package com.codethales.blocosinicializacao.test;

import com.codethales.blocosinicializacao.domainmodel.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        /*Como foi criado um bloco de inicialização na classe Anime, o que está lá dentro
        *(que no caso são capítulos do nosso anime) será executado independentemente de qual construtor for chamado.
        * O simples atos de criar a variável de instância anime fará com que o bloco de iniciaçização seja executado.
        * */
    }
}
