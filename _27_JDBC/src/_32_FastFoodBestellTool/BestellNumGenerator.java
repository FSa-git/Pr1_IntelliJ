package _32_FastFoodBestellTool;

import java.util.Random;

public class BestellNumGenerator {

    private static final String NUMBERS = "0123456789";
    private static final int NUM_DIGITS = 6;

    public static String generateBestellnummer() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        sb.append("#");

        for (int i = 0; i < NUM_DIGITS; i++) {
            int randomIndex = random.nextInt(NUMBERS.length());
            char digit = NUMBERS.charAt(randomIndex);
            sb.append(digit);
        }

        return sb.toString();
    }

}
