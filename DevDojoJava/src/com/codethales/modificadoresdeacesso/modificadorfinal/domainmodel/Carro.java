package com.codethales.modificadoresdeacesso.modificadorfinal.domainmodel;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador(); //A referência que COMPRADOR faz ao objeto Comprador nunca poderá ser alterada
    // por causa do modificador final, mas o valor dos atributos do objeto podem ser alterados.

    // O modificador static faz com que este atributo pertença à classe e não a uma instância.
    // O modificador final torna o atributo uma constante, ou seja, seu valor não pode ser alterado.
    // O identificador de uma constante deve ser escrito em uppercase e separado por _


    public Carro() {
    }

    public Carro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
