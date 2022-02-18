package com.codethales.estruturascondicionais.switchcase;

import java.util.Scanner;

public class SwitchTest02 {
    public static void main(String[] args) {
        final double CONTA_POUPANÇA = 0.05D;
        final double CONTA_CORRENTE = 0.02D;
        final double CONTA_INVESTIMENTO = 0.1D;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o tipo da sua conta " +
                "\n[1] Conta Poupança" +
                "\n[2] Conta Corrente" +
                "\n[3] Conta Investimento");
        int tipo = sc.nextInt();
        switch (tipo) {
            case 1:
                System.out.println("Conta Poupança tem " + CONTA_POUPANÇA + "% de juros.");
                break;
            case 2:
                System.out.println("Conta Corrente tem " + CONTA_CORRENTE + "% de juros.");
                break;
            case 3:
                System.out.println("Conta Investimento tem " + CONTA_INVESTIMENTO + "% de juros.");
                break;
            default:
                System.out.println("Valor inválido.");

        }
    }
}
