package com.codethales.orientacaoaobjetos.domainmodel;

public class Funcionario {

    private String name;
    private int age;
    private double[] salaries;
    private char gender;

    public void init(String name, int age, double[] salaries) {
        this.name = name;
        this.age = age;
        this.salaries = salaries;
    }

    public void init(String name, int age, double[] salaries, char gender) {
        this.init(name, age, salaries);
        this.gender = gender;
    }

    public void printData() {
        if (age < 0) {
            System.out.println("Name: " + this.name);
            System.out.println("Idade inválida!");
        } else {

            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Gender: " + this.gender);
            if (salaries == null) {
                return;
            }
            for (double salary : salaries) {
                System.out.println("Salary: " + salary + " ");
            }
            getMedia();
        }
    }

    private void getMedia() {
        double media = 0;
        double soma = 0;
        for (double sal : salaries) {
            soma += sal;
        }
        media = soma / salaries.length;
        System.out.println("O valor total recebido foi de R$" + soma + " e a média é R$" + media);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = -1;
        } else {
            this.age = age;
        }
    }

//    public double[] getSalaries() {
//        return salaries;
//    }

    public void setSalaries(double[] salary) {
        this.salaries = salary;
    }
}
