package com.codethales.associacao.exercicio.domainmodel;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String pais;

    public Endereco(String rua, int numero, String bairro, String pais) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.pais = pais;
    }

    public void imprimir(){
        System.out.println("Rua: " + this.rua + ". nº " + this.numero);
        System.out.println("Bairro: " + this.bairro + " - " + this.pais);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
