package com.codethales.polimorfismo.test;

import com.codethales.polimorfismo.domainmodel.Computer;
import com.codethales.polimorfismo.domainmodel.Product;
import com.codethales.polimorfismo.domainmodel.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {

        Product product = new Computer("Ryzen9", 5000D);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.calculateTax());

        System.out.println();

        Product product2 = new Tomato("American", 20);
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.calculateTax());


    }
}
