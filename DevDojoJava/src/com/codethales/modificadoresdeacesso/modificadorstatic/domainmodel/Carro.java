package com.codethales.modificadoresdeacesso.modificadorstatic.domainmodel;

public class Carro {
    private String nome;
    private double velMax;
    // O modificar de acesso static, faz com que o atributo pertença à classe.
    // Todos os objetos compartilharão do mesmo valor. Caso altere uma instância, na verdade não é a
    // instância que está sendo alterada, e sim o atributo da classe.
    private static double velLimite = 250;

    public Carro(String nome, double velMax) {
        this.nome = nome;
        this.velMax = velMax;
    }

    public void imprime(){
        System.out.println("----------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Vel Máx: " + this.velMax);
        System.out.println("Vel Limite: " + Carro.velLimite); // O atributo deve ser acesado desta forma porque é static
        // Isso quer dizer que o valor pertence à classe e não à uma variável de instância/referência.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelMax() {
        return velMax;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    public static double getVelLimite() {
        return velLimite;
    }

    public static void setVelLimite(double velLimite) {
        Carro.velLimite = velLimite;
    }
}
