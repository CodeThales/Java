package com.codethales.classesutilitarias.date.test;

import java.text.DateFormat;
import java.util.Calendar;

//A classe DateFormat é abstract então não pode ser instanciada.
public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[]df = new DateFormat[7]; //Como neste caso é um array, é possível criar uma instância.

        //Alguns modos de formatação
        df[0] = DateFormat.getInstance(); //returns 11/02/2022 19:02
        df[1] = DateFormat.getDateInstance(); //returns 11 de fev de 2022
        df[2] = DateFormat.getDateInstance(DateFormat.SHORT); //returns 11/02/2022
        df[3] = DateFormat.getDateInstance(DateFormat.MEDIUM); //returns 11 de fev de 2022
        df[4] = DateFormat.getDateInstance(DateFormat.LONG); //returns 11 de fevereiro de 2022
        df[5] = DateFormat.getDateInstance(DateFormat.FULL); //returns sexta-feira, 11 de fevereiro de 2022
        df[6] = DateFormat.getDateTimeInstance(); //returns 11 de fev de 2022 19:02:32

        for (DateFormat dateFormat: df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
