package controllers;
import java.io.IOException;
import static utils.Validator.validateActionNumberInput;

public class MainController {

    public void runApp() throws IOException {
        printMainAction();
        int chooseMainAction = validateActionNumberInput();
        do {
            switch (chooseMainAction) {
                case 1 -> GenreController.chooseGenreAction();
                case 2 -> AuthorController.chooseAuthorAction();
                case 3 -> BookController.chooseBookActions();
            }
            printMainAction();
            chooseMainAction = validateActionNumberInput();
        } while (chooseMainAction != 4);
    }

    public static void printAction(String str){
        System.out.println("Choose action: 1 - add new " + str + ", 2 - remove exist " +  str + ", 3 - print all " + str + "s, 4 - exit");
    }
    public static void printMainAction(){
        System.out.println("Choose action: 1 - add Genre, 2 - add Author, 3 - add Book, 4 - exit");
    }
}
