package com.codethales.exceptions.exception.domain;

//Criando minha própria excessão e forçando o tratamento para os usuários dessa classe.
public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {
        super("Login inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
