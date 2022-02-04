package com.codethales.heranca.domainmodel;

//VER A CLASSE HERANÇATEST02
public class Pessoa {
    protected String name;
    protected String cpf;
    protected Endereco endereco;
    static{
        System.out.println("Dentro do bloco de inicialização static da classe Pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização não static1 da classe Pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização não static2 da classe Pessoa");
    }

    public Pessoa(String name) {
        System.out.println("Dentro do constructor da classe Pessoa");
        this.name = name;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço " + this.endereco.getRua() + " - CEP " + this.endereco.getCep());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
