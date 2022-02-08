package com.codethales.exceptions.exception.domain;

import java.io.FileNotFoundException;

public class Pessoa {
    //Este método obriga o tratamento destas exceptions quando for chamado.
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando Pessoa");
    }
}
