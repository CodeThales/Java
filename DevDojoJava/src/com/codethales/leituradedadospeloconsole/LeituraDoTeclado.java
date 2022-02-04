package com.codethales.leituradedadospeloconsole;

import java.util.Scanner;

public class LeituraDoTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo");
        String name = scan.nextLine();

        System.out.println("Digite sua idade abaixo");
        int age = scan.nextInt();

        System.out.println("Digite seu sexo abaixo");
        char gender = scan.next().charAt(0);

        System.out.println("--- RELATÓRIO ---");
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Gênero: " + gender);
    }
}
