package controllers;

import models.Product;
import utils.Rounder;
import utils.Validator;
import views.SalesView;

public class ProductController {

    Product model;
    SalesView view;

    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();
        double grossResult = model.calculateGrossRevenue(view.quantity, view.price);
        double taxResult = model.calculateTax(grossResult, Product.TAX);
        double netResult = model.calculateNetRevenue(grossResult, taxResult);
        view.getOutput("Analyzed product is: " + view.name);
        view.getOutput("Total gross revenue amount is: " + Rounder.performRounding(grossResult));
        view.getOutput("Total tax amount is: " + Rounder.performRounding(taxResult));
        view.getOutput("Total net revenue amount is: " + Rounder.performRounding(netResult));
    }
}
