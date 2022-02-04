package com.codethales.orientacaoaobjetos.test;

import com.codethales.orientacaoaobjetos.domainmodel.Estudante;
import com.codethales.orientacaoaobjetos.domainmodel.ImpressoraEstudante;

public class EstudanteTest03 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.setName("Maya");
        estudante.setAge(3);
        estudante.setGender('F');

        estudante2.setName("Thaynara");
        estudante2.setAge(29);
        estudante2.setGender('F');

        //Aqui estou usando o método printDados() criado dentro da classe Estudante para imprimir name, age e gender.
        //Estou passando tipos primitivos como argumento.
        System.out.println("printDados(param primitive type ) de estudante");
        estudante.printDados(estudante.getName(), estudante.getAge(), estudante.getGender());
        System.out.println("-------------");
                //ou
        System.out.println("printDados() de estudante");
        estudante.printDados();
        System.out.println("-------------");

        System.out.println("printDados() de estudante2");
        estudante2.printDados();
        System.out.println("-------------");

        //Aqui estou usando o método imprime() criado dentro da classe ImpressoraEstudante para imprimir name, age e gender
        //Mas aqui estou passando tipo de referência como argumento. O resultado é o mesmo.
        System.out.println("imprime(param var de referência) de estudante2");
        impressora.imprime(estudante2);

    }
}
