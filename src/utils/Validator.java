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

    public static int validateYearInput() throws IOException {
        int inputNumber = Integer.parseInt(READER.readLine());
        while (inputNumber < 1000 || inputNumber > 2022) {
            System.out.printf("\"%s\" - not valid!\n", inputNumber);
            System.out.println("Input correct value!: ");
            inputNumber = Integer.parseInt(READER.readLine());
        }
        return inputNumber;
    }

    public static int validateActionNumberInput() throws IOException {
        int actionNumber = Integer.parseInt(READER.readLine());
        while (actionNumber !=1 && actionNumber !=2 && actionNumber!=3 && actionNumber!=4) {
            System.out.printf("\"%s\" - not valid \n", actionNumber);
            System.out.println("Input correct value!: ");
            actionNumber = Integer.parseInt(READER.readLine());
        }
        return actionNumber;

    }
}


