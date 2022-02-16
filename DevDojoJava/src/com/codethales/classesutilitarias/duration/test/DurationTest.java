package com.codethales.classesutilitarias.duration.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

//Utilizada para trablhar com quantidade de tempo. Ex quando precisamos saber a diferença de tempo entre duas datas.
//Ela é baseada em segundos e nano segundos
public class DurationTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime afterTwoYears = LocalDateTime.now().plusYears(2);
        Duration duration1 = Duration.between(now, afterTwoYears);//returns PT17520H
        System.out.println(duration1);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);
        Duration duration2 = Duration.between(timeNow, timeMinus7Hours);//returns PT-7H
        System.out.println(duration2);



        System.out.println();

    }
}
