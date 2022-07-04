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
    public static List<Book> BOOKS = new ArrayList<>();
    public static List<Genre> GENRES = new ArrayList<>();
    Author author;
    Book book;
    Genre genre;
    AuthorView view;

    BookView bookView;

    GenreView genreView;

    public AuthorController(Author author, AuthorView view, Genre genre, GenreView genreView, Book book, BookView bookView) {
        this.author = author;
        this.book = book;
        this.genre = genre;
        this.view = view;
        this.bookView = bookView;
        this.genreView = genreView;
    }

    public void runApp() throws IOException {
        System.out.println("Choose action: 1 - add genre, 2 - add Author, 3 - add book, 4 - exit");
        int chooseMainAction = validateActionNumberInput();
        while (chooseMainAction != 4) {
            switch (chooseMainAction) {
                case 1:
                    chooseGenreAction();
                case 2:
                    chooseAuthorAction();
                case 3:
                    chooseBookActions();
            }
            System.out.println("Choose action: 1 - add genre, 2 - add Author, 3 - add book, 4 - exit");
            chooseMainAction = Integer.parseInt(READER.readLine());
        }
    }

    private void chooseBookActions() throws IOException {
        System.out.println("Choose action: 1 - Add new book, 2 - delete book, 3 - print all created books, 4 - exit");
        int chooseActionForBooks = validateActionNumberInput();
        while (chooseActionForBooks != 4) {
            switch (chooseActionForBooks) {
                case 1:
                    bookView.getBookInputs();
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

    private void chooseGenreAction() throws IOException {
        System.out.println("Choose action: 1 - Add new genre, 2 - delete genre, 3 - print all created genres, 4 - exit");
        int chooseActionForGenres = validateActionNumberInput();
        while (chooseActionForGenres != 4) {
            switch (chooseActionForGenres) {
                case 1 -> {

                    genreView.getGenreInputs();
                    GENRES.add(genre);
                    System.out.println("New genre is added");
                }
                case 2 -> {
                    BookView.printGenres(GENRES);
                    System.out.println("input index for remove");
                    int removeIndex = Integer.parseInt(READER.readLine());
                    GENRES.remove(removeIndex);
                }
                case 3 -> BookView.printGenres(GENRES);
            }
            System.out.println("Choose action: 1 - Add new genre, 2 - delete genre, 3 - print all created genres, 4 - exit");
            chooseActionForGenres = Integer.parseInt(READER.readLine());
        }
    }

    private void chooseAuthorAction() throws IOException {
        System.out.println("Choose action: 1 - Add new author, 2 - delete an author, 3 - print all created authors, 4 - exit");
        int chooseActionForAuthors = validateActionNumberInput();
        while (chooseActionForAuthors != 4) {

            switch (chooseActionForAuthors) {
                case 1:
                    view.getInputs();
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
