import controllers.MainController;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        MainController controller = new MainController();
        controller.runApp();
    }
}
