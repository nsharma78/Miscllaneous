/*
 * Given a  number n return the nth numbers in fibonacci sequence
 * 0,1,1,2,3,5,8,13,21,34,55.....
 * n = 0 return 0
 * n = 1 return 1
 * n = 2 return 1;
 * n = 3 return 2;
 * n = 8 return 21
 *
 */
package main.java;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("The " + n + "th number in fibonacci sequence is: " + fibIterative(n));
        System.out.println("The " + n + "th number in fibonacci sequence is: " + fibRecursive(n));
    }

    private static int fibIterative(int n) { //O(n) O(1)

        if(n <= 1)
            return n;

        int last = 1;
        int lastLast = 0;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = last + lastLast;
            lastLast = last;
            last = result;
        }

        return result;

    }

    private static int fibRecursive(int n) { //O(2 to power n) O(n)
        if(n <= 1)
            return n;
        else
            return fibRecursive(n -1) + fibRecursive(n - 2);
    }
}
