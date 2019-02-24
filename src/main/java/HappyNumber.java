/*
 * Write an algo to determine if a number is happy
 * 19 is a happy number
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 */

package main.java;
import java.util.*;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 103;
        System.out.println(n + " is Happy: " + isHappy(n));
    }

    private static boolean isHappy(int n) {
        if(n == 1)
            return true;
        Set<Integer> set = new HashSet<>();

        while(set.add(n)) {
            n = getSum(n);
            if(n == 1)
                return true;
        }
        return false;
    }

    private static int getSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum = sum + (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }
}
