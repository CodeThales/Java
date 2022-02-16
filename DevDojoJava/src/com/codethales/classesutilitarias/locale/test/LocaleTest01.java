package com.codethales.classesutilitarias.locale.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

//Classe usada para trabalhar com internacionalização formatando datas, moedas e números
public class LocaleTest01 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        //O construtor da classe Locale pede argumento
        Locale localeItaly = new Locale("it", "IT");//Italiano da Itália
        Locale localeSwish = new Locale("it", "CH");//Italiano da Suiça
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly); //Formatação baseada na localização
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSwish);
        DateFormat df3= DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);


        System.out.println("Data atual na Itália: " + df1.format(calendar.getTime()));//prints venerdì 11 febbraio 2022
        System.out.println("Data atual na Suiça: " + df2.format(calendar.getTime()));//prints venerdì, 11 febbraio 2022
        System.out.println("Data atual na India: " + df3.format(calendar.getTime()));//prints शुक्रवार, 11 फ़रवरी 2022
        System.out.println("Data atual na Japão: " + df4.format(calendar.getTime()));//prints 2022年2月11日金曜日
        System.out.println("Data atual na Holanda: " + df5.format(calendar.getTime()));//prints vrijdag 11 februari 2022

        //Alguns labels são traduzidos. Utilizando este método, os países são exibitos na lingua do Sistema operacional
        System.out.println(localeItaly.getDisplayCountry());//prints Itália
        System.out.println(localeSwish.getDisplayCountry());//prints Suiça
        //Mas se eu passar uma localização como argumento
        System.out.println(localeIndia.getDisplayCountry(localeJapan));//prints インド - mostra o país(india) escrito em japones
        System.out.println(localeJapan.getDisplayCountry(localeHolanda));//prints Japan - mostra o país(Japão) escrito em Holandes
        System.out.println(localeHolanda.getDisplayCountry(localeIndia));//prints नीदरलैंड - mostra o país(Holanda) escrito em indiano

    }

}
