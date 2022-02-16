package com.codethales.classesutilitarias.numberformat.test;

import java.text.NumberFormat;
import java.util.Locale;

//A classe NumberFormat é abstrata!
public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();//returns default 100.000.000,213
        nfa[1] = NumberFormat.getInstance(localePT);//returns 100.000.000,213
        nfa[2] = NumberFormat.getInstance(localeJP);//returns100,000,000.213
        nfa[3] = NumberFormat.getInstance(localeIT);//returns 100.000.000,213
        double valor = 100_000_000.2130;
        for(NumberFormat numberFormat : nfa){
            //Para mudar a quantidade de casas decimais:
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

    }
}
