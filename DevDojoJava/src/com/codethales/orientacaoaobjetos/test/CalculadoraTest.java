package com.codethales.orientacaoaobjetos.test;

import com.codethales.orientacaoaobjetos.domainmodel.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};

        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1, 2, 3, 4, 5);

        /*A diferença entre trabalhar com array e varargs, é que com varArgs eu não preciso criar um array
        * O Array é criado automaticamente por baixo dos panos, o que facilita a sintaxe e era menos código
        */
    }
}
