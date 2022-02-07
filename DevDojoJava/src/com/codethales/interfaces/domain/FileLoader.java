package com.codethales.interfaces.domain;

public class FileLoader implements DataLoader, DataRemover {

    public static final int MAX_DATA_SIZE = 30;

    //Método abstrato da interface dataLoader. É obrigatório de implementação.
    @Override
    public void load() {
        System.out.println("Loading file data.");
    }

    //Método abstrato da interface dataRemover. É obrigatório de implementação.
    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivos.");
    }

    //Método concreto da interface dataLoader. Não é obrigatório de implementação.
    @Override
    public void checkPermission() {
        System.out.println("Checando permisões nos arquivos.");
    }

    //Este método não pode ser sobrescito da interface DataLoader porque ele é estático.
    public static void retrieveMaxDataSize(){
        System.out.println("Método retrieveMaxDataSize da classe FileLoader. Atributo estático MAX_DATA_SIZE = " + FileLoader.MAX_DATA_SIZE);
    }
}
