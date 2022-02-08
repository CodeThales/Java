package com.codethales.exceptions.exception.test;

import com.codethales.exceptions.exception.domain.LoginInvalidoException;

import java.util.Scanner;

//Utilizando a excessão LoginInvalidoException criada por mim.
public class LoginInvalidoExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    //Simulando um acesso com username e password
    private static void logar() throws LoginInvalidoException {
        Scanner scan = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";

        System.out.println("User: ");
        String userNameDigitado = scan.nextLine();
        System.out.println("Password: ");
        String userPasswordDigitado = scan.nextLine();

        if(!usernameDB.equals(userNameDigitado) || !senhaDB.equals(userPasswordDigitado)){
            throw new LoginInvalidoException("Usuário ou senha invállidos");
        }
        System.out.println("Usuário logado com sucesso!");
    }
}
