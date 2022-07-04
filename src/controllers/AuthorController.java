package controllers;

import models.Author;
import models.Book;
import models.Genre;
import views.AuthorView;
import views.BookView;
import views.GenreView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static utils.Validator.validateActionNumberInput;

public class AuthorController {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static List<Author> AUTHORS = new ArrayList<>();

    static void chooseAuthorAction() throws IOException {
        System.out.println("Choose action: 1 - Add new author, 2 - delete an author, 3 - print all created authors, 4 - exit");
        int chooseActionForAuthors = validateActionNumberInput();
        while (chooseActionForAuthors != 4) {

            switch (chooseActionForAuthors) {
                case 1:
                    Author author = AuthorView.getAuthorInputs();
                    AUTHORS.add(author);
                    System.out.println("New author is added");
                    break;
                case 2:
                    BookView.printAuthors(AUTHORS);
                    System.out.println("input index for remove");
                    int removeIndex = Integer.parseInt(READER.readLine());
                    AUTHORS.remove(removeIndex);
                    break;
                case 3:
                    BookView.printAuthors(AUTHORS);
                    break;
            }
            System.out.println("Choose action: 1 - Add new author, 2 - delete an author, 3 - print all created authors, 4 - exit");
            chooseActionForAuthors = Integer.parseInt(READER.readLine());
        }
    }
}
