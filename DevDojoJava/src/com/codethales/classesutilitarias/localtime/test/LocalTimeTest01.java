package com.codethales.classesutilitarias.localtime.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23,32,12);//Uma hora escolhida
        LocalTime timeNow = LocalTime.now();//Hora atual do sistema operacional
        System.out.println(time); //prints 23:32:12
        System.out.println(timeNow);//prints 11:35:48.162145300

        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.HOUR_OF_DAY));
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.MAX);
    }
}
