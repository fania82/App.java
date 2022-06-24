package controllers;

import models.Product;
import utils.Rounder;
import utils.Validator;
import views.SalesView;

// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        // 2) вызов методов расчетов доходов и налога;
        // 3) округление расчетных значений;
        // 4) вывод расчетов по заданному формату.

        System.out.println("Analyzed product is: " + model.getName());
        double grossResult = model.calculateGrossRevenue(model.getQuantity(), model.getPrice());
        double taxResult = model.calculateTax(grossResult, Product.TAX);
        double netResult = model.calculateNetRevenue(grossResult, taxResult);
        String output = "[здесь должен быть вывод по формату]";
        view.getOutput(output);
        System.out.println("Total gross revenue amount is: " + Rounder.performRounding(grossResult));
        System.out.println("Total tax amount is: " + Rounder.performRounding(taxResult));
        System.out.println("Total net revenue amount is: " + Rounder.performRounding(netResult));
    }
}
