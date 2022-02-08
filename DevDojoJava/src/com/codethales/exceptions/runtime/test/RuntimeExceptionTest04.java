package com.codethales.exceptions.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {

    //Exemplo de captura de múltiplas exceptions.
    //É importante lembrar que a exceção mais genérica deve ser tratada por último, senão as outras não serão executadas.
    public static void main(String[] args) {

        //Tratando exceções do tipo unchecked
        try {
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        }catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        }catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        //Tratando exceções do tipo checked com sintaxe multi catch em linha.
        try {
            talvezLanceException();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    //SQLException e FileNotFoundException são filhas de Exception, então poderia usar apenas um catch passando Exception.
    private static void talvezLanceException() throws SQLException, IOException {throw new IOException();}
}
