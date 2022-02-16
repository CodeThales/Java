package com.codethales.classesutilitarias.calendar.test;

import java.util.Calendar;
import java.util.Date;

//A classe Calendar está deprecated. Estou vendo apenas a título didático
//e para lidar com sistemas legados porque o Java lançou novas classes para trabalhar com tempo.
public class CalendarTest01 {

    //Calendar é uma classe abstrata, portanto não pode ser instanciada.
    public static void main(String[] args) {

        //Para trabalhar com Calendar, podemos chamá-lo através do seus métodos que retorna uma instância da classe
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        //returns java.util.GregorianCalendar[time=1644582400503,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="America/Sao_Paulo",offset=-10800000,dstSavings=0,useDaylight=false,transitions=93,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=26,SECOND=40,MILLISECOND=503,ZONE_OFFSET=-10800000,DST_OFFSET=0]
        //Então precisamos fazer algum tratamento:
        Date d = c.getTime();
        System.out.println(d);//returns Fri Feb 11 09:29:22 BRT 2022

        //Alguns métodos úteis:

        //Para saber o primeito dia da semana:
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana.");
        }

        //Para saber vários outros tipos de dia:
        System.out.println(c.get(Calendar.DAY_OF_WEEK));//returns o dia da semana atual (no caso de hoje que é sexta returns 6)
        System.out.println(c.get(Calendar.DAY_OF_MONTH));//returns o dia do mês atual (no caso de hoje que é 11)
        System.out.println(c.get(Calendar.DAY_OF_YEAR));//returns o dia do ano (no caso de hoje que é o 42º dia do ano)
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));//returns em qual semana do mês atual estamos (no caso estamos na segunda semana returns 2)

        //Para adicionar tempo ao tempo atual:
        c.add(Calendar.DAY_OF_MONTH, 2);//adiciona 2 dias ao dia atual
        c.add(Calendar.HOUR, 2);//adiciona 2 horas à hora atual

    }
}
