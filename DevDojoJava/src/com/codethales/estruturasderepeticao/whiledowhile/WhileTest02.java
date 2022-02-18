package com.codethales.estruturasderepeticao.whiledowhile;

import java.util.Scanner;

public class WhileTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos fazer uma contagem de zero até o número que você digitar, mas só dos ímpares!");
        System.out.println("Escolha agora seu número: ");
        int escolha = sc.nextInt();
        int contador = 0;
        while (contador <= escolha) {
            if (contador % 2 != 0) {
                System.out.println(contador);
            }
            contador++;
        }
        System.out.println("Fim da contagem.");
    }
}
