package com.codethales.associacao.test;

import com.codethales.associacao.domainmodel.Escola;
import com.codethales.associacao.domainmodel.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Angela");
        Professor professor2 = new Professor("Noemia");
        Professor professor3 = new Professor("Solange");

        Professor[] professores = {professor1, professor2, professor3};

        Escola escola = new Escola("Professor Maria Cristina");
        escola.setProfessores(professores);

        escola.imprime();

    }
}
