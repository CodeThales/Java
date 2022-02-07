package com.codethales.interfaces.domain;

public interface DataLoader {

    /* Interfaces foram criadas para prover iimplementação, por isso seus métodos não tem corpo, apenas assinatura.

    * Por padrão do Java, todos os métodos em uma interface são public abstract,
    * por isso não é obrigatório informar na assinatura do método.
    *
    * Porém, como sabemos, métodos abstratos forçam a sua implementação em subclasses; por isso, a partir do Java 8
    * se tornou possível criar métodos concretos (não abstratos) dentro das interfaces, para que a criação de novos métodos
    * dentro dela não quebrasse a aplicação de alguém que já a estivesse implementado, uma vez que métodos concretos
    * não são obrigatórios de implementação.
    *
    * Os métods em uma interface também podem set static, ou seja, são métodos que não permitem ser sobrescritos pois
    * pertencem à classe (neste caso, pertecem à interface).
    *
    * Todos os atributos de uma interface são por padrão, public static final, ou seja, são constantes.
    *
    */

    // Atributo estático
    public static final int MAX_DATA_SIZE = 10;

    // Método abstrato
    void load();

    // Método concreto
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    // Método estático
    public static void retrieveMaxDataSize(){
        System.out.println("Método retrieveMaxDataSize da interface DataLoader. Atributo estático MAX_DATA_SIZE = " + DataLoader.MAX_DATA_SIZE);
    }
}
