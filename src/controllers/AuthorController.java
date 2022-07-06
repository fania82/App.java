package controllers;
import models.Author;
import views.AuthorView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static utils.Validator.validateActionNumberInput;

public class AuthorController {

    public static List<Author> AUTHORS = new ArrayList<>();

    static void chooseAuthorAction() throws IOException {
        MainController.printAction("Author");
        int chooseActionForAuthors = validateActionNumberInput();
        while (chooseActionForAuthors != 4) {
            switch (chooseActionForAuthors) {
                case 1 -> addAuthor();
                case 2 -> removeAuthor();
                case 3 -> printAuthorList();
            }
            MainController.printAction("Author");
            chooseActionForAuthors = validateActionNumberInput();
        }
    }

    private static void printAuthorList() {
        if (AUTHORS.isEmpty()) {
            System.out.println("No one Author is exist. Please add at least one Author");
        } else {
            AuthorView.printAuthors(AUTHORS);
        }
    }

    private static void removeAuthor() {
        if (AUTHORS.isEmpty()) {
            System.out.println("No one Author is exist. Please add at least one Author");
        } else {
            AuthorView.printAuthors(AUTHORS);
            System.out.println("For remove please input index");
            int removeIndex = validateActionNumberInput();
            AUTHORS.remove(removeIndex);
            System.out.println("Author is removed");
        }
    }

    private static void addAuthor() throws IOException {
        Author author = AuthorView.getAuthorInputs();
        AUTHORS.add(author);
        System.out.println("New author is added");
    }
}
