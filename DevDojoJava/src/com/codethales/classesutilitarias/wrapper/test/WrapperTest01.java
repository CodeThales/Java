package com.codethales.classesutilitarias.wrapper.test;

import java.util.List;

//Wrappers é uma classes utilitária que encapsula tipos primitivos transformando-os em objetos.
public class WrapperTest01 {
    public static void main(String[] args) {

        //Tipos primitivos
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        //Para criar um wrapper é só começar o tipo com primitivo com letra maiúscula (com exceção do int e do char)
        //Esta forma é chamada de autoboxing - Deixo o Java transformar um tipo primitivo em wrapper.
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        //unboxing é quando deixo o Java converter automaticamente um wrapper em um tipo primitivo.
        //int i = intW;

        //Os tipos primitivos não possuem métodos pq não são objetos
        //intP. não chama nenhum método

        //Os tipos wrapper possuem métodos pq são objetos
        //intW.toString(); aqui chamei o método toString() como exemplo

        //As classes wrapper são fundamentais para poder trabalhar com coleções porque elas aceitam apenas objetos.
        List<Integer> list;//Correto
        //List<int> list1; Errado e não compila

    }
}
