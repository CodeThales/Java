package com.codethales.associacao.domainmodel;

public class Jogador {

    private String name;
    private Time time; //Aqui começa a associação/realcionamento entre jogador e time.
    // A regra aqui é que um jogador pode fazer parte de apenas um time.
    // Um jogador poderá se cadastrar sem ter um time.

    public void imprimir() {
        System.out.println("Nome: " + this.name);
        if(time != null){
            System.out.println("Time: " + time.getName());
        }
        System.out.println();
    }

    //Para criar um jogar, é preciso apenas o nome. O time pode ser escolhido posteriormente.
    //Caso fosse obrigatório o cadastro com um tipo, bastaria exigir a passagem de argumento na assinatura do construtor.
    public Jogador(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
