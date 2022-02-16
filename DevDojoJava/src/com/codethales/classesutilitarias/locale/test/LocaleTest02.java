package com.codethales.classesutilitarias.locale.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        //Como saber a formatação de lingua, data, moeda, numeros etc. do meu sistema operacional
        System.out.println(Locale.getDefault());//no meu caso prints pt_BR

        //Para saber os tipos de formatação de países e linguas:
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }
        System.out.println();

        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }
    }
}
