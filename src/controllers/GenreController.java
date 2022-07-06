package controllers;
import models.Genre;
import views.GenreView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static utils.Validator.validateActionNumberInput;
import static views.GenreView.printGenres;

public class GenreController {

    public static List<Genre> GENRES = new ArrayList<>();

    static void chooseGenreAction() throws IOException {
        MainController.printAction("Genre");
        int chooseActionForGenres = validateActionNumberInput();
        while (chooseActionForGenres != 4) {
            switch (chooseActionForGenres) {
                case 1 -> addGenre();
                case 2 -> removeGenre();
                case 3 -> printGenreList();
            }
            MainController.printAction("Genre");
            chooseActionForGenres = validateActionNumberInput();
        }
    }

    private static void printGenreList() {
        if (GENRES.isEmpty()) {
            System.out.println("No one Genre is exist. Please add at least one Genre");
        } else {
            printGenres(GENRES);
        }
    }

    private static void removeGenre() {
        if (GENRES.isEmpty()) {
            System.out.println("No one genre is exist. Please add at least one Genre");
        } else {
            printGenres(GENRES);
            System.out.println("For remove please input index");
            int removeIndex = validateActionNumberInput();
            GENRES.remove(removeIndex);
            System.out.println("Genre is removed");
        }
    }

    private static void addGenre() throws IOException {
        Genre genre = GenreView.getGenreInputs();
        GENRES.add(genre);
        System.out.println("New genre is added");
    }
}
