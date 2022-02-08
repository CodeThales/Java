package com.codethales.exceptions.error.test;

public class StackOverflowTest {

    //Um Error é um problema que ocorre na JVM que não é possível ser recuperado em tempo de execução.

    // Simulando um StackOverflowError
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }

//Aqui ocorre um estouro de memória porque o método fica se chamando infinitamente.
//Este é um exemplo de StackOverflowError. O terminal apresenta Exception in thread "main" java.lang.StackOverflowError
}
