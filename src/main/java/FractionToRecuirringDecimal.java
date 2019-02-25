/*
 * Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.
 * If the fractional part is repeating, enclose the repeating part in parentheses.
 * For example,
 * Given numerator = 1, denominator = 2, return "0.5".
 * Given numerator = 2, denominator = 1, return "2".
 * Given numerator = 2, denominator = 3, return "0.(6)".
 */

package main.java;

public class FractionToRecuirringDecimal {

    public static void main(String[] args) {
        int num = 100, den = 6;
        System.out.println("Fraction is: " + getFraction(num, den));
    }

    private static String getFraction(int num, int den) { // O(n) O(n)
        if(den == 0)
            throw new IllegalArgumentException("Input not valid.");

        double fraction = (double)num / den;
        boolean repeat = true;

        String decimal = String.valueOf(fraction);
        String[] parts = decimal.split("\\.");

        char[] arr = parts[1].toCharArray();
        if(arr.length <= 1)
            return decimal;

        for(int i = 0; i < arr.length; i++) {
            if(i + 1 < arr.length) {
                if(arr[i] != arr[i + 1]) {
                    repeat = false;
                    break;
                }
            }
        }
        return (repeat) ? parts[0] + "." +  "(" + arr[0] + ")" : decimal;
    }
}
