package com.codethales.exceptions.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        openConnection();

    }

    private static String openConnection(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando arquivo");
        }
        return null;
    }
}
