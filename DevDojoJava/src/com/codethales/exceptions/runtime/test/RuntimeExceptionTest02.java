package com.codethales.exceptions.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {

        System.out.println(division(0, 5));
    }

    //Esse método se não tratado pode lançar uma ArithmeticException pois não existe divisão por 0.
    //Por ser uma RuntimeException, não é obrigatório o tratamento, mas é aconselhável.
    private static int division(int a, int b) {
        if(a == 0 || b == 0){
            throw new ArithmeticException("Um número não pode ser dividido por 0.");
        }
        return a/b;
    }
}
