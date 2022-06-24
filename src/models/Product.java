package models;


import base.Fiscal;
import base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product implements Fiscal, Income {

    public static final double TAX = 0.05;
    // Объявление полей модели
    private String name;
    private int quantity;
    private double price;

    // Налоговоу ставку объявите в виде константы


    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Обеспечьте доступ к полям модели через getters и setters
    // здесь ...
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // Переопределите методы реализуемых интерфейсов.



    // Расчёт дохода от продаж, до уплаты налога.
    // здесь ...
    @Override
    public double calculateGrossRevenue(int quantity, double price) {
        double calculatedGrossRevenue = quantity * price;
        return calculatedGrossRevenue;
    }


    // Расчёт суммы налога с продаж.
    // здесь ...
    @Override
    public double calculateTax (double calculatedGrossRevenue, double tax) {
        double taxValue = calculatedGrossRevenue * TAX;
        return taxValue;
    }


    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...
    @Override
    public double calculateNetRevenue(double calculatedGrossRevenue, double taxValue) {
        return calculatedGrossRevenue - taxValue;
    }
}
