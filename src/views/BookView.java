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
import static controllers.AuthorController.GENRES;

public class BookView {
    BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    Book book;
    String title;


    public BookView(Book book) {
        this.book = book;
    }

    public void getBookInputs() throws IOException {
//        book = new Book();
        title = "Input book title: ";
        System.out.println(title);
        book.setName(Validator.validateName());

        title = "Input book description: ";
        System.out.println(title);
        book.setDescription(Validator.validateName());

        title = "Input year of book release - valid range from 0 to 2022: ";
        System.out.println(title);
        book.setReleaseYear(Validator.validateYearInput());

        System.out.println("Choose a genre: ");
        printGenres(GENRES);
        int index = Integer.parseInt(READER.readLine());
        book.setGenre(GENRES.get(index));

        System.out.println("Choose a Author: ");
        printAuthors(AUTHORS);
        int authorIndex = Integer.parseInt(READER.readLine());
        book.setAuthor(AUTHORS.get(authorIndex));

    }
    public static void printGenres(List<Genre> GENRES) {
        int index=0;
        for (Genre genreList : GENRES) {
            System.out.println((index++) + ": " + genreList);
        }
    }
    public static void printAuthors(List<Author> AUTHORS) {
        int index=0;
        for (Author authorList : AUTHORS) {
            System.out.println((index++) + ": " + authorList);
        }
    }

    public static void printBooks(List<Book> BOOKS) {
        int index = 0;
        for (Book printBook : BOOKS) {
            System.out.println((index++) + ": " + printBook);
        }
    }
}
