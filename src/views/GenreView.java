package views;

import models.Genre;
import utils.Validator;
import java.io.IOException;

public class GenreView {

    Genre genre;
    String title;
    public GenreView(Genre genre) {
        this.genre = genre;
    }

    public void getGenreInputs() throws IOException {
        title = "Input name of genre: ";
        System.out.println(title);
        genre.setName(Validator.validateName());
        title = "Input description of genre: ";
        System.out.println(title);
        genre.setDescription(Validator.validateName());
}

}
