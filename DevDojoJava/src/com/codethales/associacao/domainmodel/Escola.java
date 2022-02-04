package com.codethales.associacao.domainmodel;

public class Escola {

    private String name;
    private Professor[] professores;

    public void imprime(){
        System.out.println("Escola " + this.name);
        if(professores == null) return;
        for (Professor professor : professores) {
            System.out.println("Professor(a) " + professor.getName());
        }
        System.out.println();

    }

    public Escola(String name) {
        this.name = name;
    }

    public Escola(String name, Professor[] professores) {
        this.name = name;
        this.professores = professores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
