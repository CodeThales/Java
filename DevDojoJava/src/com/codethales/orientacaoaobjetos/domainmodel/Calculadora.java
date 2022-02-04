package com.codethales.orientacaoaobjetos.domainmodel;

public class Calculadora {
    //Método que recebe um array como parâmetro.
    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("A soma entre os numeros do array é: " + soma);
    }

    //Método que recebe um varArgs como parâmetro.
    //Por baixo dos panos, esse 'param int... numeros' está sendo transformado em um array.
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("A soma entre os numeros do varArgs é: " + soma);
    }
}
