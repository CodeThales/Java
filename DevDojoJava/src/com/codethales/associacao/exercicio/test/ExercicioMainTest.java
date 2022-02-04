package com.codethales.associacao.exercicio.test;

import com.codethales.associacao.exercicio.domainmodel.Aluno;
import com.codethales.associacao.exercicio.domainmodel.Endereco;
import com.codethales.associacao.exercicio.domainmodel.Professor;
import com.codethales.associacao.exercicio.domainmodel.Seminario;

public class ExercicioMainTest {
    public static void main(String[] args) {

        Seminario seminarioJava = new Seminario("Tudo sobre Java", new Endereco("Rua das goiabas", 32, "Juçara", "Brasil"));
        Seminario seminarioPython = new Seminario("Automação com Python", new Endereco("Rua da cobra preta", 557, "Florestal", "Brasil"));
        Seminario[] seminariosCriados = {seminarioJava, seminarioPython};

        Aluno aluno1 = new Aluno("Thales", 32);
        Aluno aluno2 = new Aluno("Sara", 37);
        Aluno[] alunos = {aluno1, aluno2};

        Professor professor1 = new Professor("William", "Spring Data");
        Professor professor2 = new Professor("Gustavo", "Python");
        Professor[] professores = {professor1, professor2};


        seminarioJava.setProfessor(professor1);
        seminarioJava.setAluno(aluno1);
        seminarioJava.imprimir();

        seminarioPython.setProfessor(professor2);
        seminarioPython.setAluno(aluno2);
        seminarioPython.imprimir();




    }
}
