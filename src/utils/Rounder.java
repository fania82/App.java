package utils;

import java.text.DecimalFormat;

public class Rounder {

    public static String performRounding(double value) {
//    return Math.round(value);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(value);
    }
}
