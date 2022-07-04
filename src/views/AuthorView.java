package views;


import models.Author;
import utils.Validator;
import java.io.IOException;

public class AuthorView {

    Author author;

    public AuthorView(Author author) {
        this.author = author;
    }

    public void getInputs() throws IOException {
        System.out.println("Input Author first name: ");
        author.setFirstName(Validator.validateName());
        System.out.println("Input Author last name: ");
        author.setLastName(Validator.validateName());
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
