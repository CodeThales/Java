package com.codethales.orientacaoaobjetos.test;

import com.codethales.orientacaoaobjetos.domainmodel.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("André");
        pessoa.setAge(35);
        pessoa.getPessoaData();

        System.out.println("---------------");
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setPessoaData("Marcos", 17);
        pessoa2.getPessoaData();

    }
}
