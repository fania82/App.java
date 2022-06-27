import controllers.ProductController;
import models.Product;
import views.SalesView;

import java.util.Scanner;

// Входная точка в программу/приложение
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SalesView view = new SalesView(scanner);
        Product model = new Product(view.name, view.quantity, view.price);
        ProductController controller = new ProductController(model, view);
        controller.runApp();
    }
}
