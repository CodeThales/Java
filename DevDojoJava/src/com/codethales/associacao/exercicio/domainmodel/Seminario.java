package com.codethales.associacao.exercicio.domainmodel;

public class Seminario {
    private String titulo;
    private Endereco endereco;
    private Aluno aluno;
    private Professor professor;
    private Aluno[] alunos;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Endereco endereco) {
        this.titulo = titulo;
        this.endereco = endereco;
    }

    public Seminario(String titulo, Endereco endereco, Aluno[] alunos) {
        this.titulo = titulo;
        this.endereco = endereco;
        this.alunos = alunos;
    }

    public Seminario(String titulo, Endereco endereco, Aluno aluno, Professor professor) {
        this.titulo = titulo;
        this.endereco = endereco;
        this.aluno = aluno;
        this.professor = professor;
    }

    public void imprimir() {
        System.out.println("--- CADASTRO DE SEMINÁRIO ---");
        System.out.println("TEMA: " + this.titulo);
        if(professor == null){
            System.out.println("Preletor a ser confirmado");
        } else {
            System.out.println("Preletor: " + professor.getNome() + " | " + "Especializado em " +  professor.getEspecialidade());
        }
        System.out.println("--- Local de realização do seminário --- ");
        endereco.imprimir();
        if (aluno != null) {
            System.out.println("--- Aluno Matriculado ---");
            System.out.println("Nome: " + aluno.getNome() + " | " + "Idade: " + aluno.getIdade());
        }

        if (alunos == null && aluno == null) {
            System.out.println("Ainda não temos alunos matriculados neste seminário.");
        } else if(alunos != null && aluno == null) {
            System.out.println("--- Alunos Matriculados ---");
            for (Aluno aluno : alunos) {
                System.out.println("Nome: " + aluno.getNome() + " | " + "Idade: " + aluno.getIdade());
            }
        }
        System.out.println();
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
