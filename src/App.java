import controllers.ProductController;
import models.Product;
import utils.Validator;
import views.SalesView;

import java.util.Scanner;

// Входная точка в программу/приложение
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Здесь создайте экземпляры Model, View и Controller,
        // на основании соответствующих конструкторов.

        String name = Validator.validateName(scanner);
        int quantity = Validator.validateQuantityInput(scanner);
        double price = Validator.validatePriceInput(scanner);

        Product model = new Product(name, quantity, price);
//        Product model = создать экземпляр
//        SalesView view = создать экземпляр
        SalesView view = new SalesView();

//        ProductController controller = создать экземпляр
        ProductController controller = new ProductController(model, view);

        // Запуск программы/приложения.
        // Раскомментированный код будет корректным после
        // правильной настройки приложения
        controller.runApp();
    }
}
