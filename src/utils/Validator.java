package utils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Validator {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static String validateName() throws IOException {
        String str = READER.readLine();
        while (str.isEmpty()) {
            System.out.println("Empty, add value: ");
            str = READER.readLine();
        }
        return str;
    }

    public static Integer validateActionNumberInput() {
        try {
            System.out.println("input number:");
            String str = READER.readLine();
            return Integer.parseInt(str);
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }
        return validateActionNumberInput();
    }
}