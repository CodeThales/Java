package com.codethales.classesabstratas.domainmodel;

/* A palavra abstract impede a classe de ser instanciada. Ela se torna algo como um template.
* Essa ação é muito útil em casos onde desejamos que a classe seja utilizada apenas com o intuito de ser herdada
* para que seus atributos e métodos sejam utilizados por suas classes filhas.
* Neste exemplo, um Funcionário nunca deverá ser instanciado, considerando que Funcionário é uma abastração muito alta,
* uma generalização de tipos de funcionários, assim como a classe Pessoa, que é uma abstração ainda mais alta.
* O que queremos na verdade, são objetos que herdam caracteristias de um Funcionário, como gerente, desenvolvedor, etc.
*/
public abstract class Funcionario extends Pessoa {
    protected String name;
    protected double salary;

    public Funcionario(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculaBonus();
    }

    /* NO caso dos métodos abstratos, eles obrigam que as classes filhas implementem alguma versão desse método.
    * Neste exemplo, eu quero que todos os 'tipos' de funcionários (gerente, desenvolvedor, etc.) tenham um cálculo
    * específico de bônus, sem correr o risco de alguma subclasse não o implementar, recebendo o cálculo de bonus
    * default  que viria da super classe Funcionário. Por isso também, métodos astract não possuem corpo.
    */
    public abstract void calculaBonus();

    @Override
    public void imprimir() {
        System.out.println("Imprimindo...");
    }
}
