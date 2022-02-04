package com.codethales.heranca.test;

import com.codethales.heranca.domainmodel.Endereco;
import com.codethales.heranca.domainmodel.Funcionario;
import com.codethales.heranca.domainmodel.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa("Kakaroto");

        endereco.setRua("Rua 7");
        endereco.setCep("01234-567");

        //pessoa.setName("");
        pessoa.setCpf("111.111.111-11");
        pessoa.setEndereco(endereco);
        pessoa.imprimir();

        System.out.println();

        Funcionario funcionario = new Funcionario("Kuririn");
        //funcionario.setName();
        funcionario.setCpf("222.222.222-22");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(8700D);
        funcionario.imprimir();

    }
}
