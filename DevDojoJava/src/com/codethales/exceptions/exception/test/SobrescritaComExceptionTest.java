package com.codethales.exceptions.exception.test;

import com.codethales.exceptions.exception.domain.Funcionario;
import com.codethales.exceptions.exception.domain.LoginInvalidoException;
import com.codethales.exceptions.exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        //O método salvar() da superclasse Pessoa obriga o tratamento das excessões.
        try {
            pessoa.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //O método salvar() foi sobrescrito na classe Funcionario e não obriga o tratamento das excessões.
        funcionario.salvar();
    }
}
