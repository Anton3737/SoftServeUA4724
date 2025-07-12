package ND;

public class DigitSumCalculator {
    public static int calculateDigitSum(int number) {
        if (number >= 100 && number <= 999) {
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int units = number % 10;

            return hundreds + tens + units;
        } else {
            throw new IllegalArgumentException("The input number is not a three-digit number.");
        }
    }
}
