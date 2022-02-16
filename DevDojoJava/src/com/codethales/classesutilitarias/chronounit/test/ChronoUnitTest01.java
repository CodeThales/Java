package com.codethales.classesutilitarias.chronounit.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

//Classe usada para tratar coisas relacionadas a unidades de tempo
public class ChronoUnitTest01 {
    public static void main(String[] args) {

        //Com a classe period não é possível pegar a quantidade de meses baseado em quantidade de dias,
        // Ex. 58 dias representam quantas semanas? Por isso vamos usar a classe ChronoUnit
        LocalDateTime now = LocalDateTime.now();//data de hoje
        Period p = Period.ofWeeks(58);//quero representar 58 dias em semanas, mas essa classe não suporta e representa 0
        System.out.println(now.until(now.plusDays(p.getDays()), ChronoUnit.MONTHS));//prints 13 (58 dias tem 13 semanas)

        //É mais simples trabalhar com dias meses e anos com a classe ChronoUnit
        LocalDateTime myBirthday = LocalDateTime.of(1989, Month.AUGUST, 28, 05, 50,00);

        //Quanto tempo se passou do meu nascimento até hoje
        System.out.println(ChronoUnit.DAYS.between(myBirthday, now));//prints 11856
        System.out.println(ChronoUnit.WEEKS.between(myBirthday, now));//prints 1693
        System.out.println(ChronoUnit.MONTHS.between(myBirthday, now));//prints 389
        System.out.println(ChronoUnit.YEARS.between(myBirthday, now));//prints 32

    }
}
