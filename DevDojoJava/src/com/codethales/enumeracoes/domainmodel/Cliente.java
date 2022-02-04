package com.codethales.enumeracoes.domainmodel;

public class Cliente {

    private String name;
    private TipoCliente type; //Esse tipo é uma classe Enum
    private TipoPagamento typePgto;

    public Cliente(String name, TipoCliente type, TipoPagamento typePgto) {
        this.name = name;
        this.type = type;
        this.typePgto = typePgto;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nameCliente: '" + name + '\'' +
                ", typeConstante: " + type + '\'' +
                ", typeInteiro: " + type.VALOR + '\'' +
                ", typeRelatório: " + type.NOME_RELATORIO + '\'' +
                ", typePgto: " + typePgto + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TipoCliente getType() {
        return type;
    }

    public void setType(TipoCliente type) {
        this.type = type;
    }
}