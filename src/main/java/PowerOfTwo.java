/*
 * Given an integer, write a function to determine if it is a power of two.
 */

package main.java;

public class PowerOfTwo {

    public static void main(String[] args) {
        int n = 48;
        System.out.println(n + " is power of 2: " + isPowerOfTwo(n));
    }

    private static boolean isPowerOfTwo(int n) { //O(log n) O(1)
        if (n == 1 || n == 2)
            return true;

        while(n > 2) {
            if(n % 2 != 0)
                return false;
            n /= 2;
        }
        return true;
    }

}
