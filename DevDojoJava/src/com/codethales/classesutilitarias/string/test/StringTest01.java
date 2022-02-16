package com.codethales.classesutilitarias.string.test;
// CONCEITOS
// Heap - Local onde todos os objetos são armazenados
// O Java armazena um espaço específico para guardar Strings que é chamado de pool de Strings e que fica dentro do heap.
// O Java faz isso baseado no conceito de String interning que, que faz com que as Strings sejam imutáveis, ou seja,
// se eu criar uma String pela segunda vez, ela não será duplicada; as duas variáveis de instância vão apontar para o
// mesmo objeto.
//
public class StringTest01 {
    public static void main(String[] args) {

        String nome1 = "William"; //Esta forma de criar uma String é chamada de String constant pool
        String nome2 = "William";
        System.out.println(nome1.equals(nome2)); //returns true pq o valor dos objetos é igual.
        System.out.println(nome1 == nome2); //returns true pq nome1 e nome2 estão fazendo referência ao mesmo objeto em memória "William"

        nome1.concat(" Suane");
        System.out.println(nome1); //prints "William" porque Strings são imutáveis. Neste exemplo, o que acontece é que
        // está sendo criado um novo objeto "William Suane" no poll de Strings, mas que não está sendo armazanado em
        // nenhuma variável. Mas posso armazenar:
        String nomeCompleto = nome1.concat(" Suane");
        System.out.println(nomeCompleto); //returns "William Suane"

        //As Strings são imutáveis, mas é possível fazer uma nova associação:
        System.out.println(nome1 = nome1.concat( " Suane")); //Agora nome1 faz referência ao novo objeto criado "William Suane"
        //Para fazer a verificação:
        System.out.println(nome1 == nome2); //returns false porque agora as variáveis fazem referência a difirentes objetos em memória.

        //Apesar de não ser usado e não ter objetivo prático, também posso criar um objeto do tipo String a titulo didático.
        //Neste caso estou criando um objeto String dentro do heap que não é armazenado no pool de strings, mas que acessa o valor de nome2
        //Resumindo, nome3 faz referência ao objeto William que está no heap, que encapsula William que está dentro do poll de Strings
        String nome3 = new String("William");
        System.out.println(nome2 == nome3);//returns false pq são objetos diferentes apesar de armazenarem o mesmo valor.
        System.out.println(nome2.equals(nome3));//returns true porque os valores são iguais

        //Resumindo, nome3 faz referência ao objeto William que está no heap, que encapsula William que está dentro do poll de Strings
        //Abaixo está a prova:
        System.out.println(nome2 == nome3.intern());//returns true pq nome2 está sendo comparado com o nome3 que está dentro do pool de strings


    }
}
