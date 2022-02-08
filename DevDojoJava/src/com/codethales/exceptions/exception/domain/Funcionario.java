package com.codethales.exceptions.exception.domain;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {

    //Um método sobrescrito não precisa obrigatóriamente implementar as mesmas excessões da superclasse
    @Override
    public void salvar(){
        System.out.println("Salvando Funcionário");;
    }
}
