package com.codethales.polimorfismo.domainmodel;

public class Computer extends Product {

    public static final double TAX = 0.2;

    public Computer(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating computer tax...");
        return this.price * TAX;
    }

}
