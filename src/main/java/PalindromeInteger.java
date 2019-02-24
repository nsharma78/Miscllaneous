/*
 * Determine whether an non negative integer is a palindrome. Do this without extra space.
 */

package main.java;

public class PalindromeInteger {

    public static void main(String[] args) {
        int n = 133331;
        System.out.println(n + " is palindrome: " + isPalindrome(n));
    }

    private static boolean isPalindrome(int n) {
        if (n <= 1)
            return true;

        int div = 1;
        while(n / div >= 10)
            div = div * 10;

        while (n > 0) {
            if( (n / div) != (n % 10) )
                return false;
            n = (n % div) / 10;
            div = div / 100;

        }
        return true;

    }
}
