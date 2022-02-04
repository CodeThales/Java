package com.codethales.orientacaoaobjetos.domainmodel;

public class Pessoa {
    private String name;
    private int age;

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getPessoaData() {
        System.out.println("Name: " + this.name + "\nAge: " + this.age);
    }

    public void setPessoaData(String name, int age){
        this.name = name;
        this.age = age;
    }
}
