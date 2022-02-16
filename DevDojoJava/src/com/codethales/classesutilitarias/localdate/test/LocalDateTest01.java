package com.codethales.classesutilitarias.localdate.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

//Classe atualizada para tratar datas inserida no Java 8. É uma classe abstrata.
public class LocalDateTest01 {
    public static void main(String[] args) {
        //Para trabalhar apenas com data, pois não suporta hora.
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 27);

        //COm a classe LocalDate dá para pegar a data atual
        LocalDate now = LocalDate.now();

        System.out.println(now);//prints 2022-02-12
        System.out.println(date);//prints 2020-01-27
        System.out.println(date.getYear());//prints 2020
        System.out.println(date.getMonthValue());//prints 1
        System.out.println(date.getDayOfWeek());//prints Monday
        System.out.println(date.getDayOfMonth());//prints 27
        System.out.println(date.lengthOfMonth());//para saber quantos dias tem o mes - prints 31.
        System.out.println(date.isLeapYear());//para saber se o ano é bissexto - prints true.

        //Se precisar de algo mais esprecífico, é possível usar algumas APIs que estão dentro de método get.
        //Existem diversas API, neste exemplo vou usar a ChronoField que está no pacote java.time.temporal.ChronoField
        System.out.println(date.get(ChronoField.YEAR_OF_ERA));//prints 2020
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));//prints 27




    }
}
