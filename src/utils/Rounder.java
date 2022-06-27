package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Rounder {

    public static String performRounding(double value) {
//        DecimalFormat decimalFormat = new DecimalFormat("#.##");
//        return decimalFormat.format(value);
        return String.format("%.2f", value);
    }
}
