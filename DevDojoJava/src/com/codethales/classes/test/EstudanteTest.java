package com.codethales.classes.test;

import com.codethales.classes.domainmodel.Estudante;

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

        estudante1.printDados();
        System.out.println("*******************");
        estudante2.printDados();
    }
}
