package com.codethales.associacao.exercicio.domainmodel;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario seminario;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprimir() {
        System.out.println("--- CADASTRO DE PROFESSORES ---");
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Especialidade do professor: " + this.especialidade);

        if (seminario != null) {
            System.out.println("--- Seminário agendados para " + this.nome + " ---");
            System.out.println("Tema: " + seminario.getTitulo());
            System.out.print("Local: ");
            seminario.getEndereco().imprimir();
        }

        if (this.seminarios == null && this.seminario == null) {
            System.out.println("Este professor ainda não está agendado para nenhum seminário");
        } else {
            if (this.seminarios != null) {
                System.out.println("--- Seminários agendados para " + this.nome + " ---");
                for (Seminario seminario : seminarios) {
                    System.out.println("Tema: " + seminario.getTitulo());
                    System.out.print("Local: ");
                    seminario.getEndereco().imprimir();
                }
            }
            System.out.println();
        }
    }

        public String getNome () {
            return nome;
        }

        public void setNome (String nome){
            this.nome = nome;
        }

        public String getEspecialidade () {
            return especialidade;
        }

        public void setEspecialidade (String especialidade){
            this.especialidade = especialidade;
        }

        public Seminario getSeminario () {
            return seminario;
        }

        public void setSeminario (Seminario seminario){
            this.seminario = seminario;
        }

        public Seminario[] getSeminarios () {
            return seminarios;
        }

        public void setSeminarios (Seminario[]seminarios){
            this.seminarios = seminarios;
        }
    }
