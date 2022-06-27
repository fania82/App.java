package models;


import base.Fiscal;
import base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product implements Fiscal, Income {

    public static final double TAX = 0.05;
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity() {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    @Override
    public double calculateGrossRevenue(int quantity, double price) {
        double calculatedGrossRevenue = quantity * price;
        return calculatedGrossRevenue;
    }

    @Override
    public double calculateTax(double calculatedGrossRevenue, double tax) {
        double taxValue = calculatedGrossRevenue * TAX;
        return taxValue;
    }

    @Override
    public double calculateNetRevenue(double calculatedGrossRevenue, double taxValue) {
        return calculatedGrossRevenue - taxValue;
    }
}
