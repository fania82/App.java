import controllers.AuthorController;
//import controllers.GenreController;
import models.Author;
import models.Book;
import models.Genre;
import views.AuthorView;
import views.BookView;
import views.GenreView;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        Genre genre = new Genre();
        Book book = new Book();
        Author author = new Author();

        GenreView genreView = new GenreView(genre);
        BookView bookView = new BookView(book);
        AuthorView view = new AuthorView(author);

        AuthorController controller = new AuthorController(author, view, genre, genreView, book, bookView);
        controller.runApp();
    }
}
