package com.codethales.exceptions.runtime.test;

public class RuntimeExceptionTest {
    public static void main(String[] args) {

//As RuntimeExceptions não precisam ser tratadas para o código compilar, mas ele vai lançar uma exceção.
//Esse tipo de exceção é chamada de unchecked e normalmente ocorre por algum erro do desenvolvedor.

        //Essas linhas vão gerar um NullPointerException que é um RuntimeException
//        Object object = null;
//        System.out.println(object.toString());

        //Essas linhas vão gerar um ArrayIndexOutOfBoundsException que também é um RuntimeException
//        int[] nums = {1, 2};
//        System.out.println(nums[5]);

    }
}
