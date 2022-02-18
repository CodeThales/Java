package com.codethales.estruturascondicionais.ifelsestatements;

//Cálculo do imposto de renda baseado na tabela de 2022.
public class Condicionais05 {
    public static void main(String[] args) {
        double salario = 3632.31;

        if(salario <= 1_903.98) {
            System.out.println("ISENTO");
        } else if(salario <= 2_826.65){
            System.out.println("Alíquota 7,5%. Parcela dedutível R$142,8");
        } else if(salario <= 3_751.05){
            System.out.println("Alíquota 15%. Parcela dedutível R$354,8");
        }else if(salario <= 4_664.68){
            System.out.println("Alíquota 22,5%. Parcela dedutível R$636,13");
        }else{
            System.out.println("Alíquota 27,5%. Parcela dedutível R$869,36");
        }
    }
}
