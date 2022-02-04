package com.codethales.orientacaoaobjetos.domainmodel;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){

        System.out.println("Name: " + estudante.getName());
        System.out.println("Age: " + estudante.getAge());
        System.out.println("Gender: " + estudante.getGender());

    }
}
