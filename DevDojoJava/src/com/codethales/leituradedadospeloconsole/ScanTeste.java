package com.codethales.leituradedadospeloconsole;

import java.util.Scanner;

public class ScanTeste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("------- SOFTWARE DE PREVISÃO DO FUTURO --------");
        System.out.println("Digite sua pergunta e eu responderei SIM ou NÃO");

        String pergunta = scan.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }

    }
}
