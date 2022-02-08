package com.codethales.exceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {

//Existem tipos de exceptions que não ocorrem em tempo de execução, portanto o código não compila caso ocorra.
//São chamadas de checked e o tratamento é obrigatório. Ex: IOException, SQLException, MalformedURLException

        creteNewFile();
    }

    // Eu bloqueei a opção de gravar dentro deste diretório, portanto quanto tentar executar vai lançar a exceção:
    // java.io.IOException: Acesso negado
    private static void creteNewFile(){
        File file = new File("archive\\test.txt");
        try{
            boolean isCreated = file.createNewFile();
            System.out.println("Created file " + isCreated);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
