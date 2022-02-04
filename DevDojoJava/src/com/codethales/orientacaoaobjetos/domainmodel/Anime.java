package com.codethales.orientacaoaobjetos.domainmodel;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String studio;

    //Contrutores nos forçam a seguir determinadas regras.
    //Neste caso, para criar um objeto do tipo Anime, é obrigatório passar o name como argumento no ato da instanciação.
    public Anime(String name, String type, int episodes){
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    //Caso queira criar um objeto sem obrigatóriamente passar os argumentos, basta fazer uma sobrecarga de construtor
    public Anime(){}

    //Para fazer uma sobrecarga de construtor chamando outro construtor, a sintaxe é:
    public Anime(String name, String type, int episodes, String studio){
        this(name, type, episodes); //Esta linha está chamando o construtor que recebe os argumentos name, type e episodes
        this.studio = studio;
    }

    public void printAnimeData(){
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Episodes: " + this.episodes);
        System.out.println("Studio: " + this.studio);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
