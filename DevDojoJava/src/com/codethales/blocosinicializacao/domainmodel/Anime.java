package com.codethales.blocosinicializacao.domainmodel;

public class Anime {
    private String name;
    private int[] episodes;

    //Esse é um bloco de inicialização de instância não estático. Toda vez que um objeto for instanciado, ele será executado,
    // antes mesmo do construtor ser chamado. Isso quer dizer que se eu instanciar 3 objetos Anime, esse bloco será executado 3 vezes.
    {
        episodes = new int[10];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
        for (int ep : this.episodes) {
            System.out.print("Charpter " + ep + " - ");
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int[] episodes) {
        this.episodes = episodes;
    }
}
