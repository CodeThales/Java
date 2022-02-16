package com.codethales.classesutilitarias.numberformat.test;

import java.text.NumberFormat;
import java.util.Locale;

//A classe NumberFormat é abstrata!
public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();//returns default R$ 100.000.000,21
        nfa[1] = NumberFormat.getCurrencyInstance(localePT);//returns R$ 100.000.000,21
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);//returns ￥100,000,000
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);//returns 100.000.000,21 €
        double valor = 100_000_000.2130;
        for(NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.format(valor));
        }

    }
}
