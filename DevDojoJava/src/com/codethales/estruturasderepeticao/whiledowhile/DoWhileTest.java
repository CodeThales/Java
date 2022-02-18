package com.codethales.estruturasderepeticao.whiledowhile;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        int continuar = 1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("PLAYER 1: Digite um múmero de 1 a 10");
            int num1 = sc.nextInt();
            System.out.println("PLAYER 2: Digite um múmero de 1 a 10");
            int num2 = sc.nextInt();
            System.out.println("Números iguais? " + (num1 == num2));
            System.out.println("Deseja continuar jogando? " +
                    "\n[1]SIM \n[2]NÃO");
            continuar = sc.nextInt();
        }while(continuar == 1);
        System.out.println("Fim do jogo.");
    }
}
