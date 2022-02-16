package com.codethales.classesutilitarias.localdatetime.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//A classe LocalDateTime é basicamente uma junção das classes LocalDate e LocalTime, tendo acesso a todos aqueles métodos
//Além de outros recursos.
public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);//prints data and current time: 2022-02-12T16:21:45.380011200

        // vamos ver uma forma de juntar essas duas classes:
        LocalDate date = LocalDate.of(2022, 02, 12);
        LocalTime time = LocalTime.of(9, 45, 00);
        System.out.println(date.atTime(time));//prints 2022-02-12T09:45




    }
}
