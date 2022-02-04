package com.codethales.heranca.domainmodel;

//VER A CLASSE HERANÇATEST02
public class Funcionario extends Pessoa {

    private double salario;

    static{
        System.out.println("Dentro do bloco de inicialização static da classe Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização não static1 da classe Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização não static2 da classe Funcionario");
    }

    public Funcionario(String name) {
        super(name);
        System.out.println("Dentro do construtor da classe Funcionario");
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Salário: R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
