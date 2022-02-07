package com.codethales.polimorfismo.domainmodel;

public class Tomato extends Product {

    public static final double TAX = 0.1;
    private String expirationDate;

    public Tomato(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating tomato tax...");
        return this.price * TAX;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
