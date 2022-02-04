package com.codethales.enumeracoes.test;

import com.codethales.enumeracoes.domainmodel.Cliente;
import com.codethales.enumeracoes.domainmodel.TipoCliente;
import com.codethales.enumeracoes.domainmodel.TipoPagamento;

public class EnumTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Kakashi", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Tsubara", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        //Output mostrando que o resultado é diferente de acordo com o método de cada atributo.
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        //Aqui estou chamando um método que vai me retornar o tipo de cliente,
        //baseado no valor de uma variável do atributo da classe
        TipoCliente tipoCliente = TipoCliente.getTypeByReport("Pessoa Fisica");
        System.out.println(tipoCliente);
    }
}
