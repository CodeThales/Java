package com.codethales.estruturascondicionais.ifelsestatements;

public class Condicionais03 {
    public static void main(String[] args) {
        double salario = 5000;
        double resultado;
        if(salario > 4500){
            resultado = salario * 0.3D;
            System.out.println("Para um salário de R$" + salario + ", o aumento será de 30% que equivale a R$" + resultado);
        } else {
            resultado = salario * 0.15D;
            System.out.println("Para um salário de R$" + salario + ", o aumento será de 15% que equivale a R$" + resultado);
        }
        System.out.println("O valor do salário com aumento será de R$" + (salario + resultado));
    }
}
