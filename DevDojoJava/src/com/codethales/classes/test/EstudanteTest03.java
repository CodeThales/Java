package com.codethales.classes.test;

import com.codethales.classes.domainmodel.Estudante;

public class EstudanteTest03 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.setName("Maya");
        estudante.setAge(3);
        estudante.setGender('F');

        estudante.printDados();
    }
}
