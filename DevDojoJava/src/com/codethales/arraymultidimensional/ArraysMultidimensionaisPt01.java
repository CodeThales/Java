package com.codethales.arraymultidimensional;

public class ArraysMultidimensionaisPt01 {
    public static void main(String[] args) {

        //       array[base '3 linhas']['3 colunas']
        int [][] array = new int [3][3];

        array[0][0] = 10;
        array[0][1] = 20;
        array[0][2] = 30;

        array[1][0] = 40;
        array[1][1] = 50;
        array[1][2] = 60;

        array[2][0] = 70;
        array[2][1] = 80;
        array[2][2] = 90;

        //Iterando sobre array multidimensional com for
        for(int arrBase = 0; arrBase < array.length; arrBase++){
            System.out.println("\n-----");
            for(int num = 0; num < array[arrBase].length; num++){
                System.out.println(array[arrBase][num]);
            }
        }
    }
}
