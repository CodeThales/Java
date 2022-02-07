package com.codethales.polimorfismo.service;

import com.codethales.polimorfismo.domainmodel.Computer;
import com.codethales.polimorfismo.domainmodel.Product;
import com.codethales.polimorfismo.domainmodel.Tomato;

public class TaxReport {

// Estes métodos estão comentados porque criei um método mais genérico generateReport() que evita a repetição de código.

// O polimorfismo nos permite usar um mesmo método e retornar valores/atributos específicos de cada objeto.
// Ou seja, eu tenho um método que pede como argumento uma variável do tipo de uma superclasse,
// mas que aceita uma variável do tipo de uma subclasse e executa o método sem problemas.

//    public static void computerTaxReport(Computer computer){
//        System.out.println("--- Computer Report ---");
//        double tax = computer.calculateTax();
//        System.out.println("Computer name: " + computer.getName());
//        System.out.println("Computer Price: " + computer.getPrice());
//        System.out.println("Computer tax: " + tax);
//    }
//
//    public static void tomatoTaxReport(Tomato tomato){
//        System.out.println("--- Tomato Report ---");
//        double tax = tomato.calculateTax();
//        System.out.println("Tomato name: " + tomato.getName());
//        System.out.println("Tomato  Price: " + tomato.getPrice());
//        System.out.println("Tomato  tax: " + tax);
//    }

    public static void generateReport(Product product){
        System.out.println("--- Product Report ---");
        double tax = product.calculateTax();
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: R$" + product.getPrice());
        System.out.println("Product Tax: R$" + tax);
        if(product instanceof Tomato) {
            Tomato tomato = (Tomato) product;
            System.out.println("Expiration Date: " + tomato.getExpirationDate());
        }

    }

}
