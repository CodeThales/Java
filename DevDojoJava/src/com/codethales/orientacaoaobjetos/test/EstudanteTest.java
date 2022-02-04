package com.codethales.orientacaoaobjetos.test;

import com.codethales.orientacaoaobjetos.domainmodel.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.setName("Thales");
        estudante1.setAge(32);
        estudante1.setGender('M');

        Estudante estudante2 = new Estudante();
        estudante2.setName("Thiago");
        estudante2.setAge(15);
        estudante2.setGender('M');

        estudante1.printDados(estudante1.getName(), estudante1.getAge(), estudante1.getGender());
        System.out.println("*******************");
        estudante2.printDados(estudante2.getName(), estudante2.getAge(), estudante2.getGender());
    }
}
