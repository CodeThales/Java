package com.codethales.orientacaoaobjetos.test;

import com.codethales.orientacaoaobjetos.domainmodel.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        //Foi criado um construtor para a Class Anime que exige a passagem de alguns parâmetros: name, type and episodes.
        Anime anime = new Anime("Dragon Ball", "TV Series", 135);
        anime.printAnimeData();
        System.out.println("______________");

        //Aqui vou usar um construtor que não exige passagem de argumentos para criar o objeto de instância
        Anime anime2 = new Anime();
        anime2.setName("YU-YU HAKUSHO");
        anime2.setType("Mangá");
        anime2.setEpisodes(99);
        anime2.printAnimeData();
        System.out.println("--------------");

        //Aqui estou uma sobrecarga de construtor, onde um construtor chama o outro construtor.
        Anime anime3 = new Anime("Pokemon", "TV Series", 250, "Akuma Studios");
        anime3.printAnimeData();
    }
}
