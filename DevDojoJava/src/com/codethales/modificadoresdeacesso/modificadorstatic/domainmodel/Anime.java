package com.codethales.modificadoresdeacesso.modificadorstatic.domainmodel;

public class Anime {
    private String name;
    private static int[] episodes; //A palavra static faz com que este atributo pertença à classe e não a uma instância.

    //Esse é um bloco de inicialização estático. Quando um objeto for instanciado, ele será executado,
    // antes mesmo do construtor ser chamado.
     static{
        episodes = new int[10];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
        for (int ep : Anime.episodes) {
            System.out.print("Charpter " + ep + " - ");
        }
    }
    // ORDEM DE EXECUÇÃO:
    /* 0 - Bloco de inicialização STATIC é executado qndo a JVM compila a classe;
     * 1 - Alocado espaço em memória para o objeto;
     * 2 - Cada atributo da classe é criado e inicializado com valores default ou o que for passado como argumento;
     * 3 - Construtor é executado*/

    //É justamente por causa da ordem de execução, que atributos não estáticos não podem ser chamados dentro de blocos estáticos.
    //Quando o bloco é compilado, ainda não foi alocado espaço em memória para o objeto e os atributos ainda não foram inicializados.

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
        Anime.episodes = episodes;
    }
}
