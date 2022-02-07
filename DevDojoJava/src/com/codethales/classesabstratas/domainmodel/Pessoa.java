package com.codethales.classesabstratas.domainmodel;

/* Quando uma classe abstrata extends outra classe abastrata, ela não precisa implementar os método abstratos
 * da sua super classe; porém, a primeira classe concreta (seja ela filha ou neta, etc.) que extends de uma super classe
 * abstrata, esta precisará obrigatóriamente implementar os métodos abstratos da super classe.
 *
 * Neste exemplo, a classe abstrata Funcionário vai extender da classe Pessoa. A classe Funcionário não precisará
 * implentar o método imprimir() porque também é uma classe abstrata, mas as classes filhas de Funcionário
 * (Gerente e Desenvolvedor), estas serão obrigadas a implementar o abstract método imprimir() que existe apenas na classe
 * Pessoa, ainda que estas classes não estejam herdando diretamente da classe Pessoa, e sim de Funcionário.
 *
 * Já se eu implementar o método imprimir() na classe Funcionario, como um método concreto, ele não precisará mais ser
 * criado nas classes Gerente e Desenvolvedor, uma vez que estas subclasses estão herdando este método automaticamente.
 */
public  abstract class Pessoa {

    public abstract void imprimir();

}
