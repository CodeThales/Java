package com.codethales.estruturasderepeticao.foreforeach;

import java.util.Scanner;

public class ForTest02 {
    public static void main(String[] args) {
        System.out.println("Digite um número para ver sua tabuada");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }
    }
}
