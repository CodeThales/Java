package com.codethales.classesutilitarias.date.test;

import java.util.Date;

//A classe Date está praticamente toda obsoleta. Estou vendo apenas a título didático
//e para lidar com sistemas legados porque o Java lançou novas classes para trabalhar com datas.
public class DateTest01 {
    public static void main(String[] args) {
        //Date trabalha com o tipo long dentro dele que representa o tempo em milissegundos desde 1970.
        // Ou seja, se passar um long como parametro, ele retorna uma data.
        Date date = new Date(1_000_000_000L);
        System.out.println(date); //returns Mon Jan 12 10:46:40 BRT 1970. O print()chama automaticamente o toString() fazendo esta conversão

        //Se quiser pegar os milissegundos usamos o getTime() que returns um long:
        System.out.println(date.getTime()); //returns 1000000000

        //Se quiser saber qual long representa o dia de hoje:
        date = new Date();
        System.out.println(date.getTime()); //returns um long com a data e hora da requisição ex: 1644501861340
        System.out.println(date); //returns Thu Feb 10 11:05:05 BRT 2022 que foi o momento em que fiz a chamada.
        //O print está fazendo automaticamente System.out.println(date.toString());

    }
}
