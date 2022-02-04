package com.codethales.orientacaoaobjetos.test;

import com.codethales.orientacaoaobjetos.domainmodel.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.setName("William");
        professor.setAge(35);
        professor.setGender('M');

        professor.printDados();

    }
}
