package views;

import models.Genre;
import utils.Validator;
import java.io.IOException;
import java.util.List;

public class GenreView {

    public static Genre getGenreInputs() throws IOException {
        Genre genre = new Genre();

        System.out.println("Input name of genre: ");
        genre.setName(Validator.validateName());

        System.out.println("Input description of genre: ");
        genre.setDescription(Validator.validateName());
        return genre;
}
    public static void printGenres(List<Genre> GENRES) {
        int index=0;
        for (Genre genreList : GENRES) {
            System.out.println((index++) + ": " + genreList);
        }
    }

}
