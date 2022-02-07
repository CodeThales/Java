package com.codethales.interfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover {

    public static final int MAX_DATA_SIZE = 20;

    //Método abstrato da interface dataLoader. É obrigatório de implementação.
    @Override
    public void load() {
        System.out.println("Loading data base data.");
    }

    //Método abstrato da interface dataRemover. É obrigatório de implementação.
    @Override
    public void remove() {
        System.out.println("Removendo dados do data base.");
    }

    //Método concreto da interface dataLoader. Não é obrigatório de implementação.
    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados.");
    }

    //Este método não pode ser sobrescito da interface DataLoader porque ele é estático.
    public static void retrieveMaxDataSize(){
        System.out.println("Método retrieveMaxDataSize da classe DataBaseLoader. Atributo estático MAX_DATA_SIZE = " + DataBaseLoader.MAX_DATA_SIZE);
    }
}
