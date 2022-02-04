package com.codethales.enumeracoes.domainmodel;

//enum é um tipo especial de classe, que contém apenas atributos estáticos.
//No caso deste exemplo, DEBITO e CREDITO são atributos da classe TiPoPagamento que é um enum.
//Estes atributos possuem métodos específicos que estão sobrescrevendo o método calcularDesconto.
public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    //Quando um método é criado apenas com a função de ser sobrescrito,
    //ele deve ser assinado com abstract e não pode conter corpo.
    public abstract double calcularDesconto(double valor);
}
