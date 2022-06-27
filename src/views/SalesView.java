package views;


import models.Product;
import utils.Validator;

import java.util.Scanner;

// View
public class SalesView {


    String title;
    public String name;
    public int quantity;
    public double price;


    Scanner scanner;


    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.

    public SalesView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);
        title = "Введите наименование товара: ";
        System.out.println(title);
        name = Validator.validateName(scanner);
        title = "Введите количество: ";
        System.out.println(title);
        quantity = Validator.validateQuantityInput(scanner);
        title = "Введите цену: ";
        System.out.println(title);
        price = Validator.validatePriceInput(scanner);
        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
