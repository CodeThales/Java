package com.codethales.estruturasderepeticao.whiledowhile;

import java.util.Scanner;

public class WhileTest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 3){
            System.out.println("*****************************" +
                    "\nEscolha a opção desejada" +
                    "\n[1] Calcular imposto" +
                    "\n[2] Depositar salário" +
                    "\n[3] Sair do Sistema");

            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Imposto calculado com sucesso.");
                    break;
                case 2:
                    System.out.println("Depósito realizado com sucesso.");
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
                    break;
            }

        }
        System.out.println("Volte sempre!");
    }
}
