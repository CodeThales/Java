package com.codethales.orientacaoaobjetos.domainmodel;

public class Estudante {

    private String name;
    private int age;
    private char gender;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public void printDados(String name, int age, char gender){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public void printDados(){
        System.out.println(this.getName());
        System.out.println(this.getAge());
        System.out.println(this.getGender());
    }

}
