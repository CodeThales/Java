package com.codethales.orientacaoaobjetos.test;

import com.codethales.orientacaoaobjetos.domainmodel.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setName("Marcos");
        funcionario.setAge(70);
        funcionario.setSalaries(new double[]{1000, 2000, 3000});

        funcionario.printData();
        System.out.println("--------------------------------------------------");

        Funcionario funcionario2 = new Funcionario();
        funcionario2.init("Carlos", 37,new double[]{1200, 3400, 3800, 4500},'M');
        funcionario2.printData();

    }
}
