package com.codethales.estruturascondicionais.ifelsestatements;

import java.util.Scanner;

//Cálculo do imposto de renda baseado na tabela de 2022.
public class Condicionais06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Digite a idade do aluno: ");
        int idade = sc.nextInt();
        if (idade <= 10) {
            System.out.println(nome + " participará da categoria INFANTIL.");
        } else if (idade <= 15) {
            System.out.println(nome + " participará da categoria JUVENIL.");
        } else if (idade <= 19) {
            System.out.println(nome + " participará da categoria PRÉ-ADULTO.");
        } else {
            System.out.println(nome + " participará da categoria ADULTO.");
        }
    }
}
