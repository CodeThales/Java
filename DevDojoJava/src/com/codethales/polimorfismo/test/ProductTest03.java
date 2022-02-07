package com.codethales.polimorfismo.test;

import com.codethales.polimorfismo.domainmodel.Computer;
import com.codethales.polimorfismo.domainmodel.Product;
import com.codethales.polimorfismo.domainmodel.Tomato;
import com.codethales.polimorfismo.service.TaxReport;

public class ProductTest03 {
    public static void main(String[] args) {
        Product computer = new Computer("PC TOP", 3000);
        Tomato tomato = new Tomato("American", 20);

        //Product tomato = new Tomato("American", 20); - Não pode ser feito pq o tipo Product não possue método setExpirationDate.
        tomato.setExpirationDate("11/12/2021");

        TaxReport.generateReport(computer);
        System.out.println();
        TaxReport.generateReport(tomato);
    }
}
