package com.codethales.classesutilitarias.simpledateformat.test;

import java.text.SimpleDateFormat;
import java.util.Date;

//Praticamente todas as classes que fazem formatação de dados está dentreo da classe java.text
//A classe SimpleDateFormat oferece mais recursos que classe DateFormat, sendo mais flexível se torna melhor de ser utilizada.
public class SimpleDateFormatTest {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date())); //prints 2022.02.12 d.C. at 11:05:49 BRT

        //Formatação customizada mostrando a flexibilidade da classe SimpleDateFormat
        String pattern2 = "'Amsterdam' dd 'de' MMMM 'de' YYYY";
        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
        System.out.println(sdf2.format(new Date())); //prints Amsterdam 12 de fevereiro de 2022



    }
}
