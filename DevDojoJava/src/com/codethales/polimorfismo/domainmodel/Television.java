package com.codethales.polimorfismo.domainmodel;

public class Television extends Product {

    public static final double TAX = 0.05;

    public Television(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating television tax...");
        return this.price * TAX;
    }
}
