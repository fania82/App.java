package controllers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static utils.Validator.validateActionNumberInput;

public class MainController {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public void runApp() throws IOException {
        System.out.println("Choose action: 1 - add genre, 2 - add Author, 3 - add book, 4 - exit");
        int chooseMainAction = validateActionNumberInput();
        while (chooseMainAction != 4) {
            switch (chooseMainAction) {
                case 1:
                    GenreController.chooseGenreAction();
                case 2:
                    AuthorController.chooseAuthorAction();
                case 3:
                    BookController.chooseBookActions();
            }
            System.out.println("Choose action: 1 - add genre, 2 - add Author, 3 - add book, 4 - exit");
            chooseMainAction = Integer.parseInt(READER.readLine());
        }
    }
}
