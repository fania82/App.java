package controllers;
import models.Book;
import views.BookView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import static utils.Validator.validateActionNumberInput;

public class BookController {
    public static List<Book> BOOKS = new ArrayList<>();
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    static void chooseBookActions() throws IOException {
        System.out.println("Choose action: 1 - Add new book, 2 - delete book, 3 - print all created books, 4 - exit");
        int chooseActionForBooks = validateActionNumberInput();
        while (chooseActionForBooks != 4) {
            switch (chooseActionForBooks) {
                case 1:
                    Book book = BookView.getBookInputs();
                    BOOKS.add(book);
                    System.out.println("New book is added");
                    break;
                case 2:
                    BookView.printBooks(BOOKS);
                    System.out.println("input index for remove");
                    int removeIndex = Integer.parseInt(READER.readLine());
                    BOOKS.remove(removeIndex);
                    System.out.println("Book is removed");
                    break;
                case 3:
                    BookView.printBooks(BOOKS);
                    break;
            }
            System.out.println("Choose action: 1 - Add new book, 2 - delete book, 3 - print all created books, 4 - exit");
            chooseActionForBooks = Integer.parseInt(READER.readLine());
        }
    }
}
