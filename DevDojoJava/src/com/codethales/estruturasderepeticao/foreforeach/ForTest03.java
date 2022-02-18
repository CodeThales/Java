package com.codethales.estruturasderepeticao.foreforeach;

public class ForTest03 {
    public static void main(String[] args) {
        int tabuada = 1;
        while(tabuada <= 10){
            System.out.println("*************");
            System.out.println("TABUADA DO " + tabuada);
            for (int i = 1; i <= 10 ; i++) {
                System.out.println(tabuada + " X " + i + " = " + tabuada * i);
            }
            tabuada++;
        }

        System.out.println();
        //Ou com for aninhado:
        for (int i = 1; i <= 10; i++) {
            System.out.println("*************");
            System.out.println("TABUADA DO " + i);
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
        }
    }
}
