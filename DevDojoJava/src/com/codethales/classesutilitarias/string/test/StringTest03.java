package com.codethales.classesutilitarias.string.test;

//Entendendo a classe StringBuilder
public class StringTest03 {
    public static void main(String[] args) {

        String nome = "Thales Ribeiro";
        nome.concat(" - Working with Java");

        //Quando trabalhamos com StringBuilder o conceito de String imutável desaparece
        // porque StringBuilder não é uma String.
        //By defalt a StringBuilder tem capacity de 16 caracteres. Então posso passar valor como parametro:
        //StringBuilder sb = new StringBuilder(35);

        StringBuilder sb = new StringBuilder("Thales Ribeiro"); //A StringBuilder possue o métódo toString(), então
        System.out.println(sb); //ele consegue transformar o sb em uma String e printar no terminal.

        //Para atribuir algum valor à uma variável StringBuilder deve se utilizar o método append().
        //sb.append(); Este método aceita diversos tipos como parâmetro.

        //Um dos motivos de usar StringBuilder é por sua capacidade de transfomar uma String
        // sem criar um novo espaço no poll de strings.
        sb.append(" - Working with Java");
        System.out.println(sb);

    }
}
