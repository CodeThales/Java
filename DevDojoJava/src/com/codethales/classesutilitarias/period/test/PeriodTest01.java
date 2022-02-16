package com.codethales.classesutilitarias.period.test;

import java.time.LocalDate;
import java.time.Period;

//Utilizada para trablhar com quantidade de tempo. Ex quando precisamos saber a diferença de tempo entre duas datas.
//Ela é baseada em dias meses e anos.
public class PeriodTest01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);

        Period p1 = Period.between(now, nowAfterTwoYears);//returns P2Y7D
        System.out.println(p1);
    }
}
