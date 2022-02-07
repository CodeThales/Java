package com.codethales.interfaces.test;

import com.codethales.interfaces.domain.DataBaseLoader;
import com.codethales.interfaces.domain.DataLoader;
import com.codethales.interfaces.domain.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        //Métodos acontecendo no nível das classes.
        // Na interface são métodos abstratos então foram obrigatórios de implementação.
        dataBaseLoader.load();
        fileLoader.load();

        //Métodos acontecendo no nível das classes.
        // Na interface são métodos abstratos então foram obrigatórios de implementação.
        dataBaseLoader.remove();
        fileLoader.remove();

        //Métodos estão acontecendo no nível da interface dataLoader.
        //Na interface são métodos concretos, portando, foram implementados mas não eram obrigatórios.
        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        //Chamada do método estático da interface DataLoader.
        // Como o método é estático, ele pertence à classe então não pode ser chamado através de uma instância.
        DataLoader.retrieveMaxDataSize();

        //Chamada do método estático da classe DataBaseLoader.
        // Como o método é estático, ele pertence à classe então não pode ser chamado através de uma instância.
        DataBaseLoader.retrieveMaxDataSize();

        //Chamada do método estático da classe FileLoader.
        // Como o método é estático, ele pertence à classe então não pode ser chamado através de uma instância.
        FileLoader.retrieveMaxDataSize();

    }
}
