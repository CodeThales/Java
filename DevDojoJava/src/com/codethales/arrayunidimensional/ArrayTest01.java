package com.codethales.arrayunidimensional;

import java.util.Scanner;

public class ArrayTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas notas você deseja lançar?");
        int qtdNotas = sc.nextInt();
        double[] notas = new double [qtdNotas];
        double somaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Adicione a " + (i+1) + "ª nota: ");
            double nota = sc.nextDouble();
            somaNotas += nota;
            notas[i] = nota;
        }

        System.out.println("*** Notas lançadas ***");
        for (int i = 0; i < notas.length ; i++) {
            System.out.println("Nota " + (i+1) + ": " + notas[i]);
        }

        double media = somaNotas / qtdNotas;
        System.out.println("****************************************");
        System.out.println("A soma das notas da turma é " + somaNotas);
        System.out.println("A média da turma é " + media);
    }
}
