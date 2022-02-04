package com.codethales.modificadoresdeacesso.modificadorfinal.test;

import com.codethales.modificadoresdeacesso.modificadorfinal.domainmodel.Carro;
import com.codethales.modificadoresdeacesso.modificadorfinal.domainmodel.Comprador;
import com.codethales.modificadoresdeacesso.modificadorfinal.domainmodel.Ferrari;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro("BMW");
        Ferrari ferrari = new Ferrari();
        Comprador comprador = new Comprador();

        // Não é possível fazer ou alterar uma referência a outro objeto Comprador
        // porque ele foi definido como uma constante através do modificador final.
        //carro.COMPRADOR = new Comprador();

        System.out.println(carro.getNome() +"\n"+ Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);

        //Mas posso alterar o valor dos atributos da classe
        comprador.setName("Juarez");
        System.out.println(comprador.getName());

        //Esse padrão de projeto (conhecido como singleton), é útil quando não quero criar mais de uma instância do objeto da classe.
        //Por exemplo, Quando é criada uma classe que vai lidar com uma conexão com banco de dados, e várias classes podem
        //abrir uma conexão com esta mesma lógica, eu não preciso criar outro objeto.
        //Basta usar a mesma instância que já está criada e que não é alterada.


    }
}
