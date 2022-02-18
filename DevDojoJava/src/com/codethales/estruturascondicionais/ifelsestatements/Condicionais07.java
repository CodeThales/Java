package com.codethales.estruturascondicionais.ifelsestatements;

import java.util.Scanner;

public class Condicionais07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            System.out.println("Digite seu nome: ");
            String nome = sc.next().trim();
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            System.out.println("Digite seu sexo[M/F]: ");
            String sexo = sc.next().toUpperCase().trim().substring(0, 1);

            if (sexo.equals("M") && idade >= 18) {
                System.out.println("Nome: " + nome + " Idade: " + idade + " Sexo: " + sexo + "" +
                        ". Seu alistamento é obrigatório. Deseja se alistar agora [S/N]? ");
                String alistar = sc.next().toUpperCase().trim().substring(0, 1);
                if(alistar.equals("S")){
                    System.out.println("Alistamento realizado com sucesso.");
                } else {
                    System.out.println("Faça seu alistamento o mais rápido possível.");
                }
            } else if (sexo.equals("M") || sexo.equals("F") && idade < 18) {
                System.out.println("Nome: " + nome + " Idade: " + idade + " Sexo: " + sexo +
                        ". Seu alistamento não é permitido.");
            } else if (sexo.equals("F") && idade >= 18) {
                System.out.println("Nome: " + nome + " Idade: " + idade + " Sexo: " + sexo +
                        ". Seu alistamento é permitido. Deseja se alistar agora [S/N]? ");
                String alistar = sc.next().toUpperCase().trim().substring(0, 1);
                if(alistar.equals("S")){
                    System.out.println("Alistamento realizado com sucesso.");
                } else {
                    System.out.println("Obrigado por vir. Caso queira se alistar no futuro, por favor nos procure.");
                }
            } else {
                System.out.println("Nome: " + nome + " Idade: " + idade + " Sexo: " + sexo +
                        ". Você informou dados inválidos. Preencha novamente.");
            }

            System.out.println("Deseja informar novos dados? [S/N]: ");
            String novosDados = sc.next().toUpperCase().trim().substring(0, 1);
            if (novosDados.equals("S")) {
                repeat = true;
            } else {
                System.out.println("Finalizando o sistema.");
                repeat = false;
            }
        }

    }
}
