package com.codethales.exceptions.exception.test;

import com.codethales.exceptions.exception.domain.Reader1;
import com.codethales.exceptions.exception.domain.Reader2;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        readFile2();
    }

    //É possível passar mais de um recurso nessa sintaxe do try. Como as classes Reader1 e 2 implementam Closeable,
    //este método automaticamente fecha o recurso depois de utilizado.
    public static void readFile(){
        try(Reader1 reader1 = new Reader1();
            Reader2 reader2 = new Reader2()){

        }catch (IOException e){

        }
    }

    //Try com recursos. Desta forma ele fecha o arquivo automaticamente qndo termina de ser utilizado
    public static void readFile1(){
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){

        }catch (IOException e){

        }
    }

    //Bloco try catch convencional para ler um arquivo
    public static void readFile2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
