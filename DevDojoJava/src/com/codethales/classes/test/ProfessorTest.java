package com.codethales.classes.test;

import com.codethales.classes.domainmodel.Professor;

import java.util.List;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.setName("William");
        professor.setAge(35);
        professor.setGender('M');

        professor.printDados();

    }
}
