package com.codethales.classesutilitarias.instant.test;

import java.time.Instant;
import java.time.LocalDateTime;

//A classe instant trabalha com nano segundos.
public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);//prints 2022-02-12T19:37:30.085577200Z (zulu representation que é uma representação neutra de horário usado pelas foças armadas)
        System.out.println(LocalDateTime.now());//prints 2022-02-12T16:37:30.148081300 (utf representation)
        System.out.println(now.getEpochSecond());//long prints 1644694923
        System.out.println(now.getNano());//int que representa o nano segunda daquele segundo. Prints 128284300
    }

}
