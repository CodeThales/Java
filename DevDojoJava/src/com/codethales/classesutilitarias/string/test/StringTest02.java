package com.codethales.classesutilitarias.string.test;

public class StringTest02 {
    public static void main(String[] args) {

        String nome = "   Luffy  ";
        String numeros = "012345";

        System.out.println(nome.charAt(0));//returns L - índice 0 do array
        System.out.println(nome.length());//returns 5 - o tamanho do array
        System.out.println(nome.replace("f", "l"));//returns Lully - troca todos os f do array por l
        System.out.println(nome.toLowerCase());// returns luffy - lower case
        System.out.println(nome.toUpperCase());//returns LUFFY - upper case
        System.out.println(nome.trim());// remove os espaços vazios do inicio e do fim da string

        System.out.println(numeros.length());//returns 6 - tamanho do array
        System.out.println(numeros.substring(0,3));//returns 012 - returns do indice 0 ao 3 exclusive.
        System.out.println(numeros.substring(3, numeros.length()));//returns 345 - returns do indice 3 ao tamanho do array
        System.out.println(numeros.substring(3));//returns 345 - returns do indice 3 ao tamanho do array by default

        String name = "samantha";
        String title = name.substring(0, 1).toUpperCase().concat(name.substring(1));//tornando a primeira letra da string em maiúscula
        System.out.println(title);//returns Samantha

        String frase = "o céu é azul por causa do reflexo dos mares";
        String fraseCapitalized = capitalizeString(frase);
        System.out.println(fraseCapitalized); //returns O Céu É Azul Por Causa Do Reflexo Dos Mares

    }
    //Método para capitalize string já que o Java não tem um método para isso :'(
    public static String capitalizeString(String frase) {
        char[] chars = frase.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i]) || chars[i]=='.' || chars[i]=='\'') { // You can add other chars here
                found = false;
            }
        }
        return String.valueOf(chars);
    }
}
