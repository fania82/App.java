package views;
import models.Author;
import models.Book;
import models.Genre;
import utils.Validator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import static controllers.AuthorController.AUTHORS;
import static controllers.GenreController.GENRES;
import static utils.Validator.validateActionNumberInput;

public class BookView {
    static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static Book getBookInputs() throws IOException {
        Book book = new Book();
        System.out.println("Input book title: ");
        book.setName(Validator.validateName());
        System.out.println("Input book description: ");
        book.setDescription(Validator.validateName());
        System.out.println("Input year of book release - valid range from 0 to 2022: ");
        book.setReleaseYear(validateActionNumberInput());

        if (GENRES.isEmpty()) {
            Genre genre = GenreView.getGenreInputs();
            GENRES.add(genre);
            book.setGenre(genre);

        } else {
            System.out.println("Choose a genre: ");
            GenreView.printGenres(GENRES);
            int index = Integer.parseInt(READER.readLine());
            book.setGenre(GENRES.get(index));
        }

        if (AUTHORS.isEmpty()) {
            Author author = AuthorView.getAuthorInputs();
            AUTHORS.add(author);
            book.setAuthor(author);
        } else {
            System.out.println("Choose a Author: ");
            AuthorView.printAuthors(AUTHORS);
            int authorIndex = Integer.parseInt(READER.readLine());
            book.setAuthor(AUTHORS.get(authorIndex));
        }
        return book;
    }

    public static void printBooks(List<Book> BOOKS) {
        int index = 0;
        for (Book printBook : BOOKS) {
            System.out.println((index++) + ": " + printBook);
        }
    }
}
