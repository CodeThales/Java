package com.codethales.ifelsestatements.test;

public class Condicionais01 {
    public static void main(String[] args) {

        boolean condicao = true;
        if (condicao) {
            System.out.println("Dentro do if");
        } else {
            System.out.println("Fora do if");
        } //prints Dentro do if
        System.out.println("Fim do primeiro if else statement");
        System.out.println("---------------------------------");
        condicao = false;
        if (condicao) {
            System.out.println("Dentro do if");
        } else {
            System.out.println("Fora do if");
        }//prints Fora do if
        System.out.println("Fim do segundo if else statement");

    }
}
