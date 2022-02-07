package com.codethales.polimorfismo.test;

import com.codethales.polimorfismo.domainmodel.Computer;
import com.codethales.polimorfismo.domainmodel.Television;
import com.codethales.polimorfismo.domainmodel.Tomato;
import com.codethales.polimorfismo.service.TaxReport;

public class ProductTest {
    public static void main(String[] args) {

        Computer computer = new Computer("Mac Book", 10000D);
        Tomato tomato = new Tomato("Italian",100D);
        Television tv = new Television("Samsung", 4500D);

        /*
        * O método GenerateReport() recebe como argumento objetos do tipo Product. Como as instâncias computer,
        * tomato e tv são subclasses de Produto, o método os aceita e executa sem problemas.
        * */

        TaxReport.generateReport(computer);
        System.out.println();

        TaxReport.generateReport(tomato);
        System.out.println();

        TaxReport.generateReport(tv);
        System.out.println();
    }
}
