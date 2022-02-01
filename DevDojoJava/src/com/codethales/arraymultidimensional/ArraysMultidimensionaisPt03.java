package com.codethales.arraymultidimensional;

public class ArraysMultidimensionaisPt03 {
    public static void main(String[] args) {
        //Array com 3 posições(linhas) sem informar a quantidade de 'colunas'
        //      arrayInt = [base/ 3 linhas][null colunas]
        int[][] arrayInt = new int[3][];

        //Atribuindo index para um Array Multidimensional com número de indices diferentes
        arrayInt[0] = new int[2]; //array base[0] ficou com 2 colunas
        arrayInt[1] = new int[3]; //array base[1] ficou com 3 colunas
        arrayInt[2] = new int[6]; //array base[2] ficou com 6 colunas

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

        //Este array já poderia ser inicializado diretamente com atribuição de valores:
        int [][] arrayInt2= {{10, 20},{15, 30, 45,},{20, 40, 60, 80, 100, 120}};

        for (int[] arrayBase2 : arrayInt2) {
            System.out.println("\n-----");
            for (int num : arrayBase2){
                System.out.print(num + " ");
            }
        }
    }
}
