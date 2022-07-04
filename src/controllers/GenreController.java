package controllers;

import models.Genre;
import views.BookView;
import views.GenreView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static utils.Validator.validateActionNumberInput;
import static views.GenreView.printGenres;

public class GenreController {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static List<Genre> GENRES = new ArrayList<>();

    static void chooseGenreAction() throws IOException {
        System.out.println("Choose action: 1 - Add new genre, 2 - delete genre, 3 - print all created genres, 4 - exit");
        int chooseActionForGenres = validateActionNumberInput();
        while (chooseActionForGenres != 4) {
            switch (chooseActionForGenres) {
                case 1 -> {
                    Genre genre = GenreView.getGenreInputs();
                    GENRES.add(genre);
                    System.out.println("New genre is added");
                }
                case 2 -> {
                    printGenres(GENRES);
                    System.out.println("input index for remove");
                    int removeIndex = Integer.parseInt(READER.readLine());
                    GENRES.remove(removeIndex);
                }
                case 3 -> printGenres(GENRES);
            }
            System.out.println("Choose action: 1 - Add new genre, 2 - delete genre, 3 - print all created genres, 4 - exit");
            chooseActionForGenres = Integer.parseInt(READER.readLine());
        }
    }

}
