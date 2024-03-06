package ipa;

public class MathExample {

    public static void main(String[] args) {
        // Absolute value
        double absoluteValue = Math.abs(-10.5);
        System.out.println("Absolute Value: " + absoluteValue);

        // Square root
        double sqrtValue = Math.sqrt(25);
        System.out.println("Square Root: " + sqrtValue);

        // Power (exponentiation)
        double powerValue = Math.pow(2, 3); // 2^3 = 8
        System.out.println("Power: " + powerValue);

        // Trigonometric functions
        double sinValue = Math.sin(Math.PI / 2); // sine of 90 degrees
        System.out.println("Sine: " + sinValue);

        double cosValue = Math.cos(Math.PI); // cosine of 180 degrees
        System.out.println("Cosine: " + cosValue);

        // Rounding
        double roundValue = Math.round(7.9);
        System.out.println("Rounded Value: " + roundValue);

        // Ceiling and floor
        double ceilValue = Math.ceil(5.1);
        System.out.println("Ceiling Value: " + ceilValue);

        double floorValue = Math.floor(5.99);
        System.out.println("Floor Value: " + floorValue);

        // Maximum and minimum
        int maxNum = Math.max(10, 20);
        System.out.println("Maximum: " + maxNum);

        int minNum = Math.min(10, 20);
        System.out.println("Minimum: " + minNum);

        // Random number between 0 (inclusive) and 1 (exclusive)
        double randomValue = Math.random();
        System.out.println("Random Value: " + randomValue);
    }
}

