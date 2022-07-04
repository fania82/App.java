package views;


import models.Author;
import utils.Validator;
import java.io.IOException;

public class AuthorView {

    public static Author getAuthorInputs() throws IOException {
        Author author = new Author();
        System.out.println("Input Author first name: ");
        author.setFirstName(Validator.validateName());
        System.out.println("Input Author last name: ");
        author.setLastName(Validator.validateName());
        return author;
    }
}
