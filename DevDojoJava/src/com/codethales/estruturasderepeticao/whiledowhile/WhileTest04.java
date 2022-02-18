package com.codethales.estruturasderepeticao.whiledowhile;

import java.util.Scanner;

public class WhileTest04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String LOGIN = "Thales.Ribeiro";
        final String PASSWORD = "LearningJava";

        while (true){
            System.out.println("Digite seu usuário: ");
            String loginDigitado = sc.next();
            System.out.println("Digite sua senha: ");
            String passwordDigitado = sc.next();

            if(LOGIN.equals(loginDigitado) && PASSWORD.equals(passwordDigitado)){
                System.out.println("Acesso concedido");
                break;
            }
            System.out.println("Acesso negado");
        }
        System.out.println("Fim do programa");

    }
}
