package com.codethales.classesabstratas.test;

import com.codethales.classesabstratas.domainmodel.Desenvolvedor;
import com.codethales.classesabstratas.domainmodel.Funcionario;
import com.codethales.classesabstratas.domainmodel.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {

        //Há um método calculaBonus() sendo chamado diretamente no construtor.
        Funcionario gerente = new Gerente("Zoro", 2000);
        Funcionario desenvolvedor = new Desenvolvedor("Nami", 5000);

        //O calculaBonus de gerente é sobre salario + 5%
        System.out.println(gerente);

        //O calculaBonus de desenvolvedor é sobre salario + 10%
        System.out.println(desenvolvedor);

    }
}
