package controllers;
import models.Book;
import views.BookView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static utils.Validator.validateActionNumberInput;

public class BookController {
    public static List<Book> BOOKS = new ArrayList<>();

    static void chooseBookActions() throws IOException {
        MainController.printAction("Book");
        int chooseActionForBooks = validateActionNumberInput();
        do {
            switch (chooseActionForBooks) {
                case 1 -> addBook();
                case 2 -> removeBook();
                case 3 -> printBookList();
            }
            MainController.printAction("Book");
            chooseActionForBooks = validateActionNumberInput();
        } while (chooseActionForBooks != 4);
    }

    private static void addBook() throws IOException {
        Book book = BookView.getBookInputs();
        BOOKS.add(book);
        System.out.println("New book is added");
    }

    private static void printBookList() {
        if (BOOKS.isEmpty()) {
            System.out.println("No one Book is exist. Please add at least one Book");
        } else {
            BookView.printBooks(BOOKS);
        }
    }

    private static void removeBook() {
        if (BOOKS.isEmpty()) {
            System.out.println("No one Book is exist. Please add at least one Book");
        } else {
            BookView.printBooks(BOOKS);
            System.out.println("For remove please input index");
            int removeIndex = validateActionNumberInput();
            BOOKS.remove(removeIndex);
            System.out.println("Book is removed");
        }
    }
}
