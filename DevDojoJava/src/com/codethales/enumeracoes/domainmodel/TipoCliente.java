package com.codethales.enumeracoes.domainmodel;

//Atributos da classe Enum, são sempre constantes.
public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    public final int VALOR;
    public final String NOME_RELATORIO;

    TipoCliente(int valor, String nomeRelatorio){
        this.VALOR = valor;
        this.NOME_RELATORIO = nomeRelatorio;
    }

    //Um método para retornar um TipoCliente baseado em uma variável
    public static TipoCliente getTypeByReport(String reportName){
        for (TipoCliente clientType : values()){
            if(clientType.getReportName().equals(reportName)){
                return clientType;
            }
        }
        return null;
    }

    public String getReportName(){
        return NOME_RELATORIO;
    }
}
